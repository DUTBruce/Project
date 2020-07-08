package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.SaleTask;

public interface SaleTaskDao {
	/**
	 * 增添新的销售进度任务
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	int addSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId,@Param("phase")int phase);
	/**
	 * 根据主键获得销售进度任务
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	SaleTask getSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
	/**
	 * 获取全部销售进度任务
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	List<SaleTask> getAllSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
	/**
	 * 删除销售任务
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @return
	 */
	int deleteSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId);
	/**
	 * 更新销售任务
	 * @param customId
	 * @param goodsId
	 * @param salerId
	 * @param phase
	 */
	void updateSaleTask(@Param("customId") int customId,@Param("goodsId") int goodsId,@Param("saleId") int salerId,@Param("phase")int phase);
}
