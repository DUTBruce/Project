package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.SaleTask;

public interface SaleTaskDao {
	/**
	 * �����µ����۽�������
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	int addSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId,@Param("phase")int phase);
	/**
	 * ��������������۽�������
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	SaleTask getSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
	/**
	 * ��ȡȫ�����۽�������
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	List<SaleTask> getAllSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
	/**
	 * ɾ����������
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	int deleteSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
	/**
	 * ������������
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @param phase
	 */
	void updateSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId,@Param("phase")int phase);
}
