package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author MJCoder 测试用
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// Dec 31 1980 (English)
			// 1980 12 31 (CHINESE)
			// String s = "Mon Feb 01 00:00:00 GMT+08:00 1990";
			// SimpleDateFormat sf1 = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy",
			// Locale.ENGLISH);
			// Date date = (Date) sf1.parse(s);
			// SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// System.out.println(sf2.format(date));
			// System.out.println(new SimpleDateFormat("MMM-dd-yyyy HH:mm",
			// Locale.ENGLISH).format(date));
			//
			// System.out.println(System.getProperties());
			//
			// String tvHeightValue = "5ft.9in.";
			// int feetTemp = Integer.parseInt(tvHeightValue.substring(0,
			// tvHeightValue.indexOf("ft.")));
			// int inchTemp = Integer
			// .parseInt(tvHeightValue.substring(tvHeightValue.indexOf("ft.") + 3,
			// tvHeightValue.indexOf("in.")));
			// System.out.println("feetTemp：" + feetTemp);
			// System.out.println("inchTemp：" + inchTemp);
			//
			// System.out.println("大约消耗{0}个炸鸡腿的热量".replace("{0}", "***"));
			// System.out.println("0.0小数点的位置".indexOf("."));
			// System.out.println("0.0小数点的位置".length() - "0.0小数点的位置".indexOf("."));
			//
			// System.out.println("GMT+08:00".substring("GMT+08:00".indexOf(":") - 3,
			// "GMT+08:00".indexOf(":")));
			// System.out.println(
			// Integer.parseInt("GMT-08:00".substring("GMT-08:00".indexOf(":") - 3,
			// "GMT-08:00".indexOf(":"))));
			//
			// String videoPath =
			// "http://bdy.regenttechpark.com/tools/video/1012091104664044829870.mp4";
			// System.out.println(videoPath.substring(videoPath.lastIndexOf("/") + 1));
			//
			// // 获取当前月第一天：
			// Calendar c = Calendar.getInstance();
			// c.add(Calendar.MONTH, 0);
			// c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
			// System.out.println("===============first:" + c.getTimeInMillis());
			// System.out.println("===============first:" + MAIN_STATE.MAIN_PAGE);

			String tempp[] = "1".split(","); //
			System.out.println(tempp.length);
			for (String str : tempp) {
				System.out.print(str + "；");
			}
			
			
			
			String temp = Integer.toHexString(545);
	        int placeholderSize = 8 - temp.length();
	        for (int i = 0; i < placeholderSize; i++) {
	            temp += 0;
	        }
	        String result = ":";
	        for (int i = 0; i < temp.length(); i += 2) {
	            result += temp.substring(i, i + 2) + ":";
	        }//:12:92:5d:09:
	        System.out.println(result) ;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 训练类别
	public enum MAIN_STATE {
		MAIN_PAGE, // 未注册时的状态
		HOME_PAGE, // 登录后的主页
		OTHER, // 其他的一些状态
		TOURIST_TRAINING, // 游客训练中
		FREE_TRAINING, // 自由训练中
		PLAN_TRAINING, // 计划训练中
		REGISTRATION, // 注册中
		;
	}
}
