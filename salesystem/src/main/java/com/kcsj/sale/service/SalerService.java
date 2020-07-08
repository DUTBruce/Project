package com.kcsj.sale.service;


import java.util.List;

import com.kcsj.sale.dto.DemandExecution;
import com.kcsj.sale.entity.Goods;

/**
 * ҵ��ӿڣ�վ��"ʹ����"�Ƕ���ƽӿ� �������棺�����������ȣ��������������ͣ�return ����/�쳣��
 */
public interface SalerService {

	/**
	 * ��ѯһ����Ʒ
	 * 
	 * @param bookId
	 * @return
	 */
	Goods getById(int goodsId);

	/**
	 * ��ѯ������Ʒ
	 * 
	 * @return
	 */
	List<Goods> getList();

	/**
	 * �ӵ�
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	DemandExecution demand(int customId, int goodsId);

}
