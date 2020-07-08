package com.kcsj.sale.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcsj.sale.dao.DemandDao;
import com.kcsj.sale.dao.GoodsDao;
import com.kcsj.sale.dto.DemandExecution;
import com.kcsj.sale.entity.Demand;
import com.kcsj.sale.entity.Goods;
import com.kcsj.sale.enums.DemandStateEnum;
import com.kcsj.sale.exception.DemandException;
import com.kcsj.sale.exception.OrderDoneException;
import com.kcsj.sale.exception.OrderGetException;
import com.kcsj.sale.service.SalerService;


@Service
public class SalerServiceImpl implements SalerService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private GoodsDao goodsDao;

	@Autowired
	private DemandDao demandDao;

	@Transactional
	/**
	 * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	public DemandExecution demand(int customId, int goodsId) {
		try {
			//查询当前的单子状态
			String state = demandDao.getCurrentState(customId, goodsId);
			if(state.equals("已接单")) {//代表客户需求已经被其他销售人员接单
				//throw new OrderGetException("已经被接单了");
				return new DemandExecution(customId,goodsId,DemandStateEnum.ORDER_GET);
			}
			else if(state.equals("已完成")) {//代表客户需求已经被其他销售人员完成
				//throw new OrderDoneException("已经被完成了");
				return new DemandExecution(customId,goodsId,DemandStateEnum.ORDER_DONE);
			}
			else if(state.equals("未接单")) {//代表客户需求可以被销售人员接单
				state = "已接单";
				demandDao.updateCurrentState(customId, goodsId, state);
				Demand demand = demandDao.queryByKeyWithCustomer(customId, goodsId);
				return new DemandExecution(customId,goodsId,DemandStateEnum.SUCCESS,demand);
			}
		} catch (OrderGetException e1) {// 要先于catch Exception异常前先catch住再抛出，不然自定义的异常也会被转换为DemandException，导致控制层无法具体识别是哪个异常
			throw e1;
		} catch (OrderDoneException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// 所有编译期异常转换为运行期异常
			throw new DemandException("demand inner error:" + e.getMessage());
		}
		return null;
	}
	public Goods getById(int goodsId) {	
		return goodsDao.queryById(goodsId);
	}
	public List<Goods> getList() {
		return goodsDao.queryAll(0, 10);
	}

}

