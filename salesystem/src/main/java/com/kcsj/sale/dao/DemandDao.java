package com.kcsj.sale.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kcsj.sale.entity.Customer;
import com.kcsj.sale.entity.Demand;


public interface DemandDao {

	/**
	 * ����µĿͻ�����
	 * 
	 * @param customId
	 * @param goodsId
	 * @param goodsName
	 * @param currentState
	 * @return ���������
	 */
	int insertDemand(@Param("customId") int customId, @Param("goodsId") int goodsId, @Param("goodsName") String goodsName, @Param("currentState") String currentState);

	/**
	 * ͨ��������ѯ�ͻ����󲢷��ؿͻ�ʵ��
	 * 
	 * @param customId
	 * @param goodsId
	 * @return
	 */
	 Demand queryByKeyWithCustomer(@Param("customId") int customId, @Param("goodsId") int goodsId);
	 /**
	  * ͨ��������ѯ�ͻ����󵥵Ľӵ�״̬
	 * 
	 * @param customId
	 * @param goodsId
	 * @return
	 */
	 String getCurrentState(@Param("customId") int customId, @Param("goodsId") int goodsId);
	 
	 /**
	  * �޸Ķ�Ӧ�ͻ����󵥵�״̬
	 * 
	 * @param customId
	 * @param goodsId
	 * @return
	 */
	 void updateCurrentState(@Param("customId") int customId, @Param("goodsId") int goodsId,@Param("currentState") String currentState);
	 /**
	  * ��ȡȫ������
	  * @return
	  */
	 List<Demand> getAllDemand();
	 
	 int deleteDemand(@Param("customId") int customId, @Param("goodsId") int goodsId);
}
