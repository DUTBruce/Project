package com.kcsj.sale.dao;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.entity.Saler;


public class SalerDaoTest extends BaseTest {

	@Autowired
	private SalerDao salerDao;

	@Test
	public void testInsertGoods() throws Exception {
		int goodsId = 1000;
		String goodsName = "LOL ÷∞Ï";
		double goodsPrice=999;
		int goodsAmount =1000;
		int insert = salerDao.insertGoods(goodsId, goodsName,goodsPrice,goodsAmount);
		System.out.println("insert=" + insert);
	}

	@Test
	public void testQueryById() throws Exception {
		int salerId = 10010;
		
		Saler saler = salerDao.queryById(salerId);
		System.out.println(saler);
	//	System.out.println(appointment.getBook());
	}

}
