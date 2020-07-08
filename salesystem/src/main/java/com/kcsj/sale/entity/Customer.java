package com.kcsj.sale.entity;

public class Customer {
	private int customId;
	private String customName;
	private String customPhon;
	private String customAddr;
	
	
	public int getCustomId() {
		return customId;
	}
	public void setCustomId(int customId) {
		this.customId = customId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getCustomPhon() {
		return customPhon;
	}
	public void setCustomPhon(String customPhon) {
		this.customPhon = customPhon;
	}
	public String getCustomAddr() {
		return customAddr;
	}
	public void setCustomAddr(String customAddr) {
		this.customAddr = customAddr;
	}
	@Override
	public String toString() {
		return "Customer [customId=" + customId + ", customName=" + customName + ", customPhon=" + customPhon
				+ ", customAddr=" + customAddr + "]";
	}
	
}
