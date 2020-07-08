package com.kcsj.sale.enums;


/**
 * 使用枚举表述常量数据字典
 */
public enum DemandStateEnum {

	SUCCESS(1, "成功接单"),ORDER_GET(0, "已被接单"), ORDER_DONE(-1, "对方已完成"), INNER_ERROR(-2, "系统异常");

	private int state;

	private String stateInfo;

	private DemandStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static DemandStateEnum stateOf(int index) {
		for (DemandStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
