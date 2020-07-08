package com.kcsj.sale.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.entity.Saler;
import com.kcsj.sale.entity.User;


public class UserDaoTest extends BaseTest{
	@Autowired
	private UserDao userDao;

	@Test
	public void testIsExistUser() throws Exception {
		int userId = 1;
		int result = userDao.isExistUser(userId);
		System.out.println(result);
	//	System.out.println(appointment.getBook());
	}
	@Test
	public void testInsertUser() throws Exception {
		int userId = 2;
		String password = "nim";
		int type = 1;
		int insert = userDao.addUser(userId, password, type);
		System.out.println(insert);
	//	System.out.println(appointment.getBook());
	}
	@Test
	public void testIsExistSaler() throws Exception {
		int salerId=10010;
		int saler = userDao.isExistSaler(salerId);
		System.out.println(saler);
	//	System.out.println(appointment.getBook());
	}
	@Test
	public void testUpdate() throws Exception {
		int userId = 2;
		String password="aaaa";
		int saler = userDao.updatePassword(userId, password);
		System.out.println(saler);
	//	System.out.println(appointment.getBook());
	}
	
	@Test
	public void testDelete() throws Exception {
		int userId = 2;
		int saler = userDao.deleteUser(userId);
		System.out.println(saler);
	//	System.out.println(appointment.getBook());
	}
}
