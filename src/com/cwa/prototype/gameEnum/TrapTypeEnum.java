package com.cwa.prototype.gameEnum;

public enum TrapTypeEnum {
		Trap_Blood(1),//血量影响

		Trap_Energy(2),//魔力影响

		Trap_State(3),//状态
;

	private int value;

	TrapTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static TrapTypeEnum[] enums;
	
	public static TrapTypeEnum getEnum(int index) {
		if(enums==null){
			enums = TrapTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
