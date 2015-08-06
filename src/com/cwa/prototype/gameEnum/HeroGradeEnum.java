package com.cwa.prototype.gameEnum;

public enum HeroGradeEnum {
		Grade_Normal(1),//普通

		Grade_Senior(2),//高级

		Grade_Elite(3),//精英

		Grade_Legend(4),//传说
;

	private int value;

	HeroGradeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static HeroGradeEnum[] enums;
	
	public static HeroGradeEnum getEnum(int index) {
		if(enums==null){
			enums = HeroGradeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
