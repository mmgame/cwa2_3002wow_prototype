package com.cwa.prototype.gameEnum;

public enum FunctionTypeEnum {
		Function_Retinue(1),//侍从功能
;

	private int value;

	FunctionTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static FunctionTypeEnum[] enums;
	
	public static FunctionTypeEnum getEnum(int index) {
		if(enums==null){
			enums = FunctionTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
