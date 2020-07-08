package com.kcsj.sale.service.impl;


import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.dto.DemandExecution;
import com.kcsj.sale.service.SalerService;

public class DemandServiceImplTest extends BaseTest {

	@Autowired
	private SalerService salerService;

	@Test
	public void testDemand() throws Exception {
		int customId = 1002;
		int goodsId = 5;
		DemandExecution execution = salerService.demand(customId, goodsId);
		System.out.println(execution);
	}

}

