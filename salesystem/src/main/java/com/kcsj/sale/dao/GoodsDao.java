package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Goods;

public interface GoodsDao {
	
/**
 * ͨ��ID��ѯ������Ʒ
 * 
 * @param id
 * @return
 */
	Goods queryById(int id);
	
/**
 * ��ѯ������Ʒ
 * 
 * @param offset ��ѯ��ʼλ��
 * @param limit ��ѯ����
 * @return
 */
	List<Goods> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
/**
 * ������Ʒ����
 * 
 * @param goodsId
 * @return ���Ӱ����������>1����ʾ���µļ�¼����
 */
   int reduceNumber(int goodsId);
   /**
    * ��ȡ����Ʒ�Ĺ�Ӧ��
    * @param goodsId
    * @return
    */
   int getSupplyId(@Param("goodsId")int goodsId);
   /**
    * ����µ���Ʒ
    * @param goodsId
    * @param goodsName
    * @param goodsPrice
    * @param goodsAmount
    * @param supplyId
    * @return
    */
   int addGoods(@Param("goodsId")int goodsId,@Param("goodsName")String goodsName,@Param("goodsPrice")double goodsPrice,@Param("goodsAmount")int goodsAmount,@Param("supplyId")int supplyId);
   
}

