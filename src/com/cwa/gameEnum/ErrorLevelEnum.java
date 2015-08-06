package com.cwa.gameEnum;


public enum ErrorLevelEnum {
	ErrorLevel_Tips(1),//服务端引起：弹窗提示
    ErrorLevel_Error(2),//客户端违规操作：断开连接
	;
	private int value;

	ErrorLevelEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	private static ErrorLevelEnum[] enums;

	public static ErrorLevelEnum getEnum(int index) {
		if (enums == null) {
			enums = ErrorLevelEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
