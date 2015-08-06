package com.cwa.prototype.gameEnum;

public enum ConditionEnum {
		RequireCondition_Money(10),//需要的金钱(金币类型，金币数量)

		RequireCondition_Item(2),//需要的道具个数(道具类型，道具数量)

		RequireCondition_Power(12),//需要的体力值

		RequireCondition_UserLevel(101),//需要的用户等级(等级)

		RequireCondition_StructureLevel(102),//vip等级(等级)
;

	private int value;

	ConditionEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static ConditionEnum[] enums;
	
	public static ConditionEnum getEnum(int index) {
		if(enums==null){
			enums = ConditionEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
