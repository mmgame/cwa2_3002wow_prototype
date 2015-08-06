package com.cwa.prototype.gameEnum;

public enum AssiveSkillEnum {
		AssiveSkill_Yes(1),//是被动技能

		AssiveSkill_No(2),//不是被动技能是buff
;

	private int value;

	AssiveSkillEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static AssiveSkillEnum[] enums;
	
	public static AssiveSkillEnum getEnum(int index) {
		if(enums==null){
			enums = AssiveSkillEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
