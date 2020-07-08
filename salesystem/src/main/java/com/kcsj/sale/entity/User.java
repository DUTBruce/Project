package com.kcsj.sale.entity;

public class User {
	
	
	private int userId;
	private String password;
	private int type;
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", type=" + type + "]";
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
