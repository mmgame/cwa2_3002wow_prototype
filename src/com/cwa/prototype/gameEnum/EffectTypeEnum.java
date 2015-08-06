package com.cwa.prototype.gameEnum;

public enum EffectTypeEnum {
		Type_Attack(1),//攻击

		Type_Recovery(2),//恢复

		Type_Trap(3),//陷阱

		Type_Call(4),//召唤

		Type_Purge(5),//净化

		Type_UnPurge(6),//反净化

		Type_ImmediatelyDie(7),//即死

		Type_Suck_Blood(8),//吸血

		Type_State(9),//状态
;

	private int value;

	EffectTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static EffectTypeEnum[] enums;
	
	public static EffectTypeEnum getEnum(int index) {
		if(enums==null){
			enums = EffectTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
