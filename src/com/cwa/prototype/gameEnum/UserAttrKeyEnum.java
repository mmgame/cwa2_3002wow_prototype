package com.cwa.prototype.gameEnum;

public enum UserAttrKeyEnum {
		Lucky_Type(1),//幸运值

		Current_State(2),//当前状态

		Hero_Exp(3),//英雄经验
;

	private int value;

	UserAttrKeyEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static UserAttrKeyEnum[] enums;
	
	public static UserAttrKeyEnum getEnum(int index) {
		if(enums==null){
			enums = UserAttrKeyEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
