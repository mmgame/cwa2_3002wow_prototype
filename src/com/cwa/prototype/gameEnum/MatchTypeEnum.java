package com.cwa.prototype.gameEnum;

public enum MatchTypeEnum {
		Match_Noraml(1),//普通副本

		Match_Elite(2),//精英副本
;

	private int value;

	MatchTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static MatchTypeEnum[] enums;
	
	public static MatchTypeEnum getEnum(int index) {
		if(enums==null){
			enums = MatchTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
