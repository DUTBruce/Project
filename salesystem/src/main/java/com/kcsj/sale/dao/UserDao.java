package com.kcsj.sale.dao;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Saler;
import com.kcsj.sale.entity.User;



public interface UserDao {
	
	/**
	 * ע���µ��û��˺�
	 * @param userId
	 * @param password
	 * @return
	 */
	int addUser(@Param("userId") int userId,@Param("password") String password,@Param("type") int type);
	/**
	 * ��saler���Ƿ���ڸúţ�����1������ע�ᣬ����0����ע��
	 * @param salerId
	 * @return
	 */
	int isExistSaler(@Param("salerId") int  salerId);
	/**
	 * ��User���Ƿ���ڸ��û�������1����ע���,
	 * @param userId
	 * @return
	 */
	public int isExistUser(@Param("userId") int userId);
	/**
	 * ����userId ����������
	 * @param userId
	 * @param password
	 * @return
	 */
	int updatePassword(@Param("userId") int userId,@Param("password") String password);
	/**
	 * ����userId��ע���û���������������Ա���ôˣ�
	 * @param userId
	 * @return
	 */
	int deleteUser(@Param("userId") int userId);
	/**
	 * ��ȡ�û���Ϣ
	 * @param userId
	 * @return
	 */
	User getUser(@Param("userId")int userId);
	
}

