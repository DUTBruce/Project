package com.kcsj.sale.dao;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.entity.Customer;

public class CustomerDaoTest extends BaseTest{

	@Autowired
	private CustomerDao customerDao;
	
	@Test
	public void testAddCustomer() throws Exception {
		int customId = 1001;	//
		String name  = "abc";		//
		String phone  = "18700000001";		//这三个不是外键，没有外键约束
		String address  = "大连";
		int insert = customerDao.addCustomer(customId,name,phone,address);
		System.out.println("insert=" + insert);
	}
	
	@Test
	public void testDeleteCustomer() throws Exception {
		int customId = 1001;	//
		int delete = customerDao.deleteCustomer(customId);
		System.out.println("delete=" + delete);
	}
	
	@Test
	public void testGetCustomer() throws Exception {
		int customId = 1001;	//
		Customer customer = customerDao.getCustomer(customId);
		System.out.println(customer.toString());
	}
}
