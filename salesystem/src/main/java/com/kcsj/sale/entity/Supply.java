package com.kcsj.sale.entity;

public class Supply {

	private int supplyId;
	private String supplyName;
	private int goodsId;
	private String goodsName;
	
	
	@Override
	public String toString() {
		return "Supply [supplyId=" + supplyId + ", supplyName=" + supplyName + ", goodsId=" + goodsId + ", goodsName="
				+ goodsName + "]";
	}


	public int getSupplyId() {
		return supplyId;
	}


	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}


	public String getSupplyName() {
		return supplyName;
	}


	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
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
	
	
	
	
	
	
}
