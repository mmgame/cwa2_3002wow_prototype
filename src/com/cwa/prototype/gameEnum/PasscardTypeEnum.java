package com.cwa.prototype.gameEnum;

public enum PasscardTypeEnum {
		Passcard_Noraml(1),//普通关卡

		Passcard_Once(2),//一次性关卡

		Passcard_Conceal(3),//隐藏关卡
;

	private int value;

	PasscardTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static PasscardTypeEnum[] enums;
	
	public static PasscardTypeEnum getEnum(int index) {
		if(enums==null){
			enums = PasscardTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
