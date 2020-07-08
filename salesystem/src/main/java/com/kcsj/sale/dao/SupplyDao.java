package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Supply;

public interface SupplyDao {
	/**
	 * �����µĹ�Ӧ�̣�ע����goods�Ĺ�ϵ��
	 * @param supplyId
	 * @param supplyName
	 * @param goodsId
	 * @param goodsName
	 * @return
	 */
	int addSupply(@Param("supplyId")int supplyId,@Param("supplyName")String supplyName,@Param("goodsId")int goodsId,@Param("goodsName")String goodsName);
	/**
	 * ��������ɾ����Ӧ��
	 * @param supplyId
	 * @return
	 */
	int deleteSupply(@Param("supplyId")int supplyId);
	/**
	 * ����������ȡһ����Ӧ��
	 * @param supplyId
	 * @return
	 */
	Supply getSupply(@Param("supplyId")int supplyId);
	/**
	 * ��ȡȫ���Ĺ�Ӧ��
	 * @return
	 */
	List<Supply> getAllSupply();
	/**
	 * �޸Ĺ�Ӧ��(Ӧ��ע���޸�goodsid��ʱ��)
	 * @param supplyId
	 * @param supplyName
	 * @param goodsId
	 * @param goodsName
	 */
	void updateSupply(@Param("supplyId")int supplyId,@Param("supplyName")String supplyName,@Param("goodsId")int goodsId,@Param("goodsName")String goodsName);
}
