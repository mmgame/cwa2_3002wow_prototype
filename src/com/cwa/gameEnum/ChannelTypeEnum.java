package com.cwa.gameEnum;


public enum ChannelTypeEnum {
	Channel_BareBackPacking(0), // 裸包
	Channel_App(1), // app
	Channel_91(2), // 91
	Channel_3K(3), // 易蛙
	Channel_CWA(4), // 华娱
	Channel_UC(5), // UC
	Channel_Dianwan(6), // 电玩巴士
	Channel_PP(7), // PP
	Channel_Tongbutui(8), // 同步推
	Channel_Jinyuan(9), // 金源
	Channel_CwaIn(10), // 华语内部
	Channel_YYWan(11), // YY玩
	Channel_AiSi(12), // 爱思
	Channel_MoPao(13), // 魔泡
	Channel_PGYuan(14), // 苹果圆
	Channel_JiKe(15), // 机柯
	Channel_AiPu(16), // 爱普
	Channel_LiQu(17), // 励趣
	Channel_PPPGYuan(18), // PP苹果园
	Channel_KuaiYong(19), // 快用
	Channel_TongBuTui(20), // iso当乐
	Channel_TianTianSouYou(21), // 天天手游 爱贝
	Channel_HaiMa(22), // 海马助手
	Channel_Weizhi16(23), // 未知16
	Channel_Weizhi17(24), // 未知17
	Channel_Weizhi18(25), // 未知18
	Channel_Weizhi19(26), // 未知19

	Channel_AdAaiBei(1001), // 安卓爱呗
	Channel_AdUC(1002), // 安卓UC
	Channel_AdDuoKu(1003), // 安卓多酷
	Channel_Ad91(1004), // 安卓91
	Channel_AdXioMi(1005), // 安卓小米
	Channel_Ad360(1006), // 安卓360
	Channel_AdDangLe(1007), // 安卓当乐
	Channel_AdAnZhi(1008), // 安卓安致
	Channel_AdQQ(1009), // 安卓腾讯
	Channel_AdWDJ(1010), // 安卓豌豆荚
	Channel_AdMMY(1011), // 安卓木蚂蚁
	Channel_AdBR(1012), // 安卓宝软
	Channel_Ad3G(1013), // 安卓3g门户
	Channel_AdSX(1014), // 安卓三星
	Channel_AdZRWX(1015), // 安卓中润无线
	Channel_AdPIPA(1016), // 安卓琵琶网
	Channel_AdHLG(1017), // 安卓红龙果
	Channel_AdYXR(1018), // 安卓游戏人
	Channel_AdUUC(1019), // 安卓悠悠村
	channel_AdANQU(1020), // 安卓安趣
	channel_Ad3533(1021), // 安卓3533
	channel_AdEOE(1022), // 安卓EOE
	channel_AdRuanBa(1023), // 软吧 爱贝
	channel_AdTianXia(1024), // 手游天下 爱贝
	channel_AdJingCheng(1025), // 精诚互动 爱贝
	channel_AdTianTian(1026), // 天天手游 爱贝
	channel_AdDuoMeng(1027), // 多盟
	channel_AdLiMei(1028), // 立美
	channel_AdLeDou(1029), // 乐豆
	channel_Ad91ShouCe(1030), // 91手册
	channel_AdAiDeSiQi(1031), // 艾得思奇
	channel_AdGuiZhouDianWang(1032), // 贵州电网
	channel_AdSouGou(1033), // 搜狗
	channel_AdWanPu(1034), // 北京万普世纪
	channel_AdZhuHaiYaoWan(1035), // 珠海要玩
	channel_AdZhiMei(1036), // 北京至美传媒
	channel_AdZhuHaiYaoWan2(1037), // 珠海要玩2
	channel_AdAiBeiXianXia(1038), // 爱贝线下渠道1
	channel_AdDingKaiHuLian(1039), // 鼎开互联
	channel_AdDianXinAiYouXi(1040), // 电信爱游戏
	channel_AdGuangSu(1041), // 光速
	channel_AdYiDongJiDi(1042), // 移动基地
	channel_AdYunDing(1043), // 云顶
	channel_AdAiBeiTengXun(1044), // 爱贝腾讯
	channel_AdKeKe(1045), // 可可游戏oppo
	channel_AdViVo(1046), // vivo
	channel_AdJiFeng(1047), // 机锋
	channel_AdJinLi(1048), // 金立
	channel_AdNDuo(1049), // N多
	channel_AdQuWan(1050), // 趣玩（繁体字）
	channel_AdMeiZu(1051), // 魅族
	channel_AdKuDong(1052), // 酷动
	channel_AdWuCaiShiKong(1053), // 五彩时空
	channel_AdAnZi(1053), // 安智

	;

	private int value;

	ChannelTypeEnum(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	private static ChannelTypeEnum[] enums;

	public static ChannelTypeEnum getEnum(int index) {
		if (enums == null) {
			enums = ChannelTypeEnum.values();
		}
		if (index < 0 || index >= enums.length) {
			return null;
		}
		return enums[index];
	}
}
