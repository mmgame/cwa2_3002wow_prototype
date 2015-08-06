package com.cwa.prototype.gameEnum;

public enum BuffTypeEnum {
		Buff_Poison(1),//中毒

		Buff_Paralysis(2),//麻痹

		Buff_Vertigo(3),//眩晕

		Buff_Sleep(4),//睡眠

		Buff_NoSpeek(5),//沉默

		Buff_Curse(6),//诅咒

		Buff_NoMove(7),//定身

		Buff_Stone(8),//石化

		Buff_Hatred(9),//仇恨

		Buff_SevenAttr(10),//7属性

		Buff_SevenResistance(11),//7耐性

		Buff_SevenElement(12),//7元素专精

		Buff_DeBuffResistance(13),//debuff耐性

		Buff_Shield(14),//护盾

		Buff_RemoveAllBad(15),//明镜止水

		Buff_Unmatched(16),//无敌

		Buff_Reflex(17),//反射

		Buff_CanNotHurt(18),//霸体

		Buff_Blood(19),//血量影响

		Buff_GiveBlue(20),//魔力影响

		Buff_SuckBlood(21),//吸血

		Buff_SuckBlue(22),//吸蓝

		Buff_AttackSpeed(23),//攻击速度

		Buff_RaceRestrain(24),//种族相克
;

	private int value;

	BuffTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static BuffTypeEnum[] enums;
	
	public static BuffTypeEnum getEnum(int index) {
		if(enums==null){
			enums = BuffTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
