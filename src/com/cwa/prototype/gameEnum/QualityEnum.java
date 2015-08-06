package com.cwa.prototype.gameEnum;

public enum QualityEnum {
		Quality_Green(1),//绿

		Quality_Blue(2),//蓝

		Quality_Purple(3),//紫

		Quality_Orange(4),//橙

		Quality_Red(5),//红

		Quality_Dark(6),//黑
;

	private int value;

	QualityEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static QualityEnum[] enums;
	
	public static QualityEnum getEnum(int index) {
		if(enums==null){
			enums = QualityEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
