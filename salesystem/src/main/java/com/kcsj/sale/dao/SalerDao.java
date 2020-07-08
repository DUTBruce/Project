package com.kcsj.sale.dao;


import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Saler;


public interface SalerDao {

	/**
	 * �����µ���Ʒ
	 * 
	 * @param goodsId
	 * @return ���������
	 */
	int insertGoods(@Param("goodsId") int goodsId,@Param("goodsName") String goodsName,@Param("goodsPrice") double goodsPrice,@Param("goodsAmount") int goodsAmount);
	//����ΪʲôҪ�������Ĳ������@Paramע���أ�����Ϊ�÷��������������ϵĲ�����һ��Ҫ�ӣ���Ȼmybatisʶ����

	/**
	 * ͨ��������ѯ������Ա��ʵ��
	 * 
	 * @param salerId
	 * @return
	 */
	Saler queryById(@Param("salerId") int salerId);

}
