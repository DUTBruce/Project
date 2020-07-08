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

	// ע��Service����
	@Autowired
	private GoodsDao goodsDao;

	@Autowired
	private DemandDao demandDao;

	@Transactional
	/**
	 * ʹ��ע��������񷽷����ŵ㣺 1.�����ŶӴ��һ��Լ������ȷ��ע���񷽷��ı�̷��
	 * 2.��֤���񷽷���ִ��ʱ�価���̣ܶ���Ҫ�����������������RPC/HTTP������߰��뵽���񷽷��ⲿ
	 * 3.�������еķ�������Ҫ������ֻ��һ���޸Ĳ�����ֻ����������Ҫ�������
	 */
	public DemandExecution demand(int customId, int goodsId) {
		try {
			//��ѯ��ǰ�ĵ���״̬
			String state = demandDao.getCurrentState(customId, goodsId);
			if(state.equals("�ѽӵ�")) {//����ͻ������Ѿ�������������Ա�ӵ�
				//throw new OrderGetException("�Ѿ����ӵ���");
				return new DemandExecution(customId,goodsId,DemandStateEnum.ORDER_GET);
			}
			else if(state.equals("�����")) {//����ͻ������Ѿ�������������Ա���
				//throw new OrderDoneException("�Ѿ��������");
				return new DemandExecution(customId,goodsId,DemandStateEnum.ORDER_DONE);
			}
			else if(state.equals("δ�ӵ�")) {//����ͻ�������Ա�������Ա�ӵ�
				state = "�ѽӵ�";
				demandDao.updateCurrentState(customId, goodsId, state);
				Demand demand = demandDao.queryByKeyWithCustomer(customId, goodsId);
				return new DemandExecution(customId,goodsId,DemandStateEnum.SUCCESS,demand);
			}
		} catch (OrderGetException e1) {// Ҫ����catch Exception�쳣ǰ��catchס���׳�����Ȼ�Զ�����쳣Ҳ�ᱻת��ΪDemandException�����¿��Ʋ��޷�����ʶ�����ĸ��쳣
			throw e1;
		} catch (OrderDoneException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// ���б������쳣ת��Ϊ�������쳣
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

