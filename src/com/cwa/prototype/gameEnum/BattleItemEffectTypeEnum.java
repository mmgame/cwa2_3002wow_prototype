package com.cwa.prototype.gameEnum;

public enum BattleItemEffectTypeEnum {
		ItemEffect_Add_Blood(1),//加血

		ItemEffect_Add_Blue(2),//加蓝

		ItemEffect_Add_Detoxify(3),//去毒
;

	private int value;

	BattleItemEffectTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static BattleItemEffectTypeEnum[] enums;
	
	public static BattleItemEffectTypeEnum getEnum(int index) {
		if(enums==null){
			enums = BattleItemEffectTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
