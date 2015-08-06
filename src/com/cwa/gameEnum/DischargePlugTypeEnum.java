package com.cwa.gameEnum;

public enum DischargePlugTypeEnum {
	DischargePlug_ByItem(1), // 用道具一键卸下
	DischargePlug_ByMoney(2), // 用货币一键卸下

	;

	private int value;

	DischargePlugTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	private static DischargePlugTypeEnum[] enums;

	public static DischargePlugTypeEnum getEnum(int index) {
		if (enums == null) {
			enums = DischargePlugTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
