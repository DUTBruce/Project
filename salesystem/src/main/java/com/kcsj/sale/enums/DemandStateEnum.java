package com.kcsj.sale.enums;


/**
 * ʹ��ö�ٱ������������ֵ�
 */
public enum DemandStateEnum {

	SUCCESS(1, "�ɹ��ӵ�"),ORDER_GET(0, "�ѱ��ӵ�"), ORDER_DONE(-1, "�Է������"), INNER_ERROR(-2, "ϵͳ�쳣");

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
