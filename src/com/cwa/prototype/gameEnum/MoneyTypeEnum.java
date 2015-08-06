package com.cwa.prototype.gameEnum;

public enum MoneyTypeEnum {
		Money_Gold(10000001),//金币

		Money_Diamond(10000002),//钻石

		Money_Coupon(10000003),//金券
;

	private int value;

	MoneyTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static MoneyTypeEnum[] enums;
	
	public static MoneyTypeEnum getEnum(int index) {
		if(enums==null){
			enums = MoneyTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
