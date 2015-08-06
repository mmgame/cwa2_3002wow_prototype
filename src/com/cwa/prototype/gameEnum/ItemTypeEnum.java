package com.cwa.prototype.gameEnum;

public enum ItemTypeEnum {
		Item_General(1),//普通道具

		Item_Plugin(2),//插件

		Item_Book_Fragment(3),//0

		Item_Equipment_Fragment(4),//0

		Item_Book(5),//典籍

		Item_Box(6),//宝箱

		Item_Scroll(7),//卷轴

		Item_Bookbox(8),//战场道具

		Item_Material(9),//素材

		Item_Material_Fragment(10),//素材碎片
;

	private int value;

	ItemTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static ItemTypeEnum[] enums;
	
	public static ItemTypeEnum getEnum(int index) {
		if(enums==null){
			enums = ItemTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
