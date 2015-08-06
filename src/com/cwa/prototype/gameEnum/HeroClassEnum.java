package com.cwa.prototype.gameEnum;

public enum HeroClassEnum {
		Class_Human(1),//人族

		Class_Elves(2),//精灵

		Class_Animal(3),//兽族

		Class_Death(4),//亡灵

		Class_Demon(5),//魔族

		Class_Dragon(6),//龙族

		Class_God(7),//神族
;

	private int value;

	HeroClassEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static HeroClassEnum[] enums;
	
	public static HeroClassEnum getEnum(int index) {
		if(enums==null){
			enums = HeroClassEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
