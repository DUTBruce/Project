package com.kcsj.sale.entity;

public class Saler {
	private int salerId;
	private String salerName;
	private long salerPhone;
	
	private Goods goods;

	

	@Override
	public String toString() {
		return "Saler [salerId=" + salerId + ", salerName=" + salerName + ", salerPhone=" + salerPhone + "]";
	}

	public int getSalerId() {
		return salerId;
	}

	public void setSalerId(int salerId) {
		this.salerId = salerId;
	}

	public String getSalerName() {
		return salerName;
	}

	public void setSalerName(String salerName) {
		this.salerName = salerName;
	}

	public long getSalerPhone() {
		return salerPhone;
	}

	public void setSalerPhone(long salerPhone) {
		this.salerPhone = salerPhone;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
}
