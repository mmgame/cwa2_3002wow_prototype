package com.cwa.prototype.gameEnum;

public enum BuffBeneficialTypeEnum {
		Beneficial_Good(1),//增益

		Beneficial_Bad(2),//减益
;

	private int value;

	BuffBeneficialTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static BuffBeneficialTypeEnum[] enums;
	
	public static BuffBeneficialTypeEnum getEnum(int index) {
		if(enums==null){
			enums = BuffBeneficialTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
