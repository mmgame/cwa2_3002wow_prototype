package com.cwa.prototype.gameEnum;

public enum BattleTypeEnum {
		Battle_PVP(1),//PVP

		Battle_PVE(2),//PVE
;

	private int value;

	BattleTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static BattleTypeEnum[] enums;
	
	public static BattleTypeEnum getEnum(int index) {
		if(enums==null){
			enums = BattleTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
