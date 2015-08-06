package com.cwa.gameEnum;


public enum HeroTrainStateEnum {
	Train_NoSave(0), // 未保存
	Train_Save(1), // 已保存

	;

	private int value;

	HeroTrainStateEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	private static HeroTrainStateEnum[] enums;

	public static HeroTrainStateEnum getEnum(int index) {
		if (enums == null) {
			enums = HeroTrainStateEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
