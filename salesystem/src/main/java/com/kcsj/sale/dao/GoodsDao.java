package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Goods;

public interface GoodsDao {
	
/**
 * 通过ID查询单个商品
 * 
 * @param id
 * @return
 */
	Goods queryById(int id);
	
/**
 * 查询所有商品
 * 
 * @param offset 查询起始位置
 * @param limit 查询条数
 * @return
 */
	List<Goods> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
/**
 * 减少商品数量
 * 
 * @param goodsId
 * @return 如果影响行数等于>1，表示更新的记录行数
 */
   int reduceNumber(int goodsId);
   /**
    * 获取该商品的供应商
    * @param goodsId
    * @return
    */
   int getSupplyId(@Param("goodsId")int goodsId);
   /**
    * 添加新的商品
    * @param goodsId
    * @param goodsName
    * @param goodsPrice
    * @param goodsAmount
    * @param supplyId
    * @return
    */
   int addGoods(@Param("goodsId")int goodsId,@Param("goodsName")String goodsName,@Param("goodsPrice")double goodsPrice,@Param("goodsAmount")int goodsAmount,@Param("supplyId")int supplyId);
   
}

