package com.kcsj.sale.entity;

import java.util.Date;

public class Contract {
	
	
	private int customId;
	private int goodsId;
	private int salerId;
	private int number;
	private double price;
	private Date time;
	
	
	
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Contract [customId=" + customId + ", goodsId=" + goodsId + ", salerId=" + salerId + ", number=" + number
				+ ", price=" + price + ", time=" + time + "]";
	}
	
}
