package com.kcsj.sale.dto;

import com.kcsj.sale.entity.Demand;
import com.kcsj.sale.enums.DemandStateEnum;

/**
 * ��װ������Ա�ڿͻ�������µĽӵ���ִ�к���
 */
public class DemandExecution {

	// �ͻ�ID
	private int  customId;
	
	private int goodsId;
	
	// ��ɱԤԼ���״̬
	private int state;

	// ״̬��ʶ
	private String stateInfo;

	// ԤԼ�ɹ�����
	private Demand demand;

	public DemandExecution() {
	}

	// ԤԼʧ�ܵĹ�����
	public DemandExecution(int customId,int goodsId, DemandStateEnum stateEnum) {
		this.customId = customId;
		this.goodsId = goodsId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// ԤԼ�ɹ��Ĺ�����
	public DemandExecution(int customId,int goodsId,DemandStateEnum stateEnum, Demand demand) {
		this.customId = customId;
		this.goodsId = goodsId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.demand = demand;
	}

	@Override
	public String toString() {
		return "DemandExecution [customId=" + customId + ", goodsId=" + goodsId + ", state=" + state + ", stateInfo="
				+ stateInfo + "]";
	}

	public int getCustomId() {
		return customId;
	}

	public void setCustomId(int customId) {
		this.customId = customId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public Demand getDemand() {
		return demand;
	}

	public void setDemand(Demand demand) {
		this.demand = demand;
	}
	
	// ʡ��getter��setter������toString����
	
}

