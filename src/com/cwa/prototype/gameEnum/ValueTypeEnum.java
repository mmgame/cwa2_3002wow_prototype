package com.cwa.prototype.gameEnum;

public enum ValueTypeEnum {
		Value_Num(1),//数值类型

		Value_Percent(2),//百分比
;

	private int value;

	ValueTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static ValueTypeEnum[] enums;
	
	public static ValueTypeEnum getEnum(int index) {
		if(enums==null){
			enums = ValueTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
