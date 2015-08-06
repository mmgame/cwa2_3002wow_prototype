package com.cwa.prototype.gameEnum;

public enum CDTypeEnum {
		CD_POWER(1),//体力回复cd

		CD_MOPUP(2),//扫荡次数cd

		CD_BATTLE(3),//挑战次数cd

		CD_BUY_POWER(4),//购买体力次数cd

		CD_REFRESH_SHOP(5),//刷新商店次数cd

		CD_CONCEAL(6),//隐藏关卡时间

		CD_SHOP(7),//神秘商店时间
;

	private int value;

	CDTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static CDTypeEnum[] enums;
	
	public static CDTypeEnum getEnum(int index) {
		if(enums==null){
			enums = CDTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
