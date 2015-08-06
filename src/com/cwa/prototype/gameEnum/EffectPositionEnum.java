package com.cwa.prototype.gameEnum;

public enum EffectPositionEnum {
		Effect_OwnTop(1),//己方上方

		Effect_OwnBelow(2),//己方下方

		Effect_OwnFront(3),//己方身前

		Effect_OwnBack(4),//己方身后

		Effect_OwnBody(5),//己方身上

		Effect_EnemyTop(6),//敌人上方

		Effect_EnemyBelow(7),//敌人下方

		Effect_EnemyFront(8),//敌人身前

		Effect_EnemyBack(9),//敌人身后

		Effect_EnemyBody(10),//敌人身上

		Effect_Appoint(11),//指定地点
;

	private int value;

	EffectPositionEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static EffectPositionEnum[] enums;
	
	public static EffectPositionEnum getEnum(int index) {
		if(enums==null){
			enums = EffectPositionEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
