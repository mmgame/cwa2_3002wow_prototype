package com.cwa.prototype.gameEnum;

public enum ShopTypeEnum {
		Shop_Noraml(1),//普通商店

		Shop_Advanced(2),//高级商店

		Shop_Highest(3),//极品商店
;

	private int value;

	ShopTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static ShopTypeEnum[] enums;
	
	public static ShopTypeEnum getEnum(int index) {
		if(enums==null){
			enums = ShopTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
