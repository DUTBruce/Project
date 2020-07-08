package com.kcsj.sale.service;


import java.util.List;

import com.kcsj.sale.dto.DemandExecution;
import com.kcsj.sale.entity.Goods;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface SalerService {

	/**
	 * 查询一个商品
	 * 
	 * @param bookId
	 * @return
	 */
	Goods getById(int goodsId);

	/**
	 * 查询所有商品
	 * 
	 * @return
	 */
	List<Goods> getList();

	/**
	 * 接单
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	DemandExecution demand(int customId, int goodsId);

}
