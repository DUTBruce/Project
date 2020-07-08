package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Customer;

public interface CustomerDao {
	/**
	 * ���ӿͻ�
	 * @param customId
	 * @param customName
	 * @param customPhone
	 * @param customAddr
	 * @return
	 */
	int addCustomer(@Param("customId")int customId,@Param("customName")String customName,@Param("customPhone")String customPhone ,@Param("customAddr") String customAddr );
	
	/**
	 * ɾ���ͻ�
	 * @param customId
	 * @return
	 */
	int deleteCustomer(@Param("customId")int customId);
	
	void updateCustomer(@Param("customId")int customId,@Param("customName")String customName,@Param("customPhone")String customPhone ,@Param("customAddr") String customAddr );
	/**
	 * �õ�һ���ͻ�����Ϣ
	 * @param customId
	 * @return
	 */
	Customer getCustomer(@Param("customId")int customId);
	
	/**
	 * ��ȡȫ���ͻ�
	 * @return
	 */
	List<Customer> getAllCustomer();
	
	
	
	
	
}
