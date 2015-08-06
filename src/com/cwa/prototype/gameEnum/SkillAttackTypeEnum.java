package com.cwa.prototype.gameEnum;

public enum SkillAttackTypeEnum {
		Type_Normal(1),//普攻

		Type_Skill(2),//技能

		Type_SmallSkill(3),//小技能
;

	private int value;

	SkillAttackTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static SkillAttackTypeEnum[] enums;
	
	public static SkillAttackTypeEnum getEnum(int index) {
		if(enums==null){
			enums = SkillAttackTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
