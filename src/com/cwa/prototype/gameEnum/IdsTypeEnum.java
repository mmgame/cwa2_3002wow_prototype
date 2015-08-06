package com.cwa.prototype.gameEnum;

public enum IdsTypeEnum {
		Ids_Hero(1),//英雄

		Ids_Item(2),//道具

		Ids_Structure(3),//建筑

		Ids_Equipment(4),//装备

		Ids_Trap(5),//陷阱

		Ids_Skill(6),//技能

		Ids_Effect(7),//效果

		Ids_Buff(8),//BUFF

		Ids_PassiveSkill(9),//被动技能

		Ids_Money(10),//货币

		Ids_Technology(11),//科技

		Ids_Power(12),//体力

		Ids_UserExp(13),//家园经验

		Ids_HeroExp(14),//英雄经验

		Ids_Match(15),//副本
;

	private int value;

	IdsTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static IdsTypeEnum[] enums;
	
	public static IdsTypeEnum getEnum(int index) {
		if(enums==null){
			enums = IdsTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
