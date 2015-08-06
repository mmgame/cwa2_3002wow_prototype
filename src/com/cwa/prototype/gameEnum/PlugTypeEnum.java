package com.cwa.prototype.gameEnum;

public enum PlugTypeEnum {
		Plug_Metal(1),//金属：加攻击

		Plug_Leather(2),//皮革：加血量

		Plug_Stone(3),//石料：加技力

		Plug_Cloth(4),//布料：加敏捷

		Plug_Flake(5),//鳞片：加防御

		Plug_Dust(6),//粉尘：加移动

		Plug_Gem(7),//宝石：加暴击

		Plug_Crystal(8),//水晶：加魔力

		Plug_Essence(9),//精华：减CD
;

	private int value;

	PlugTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
	
	private static PlugTypeEnum[] enums;
	
	public static PlugTypeEnum getEnum(int index) {
		if(enums==null){
			enums = PlugTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
