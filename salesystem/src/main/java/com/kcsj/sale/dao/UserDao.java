package com.kcsj.sale.dao;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Saler;
import com.kcsj.sale.entity.User;



public interface UserDao {
	
	/**
	 * 注册新的用户账号
	 * @param userId
	 * @param password
	 * @return
	 */
	int addUser(@Param("userId") int userId,@Param("password") String password,@Param("type") int type);
	/**
	 * 看saler表是否存在该号，存在1即可以注册，否则0不能注册
	 * @param salerId
	 * @return
	 */
	int isExistSaler(@Param("salerId") int  salerId);
	/**
	 * 看User表是否存在该用户，存在1则已注册过,
	 * @param userId
	 * @return
	 */
	public int isExistUser(@Param("userId") int userId);
	/**
	 * 根据userId 来更改密码
	 * @param userId
	 * @param password
	 * @return
	 */
	int updatePassword(@Param("userId") int userId,@Param("password") String password);
	/**
	 * 根据userId来注销用户（当开出销售人员调用此）
	 * @param userId
	 * @return
	 */
	int deleteUser(@Param("userId") int userId);
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	User getUser(@Param("userId")int userId);
	
}

