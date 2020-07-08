package com.kcsj.sale.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcsj.sale.dao.UserDao;
import com.kcsj.sale.entity.User;
import com.kcsj.sale.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// ◊¢»ÎService“¿¿µ
	@Autowired
	private UserDao userDao;
	

	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.getUser(userId);
	}



	public int insertUser(int userId, String password, int type) {
		// TODO Auto-generated method stub
		return userDao.addUser(userId, password, type);
	}





	public boolean isExistUser(int userId) {
		// TODO Auto-generated method stub
		return (userDao.isExistUser(userId)==1)?true:false;
	}





	public boolean isExistSaler(int salerId) {
		// TODO Auto-generated method stub
		return (userDao.isExistSaler(salerId)==1)?true:false;
	}

}
