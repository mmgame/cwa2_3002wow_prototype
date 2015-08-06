package com.cwa.prototype.gameEnum;

public enum EquipmentPositionEnum {
		Position_Arm(1),//武器

		Position_Head(2),//头部

		Position_Body(3),//身体

		Position_Foot(4),//脚部

		Position_Ornaments(5),//饰品
;

	private int value;

	EquipmentPositionEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static EquipmentPositionEnum[] enums;
	
	public static EquipmentPositionEnum getEnum(int index) {
		if(enums==null){
			enums = EquipmentPositionEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
