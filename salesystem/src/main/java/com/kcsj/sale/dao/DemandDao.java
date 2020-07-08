package com.kcsj.sale.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Customer;
import com.kcsj.sale.entity.Demand;


public interface DemandDao {

	/**
	 * 添加新的客户需求
	 * 
	 * @param customId
	 * @param goodsId
	 * @param goodsName
	 * @param currentState
	 * @return 插入的行数
	 */
	int insertDemand(@Param("customId") int customId, @Param("goodsId") int goodsId, @Param("goodsName") String goodsName, @Param("currentState") String currentState);

	/**
	 * 通过主键查询客户需求并返回客户实体
	 * 
	 * @param customId
	 * @param goodsId
	 * @return
	 */
	 Demand queryByKeyWithCustomer(@Param("customId") int customId, @Param("goodsId") int goodsId);
	 /**
	  * 通过主键查询客户需求单的接单状态
	 * 
	 * @param customId
	 * @param goodsId
	 * @return
	 */
	 String getCurrentState(@Param("customId") int customId, @Param("goodsId") int goodsId);
	 
	 /**
	  * 修改对应客户需求单的状态
	 * 
	 * @param customId
	 * @param goodsId
	 * @return
	 */
	 void updateCurrentState(@Param("customId") int customId, @Param("goodsId") int goodsId,@Param("currentState") String currentState);
	 /**
	  * 获取全部需求单
	  * @return
	  */
	 List<Demand> getAllDemand();
	 
	 int deleteDemand(@Param("customId") int customId, @Param("goodsId") int goodsId);
}
