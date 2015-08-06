package com.cwa.prototype.gameEnum;

public enum DeBuffResistanceEnum {
		DeBuff_Poison(1),//中毒

		DeBuff_Paralysis(2),//麻痹

		DeBuff_Vertigo(3),//眩晕

		DeBuff_Sleep(4),//睡眠

		DeBuff_NoSpeek(5),//沉默

		DeBuff_Curse(6),//诅咒

		DeBuff_NoMove(7),//定身

		DeBuff_Stone(8),//石化

		DeBuff_Hatred(9),//仇恨

		DeBuff_SevenAttr(10),//7属性

		DeBuff_SevenResistance(11),//7耐性

		DeBuff_SevenElement(12),//7元素专精
;

	private int value;

	DeBuffResistanceEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static DeBuffResistanceEnum[] enums;
	
	public static DeBuffResistanceEnum getEnum(int index) {
		if(enums==null){
			enums = DeBuffResistanceEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
