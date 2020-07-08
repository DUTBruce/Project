package com.kcsj.sale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Customer;

public interface CustomerDao {
	/**
	 * 增加客户
	 * @param customId
	 * @param customName
	 * @param customPhone
	 * @param customAddr
	 * @return
	 */
	int addCustomer(@Param("customId")int customId,@Param("customName")String customName,@Param("customPhone")String customPhone ,@Param("customAddr") String customAddr );
	
	/**
	 * 删除客户
	 * @param customId
	 * @return
	 */
	int deleteCustomer(@Param("customId")int customId);
	
	void updateCustomer(@Param("customId")int customId,@Param("customName")String customName,@Param("customPhone")String customPhone ,@Param("customAddr") String customAddr );
	/**
	 * 得到一个客户的信息
	 * @param customId
	 * @return
	 */
	Customer getCustomer(@Param("customId")int customId);
	
	/**
	 * 获取全部客户
	 * @return
	 */
	List<Customer> getAllCustomer();
	
	
	
	
	
}
