package com.cwa.prototype.gameEnum;

public enum SkillReleaseRuleEnum {
		Release_League(1),//射程内己方英雄

		Release_Enemy(2),//射程内敌方英雄

		Release_Area(3),//射程内任意地点
;

	private int value;

	SkillReleaseRuleEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static SkillReleaseRuleEnum[] enums;
	
	public static SkillReleaseRuleEnum getEnum(int index) {
		if(enums==null){
			enums = SkillReleaseRuleEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
