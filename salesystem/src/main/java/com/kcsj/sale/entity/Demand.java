package com.kcsj.sale.entity;

public class Demand {
	private int customId;
	private int goodsId;
	private String goodsName;
	private String currentState;
	private int salerId;
	
	private Goods goods;
	private Customer customer;
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
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public int getSalerId() {
		return salerId;
	}
	public void setSalerId(int salerId) {
		this.salerId = salerId;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Demand [customId=" + customId + ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", currentState="
				+ currentState + ", salerId=" + salerId + "]";
	}
	
	
	
	
	
	
	
}
