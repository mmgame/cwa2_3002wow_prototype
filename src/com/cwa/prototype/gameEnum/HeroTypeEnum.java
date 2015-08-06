package com.cwa.prototype.gameEnum;

public enum HeroTypeEnum {
		TYPE_Melee_Hero(1),//近战

		Type_Remote_Hero(2),//远程

		Type_Treatment_Hero(3),//治疗
;

	private int value;

	HeroTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static HeroTypeEnum[] enums;
	
	public static HeroTypeEnum getEnum(int index) {
		if(enums==null){
			enums = HeroTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
