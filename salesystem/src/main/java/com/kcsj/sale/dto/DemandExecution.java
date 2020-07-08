package com.kcsj.sale.dto;

import com.kcsj.sale.entity.Demand;
import com.kcsj.sale.enums.DemandStateEnum;

/**
 * 封装销售人员在客户需求表下的接单后执行后结果
 */
public class DemandExecution {

	// 客户ID
	private int  customId;
	
	private int goodsId;
	
	// 秒杀预约结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	// 预约成功对象
	private Demand demand;

	public DemandExecution() {
	}

	// 预约失败的构造器
	public DemandExecution(int customId,int goodsId, DemandStateEnum stateEnum) {
		this.customId = customId;
		this.goodsId = goodsId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// 预约成功的构造器
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
	
	// 省略getter和setter方法，toString方法
	
}

