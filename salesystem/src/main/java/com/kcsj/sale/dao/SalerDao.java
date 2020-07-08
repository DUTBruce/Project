package com.kcsj.sale.dao;


import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Saler;


public interface SalerDao {

	/**
	 * 插入新的商品
	 * 
	 * @param goodsId
	 * @return 插入的行数
	 */
	int insertGoods(@Param("goodsId") int goodsId,@Param("goodsName") String goodsName,@Param("goodsPrice") double goodsPrice,@Param("goodsAmount") int goodsAmount);
	//这里为什么要给方法的参数添加@Param注解呢？是因为该方法有两个或以上的参数，一定要加，不然mybatis识别不了

	/**
	 * 通过主键查询销售人员的实体
	 * 
	 * @param salerId
	 * @return
	 */
	Saler queryById(@Param("salerId") int salerId);

}
