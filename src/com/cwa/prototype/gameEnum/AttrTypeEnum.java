package com.cwa.prototype.gameEnum;

public enum AttrTypeEnum {
		Attr_Blood(1),//血量

		Attr_Energy(2),//能量

		Attr_Attack(3),//攻击

		Attr_Defense(4),//防御

		Attr_Quick(5),//敏捷

		Attr_Crit(6),//暴击

		Attr_Skill(7),//技力

		Attr_Speed(8),//速度

		Attr_Shield(9),//护盾

		Attr_HitRate(10),//伤害倍率

		Attr_Thorns(11),//反伤

		Attr_SuckBlood(12),//吸血

		Attr_SuckBlue(13),//吸蓝

		Attr_Invincible(14),//无敌倍率

		Attrr_Cd(15),//减cd
;

	private int value;

	AttrTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static AttrTypeEnum[] enums;
	
	public static AttrTypeEnum getEnum(int index) {
		if(enums==null){
			enums = AttrTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
