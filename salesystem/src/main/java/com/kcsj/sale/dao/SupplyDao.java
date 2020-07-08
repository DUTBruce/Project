package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Supply;

public interface SupplyDao {
	/**
	 * 增添新的供应商（注意与goods的关系）
	 * @param supplyId
	 * @param supplyName
	 * @param goodsId
	 * @param goodsName
	 * @return
	 */
	int addSupply(@Param("supplyId")int supplyId,@Param("supplyName")String supplyName,@Param("goodsId")int goodsId,@Param("goodsName")String goodsName);
	/**
	 * 根据主键删除供应商
	 * @param supplyId
	 * @return
	 */
	int deleteSupply(@Param("supplyId")int supplyId);
	/**
	 * 根据主键获取一个供应商
	 * @param supplyId
	 * @return
	 */
	Supply getSupply(@Param("supplyId")int supplyId);
	/**
	 * 获取全部的供应商
	 * @return
	 */
	List<Supply> getAllSupply();
	/**
	 * 修改供应商(应该注意修改goodsid的时候)
	 * @param supplyId
	 * @param supplyName
	 * @param goodsId
	 * @param goodsName
	 */
	void updateSupply(@Param("supplyId")int supplyId,@Param("supplyName")String supplyName,@Param("goodsId")int goodsId,@Param("goodsName")String goodsName);
}
