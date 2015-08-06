package com.cwa.prototype.gameEnum;

public enum SkillReleaseTypeEnum {
		Release_Instant(1),//瞬发技能

		Release_Reading(2),//读条技能

		Release_Singing(3),//吟唱技能
;

	private int value;

	SkillReleaseTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static SkillReleaseTypeEnum[] enums;
	
	public static SkillReleaseTypeEnum getEnum(int index) {
		if(enums==null){
			enums = SkillReleaseTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
