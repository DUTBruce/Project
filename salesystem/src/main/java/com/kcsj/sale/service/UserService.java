package com.kcsj.sale.service;

import com.kcsj.sale.entity.User;

public interface UserService {

	/**
	 * 获取用户信息 id password type
	 * @param userId
	 * @return
	 */
	public User getUser(int userId);
	/**
	 * 注册账户
	 * @return
	 */
	public int insertUser(int userId,String password,int type);
	/**
	 * 判断是否在user表里
	 * @return
	 */
	public boolean isExistUser(int userId);
	/**
	 * 判断saler表是否有此人
	 * @return
	 */
	public boolean isExistSaler(int salerId);
}
