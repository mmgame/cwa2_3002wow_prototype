package com.cwa.prototype.gameEnum;

public enum VipFunctionEnum {
		VipFunction_BuyPower(1),//购买体力

		VipFunction_RefreshShop(2),//刷新商店

		VipFunction_RefreshMatchCount(3),//重置副本次数
;

	private int value;

	VipFunctionEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static VipFunctionEnum[] enums;
	
	public static VipFunctionEnum getEnum(int index) {
		if(enums==null){
			enums = VipFunctionEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
