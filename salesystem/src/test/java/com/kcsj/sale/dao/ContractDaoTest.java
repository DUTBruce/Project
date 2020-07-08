package com.kcsj.sale.dao;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.entity.Contract;

public class ContractDaoTest extends BaseTest{

	@Autowired
	private ContractDao contractDao;
	
	@Test
	public void testAddContratct() throws Exception {
		int customId = 1001;	//
		int goodsId  = 0;		//
		int salerId  = 100;		//这三个不是外键，没有外键约束
		int number = 10;
		double price = 100.1;
		Date time = Calendar.getInstance().getTime();
		int insert = contractDao.addContract(customId,goodsId,salerId,number,price,time);
		System.out.println("insert=" + insert);
	}
	
	@Test
	public void testDeleteContratct() throws Exception {
		int customId = 1001;	//
		int goodsId  = 0;		//
		int salerId  = 100;		//这三个不是外键，没有外键约束
		int delete = contractDao.deleteContract(customId,goodsId,salerId);
		System.out.println("delete=" + delete);
	}
	
	@Test
	public void testGetContratct() throws Exception {
		int customId = 1001;	//
		int goodsId  = 0;		//
		int salerId  = 100;		//这三个不是外键，没有外键约束
		Contract contract = contractDao.getContract(customId,goodsId,salerId);
		System.out.println(contract.toString());
	}
}
