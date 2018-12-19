package com.test;

import java.math.BigDecimal;

public class Delete {

	/**
	 * 单位换算:分->元
	 * 
	 * @param amount
	 *            分
	 * @param scale
	 *            保留小数点位数
	 * @return
	 */
	public static String fenToYuan(long amount, int scale) {
		System.out.println(2.00 - 1.10);// 0.8999999999999999

		System.out.println(2.00D - 1.10D);// 0.8999999999999999

		System.out.println(2.00F - 1.10F);// 0.9
		System.out.println(Double.toString(2.00D));// 2.0

		System.out.println(BigDecimal.valueOf(2.00).subtract(BigDecimal.valueOf(1.10)));// 0.9
		System.out.println(BigDecimal.valueOf(2.00F).subtract(BigDecimal.valueOf(1.10F)));// 0.899999976158142

		System.out.println(BigDecimal.valueOf(2.00D).subtract(BigDecimal.valueOf(1.10D)));// 0.9

		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));// 0.90

		return new BigDecimal(amount).divide(new BigDecimal(100)).setScale(scale).toString();
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.random());
		System.out.println((int) Math.pow(10, 3));
		System.out.println((int) (Math.random() * Math.pow(10, 3)));
		System.out.println("V5→V7".substring(0, "V5→V7".indexOf("→"))); // V5
		System.out.println("V5→V7".substring("V5→V7".indexOf("→") + 1)); // V7

		System.out.println();
		System.out.println("V5→V7".charAt(2));
		System.out.println("V5→V7".substring(0, 2));
		System.out.println("V5→V7".indexOf("→"));
		System.out.println("V5→V7".substring(2, 4));
		System.out.println("V5→V7".length() + "\n");

		System.out.println(fenToYuan(1000, 2));

		System.out.println(callMe(TEMPORARY));
		System.out.println(callMe(PERSISTENCE));

	}

	private static final int TEMPORARY = 0;
	private static final int PERSISTENCE = 1;

	/**
	 * 给我打电话
	 * 
	 * @param type
	 *            TEMPORARY：临时的手机号；PERSISTENCE：永久的手机号
	 * @return 我的联系方式
	 */
	public static String callMe(int type) {
		int[] arr = { 5, 1, 0, 8, 6, 9, 3, 2, 4, 7 };
		String tell = "";
		if (type == TEMPORARY) {
			int[] index = { 1, 0, 0, 1, 6, 3, 4, 4, 5, 2, 7 };
			for (int i = 0; i < index.length; i++) {
				tell += arr[index[i]];
			}
		} else if (type == PERSISTENCE) {
			int[] index = { 1, 3, 6, 6, 8, 9, 2, 4, 2, 2, 6 };
			for (int i = 0; i < index.length; i++) {
				tell += arr[index[i]];
			}
		}
		return tell;
	}
}
