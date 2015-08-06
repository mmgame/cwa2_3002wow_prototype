package com.cwa.prototype.gameEnum;

public enum DropEnum {
		Drop_Item(2),//道具(道具keyId，数量)

		Drop_Money(10),//货币(类型，数量)

		Drop_HeroExperience(5),//英雄经验(数量)

		Drop_UserExperience(13),//角色经验(数量)

		Drop_Power(12),//体力（数量）
;

	private int value;

	DropEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static DropEnum[] enums;
	
	public static DropEnum getEnum(int index) {
		if(enums==null){
			enums = DropEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
