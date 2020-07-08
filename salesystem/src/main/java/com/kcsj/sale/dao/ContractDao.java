package com.kcsj.sale.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Contract;

public interface ContractDao {
		/**
		 * �����ͬ��¼
		 * @param customId
		 * @param goodsId
		 * @param salerId
		 * @param number
		 * @param price
		 * @param time
		 * @return
		 */
		int addContract(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId,@Param("number") int number,@Param("price") double price,@Param("time") Date time);
		
		/**
		 * ɾ����ͬ��¼
		 * @param customId
		 * @param goodsId
		 * @param salerId
		 * @return
		 */
		int deleteContract(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
		
		/**
		 * �޸ĺ�ͬ��¼������Ҫ��
		 * @param customId
		 * @param goodsId
		 * @param salerId
		 */
		//void updateContract(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId,@Param("number") int number,@Param("price") double price,@Param("time") Date time);
		
		/**
		 * ����������ѯ��ͬ
		 * @param customId
		 * @param goodsId
		 * @param salerId
		 * @return
		 */
		Contract getContract(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
		
		/**
		 * ��ȡȫ����ͬ
		 * @param customId
		 * @param goodsId
		 * @param salerId
		 * @return
		 */
		List<Contract> getAllContract(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
}
