package com.kcsj.sale.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.entity.Demand;


public class DemandDaoTest extends BaseTest {

	@Autowired
	private DemandDao demandDao;

	@Test
	public void testInsertDemand() throws Exception {
		int customId = 1003;
		int goodsId  = 2;
		String goodsName = "手机";
		String currentState = "未接单";
		int insert = demandDao.insertDemand(customId,goodsId,goodsName,currentState);
		System.out.println("insert=" + insert);
	}

	@Test
	public void testQueryByKeyWithCustomer() throws Exception {
		int customId = 1002;
		int goodsId = 5;
		Demand demand = demandDao.queryByKeyWithCustomer(customId, goodsId);
		System.out.println(demand);
		System.out.println(demand.getCustomer());
	}

}
