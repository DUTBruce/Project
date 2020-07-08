package com.kcsj.sale.entity;

public class SaleTask {
	
	private int customId;
	private int goodsId;
	private int salerId;
	private int phase;
	
	private Customer customer;
	private Goods goods;
	private Saler saler;
	
	
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
	public int getSalerId() {
		return salerId;
	}
	public void setSalerId(int salerId) {
		this.salerId = salerId;
	}
	public int getPhase() {
		return phase;
	}
	public void setPhase(int phase) {
		this.phase = phase;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Saler getSaler() {
		return saler;
	}
	public void setSaler(Saler saler) {
		this.saler = saler;
	}
	@Override
	public String toString() {
		return "SaleTask [customId=" + customId + ", goodsId=" + goodsId + ", salerId=" + salerId + ", phase=" + phase
				+ "]";
	}
	
	
	
	
	
}
