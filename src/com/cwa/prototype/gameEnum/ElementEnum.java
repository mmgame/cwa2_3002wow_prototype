package com.cwa.prototype.gameEnum;

public enum ElementEnum {
		Element_Physic(1),//物

		Element_Ground(2),//地

		Element_Fire(3),//火

		Element_Water(4),//水

		Element_Wind(5),//风

		Element_Light(6),//光

		Element_Dark(7),//暗
;

	private int value;

	ElementEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static ElementEnum[] enums;
	
	public static ElementEnum getEnum(int index) {
		if(enums==null){
			enums = ElementEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
