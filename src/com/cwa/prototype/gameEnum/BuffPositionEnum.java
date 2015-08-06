package com.cwa.prototype.gameEnum;

public enum BuffPositionEnum {
		Buff_OwnTop(1),//上方

		Buff_OwnBelow(2),//下方

		Buff_OwnFront(3),//身前

		Buff_OwnBack(4),//身后

		Buff_OwnBody(5),//身上
;

	private int value;

	BuffPositionEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static BuffPositionEnum[] enums;
	
	public static BuffPositionEnum getEnum(int index) {
		if(enums==null){
			enums = BuffPositionEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
