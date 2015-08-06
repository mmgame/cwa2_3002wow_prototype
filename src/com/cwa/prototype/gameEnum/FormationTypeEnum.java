package com.cwa.prototype.gameEnum;

public enum FormationTypeEnum {
		Formation_Arena(1),//竞技场防守

		Formation_Copy(2),//挂机副本
;

	private int value;

	FormationTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static FormationTypeEnum[] enums;
	
	public static FormationTypeEnum getEnum(int index) {
		if(enums==null){
			enums = FormationTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
