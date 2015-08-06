package com.cwa.prototype.gameEnum;

public enum EffectTargetTypeEnum {
		Target_League(1),//范围内己方

		Target_Enemy(2),//范围内敌方

		Target_All(3),//无差别

		Target_MySelf(4),//自己

		Target_TheWeakOfUs(5),//最虚弱己方

		Target_TheWeakOfEnemy(6),//最虚弱敌方

		Target_TheWeakHero(7),//最虚弱英雄

		Target_LeagueBadBuff(8),//随机一个己方中有减益效果在身的英雄

		Target_EnemyWellBuff(9),//随机一个敌方中有增益效果在身的英雄
;

	private int value;

	EffectTargetTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static EffectTargetTypeEnum[] enums;
	
	public static EffectTargetTypeEnum getEnum(int index) {
		if(enums==null){
			enums = EffectTargetTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
