package com.kcsj.sale.service;

import com.kcsj.sale.entity.User;

public interface UserService {

	/**
	 * ��ȡ�û���Ϣ id password type
	 * @param userId
	 * @return
	 */
	public User getUser(int userId);
	/**
	 * ע���˻�
	 * @return
	 */
	public int insertUser(int userId,String password,int type);
	/**
	 * �ж��Ƿ���user����
	 * @return
	 */
	public boolean isExistUser(int userId);
	/**
	 * �ж�saler���Ƿ��д���
	 * @return
	 */
	public boolean isExistSaler(int salerId);
}
