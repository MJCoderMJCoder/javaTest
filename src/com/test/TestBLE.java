package com.test;

public class TestBLE {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// String testAD = "6F:06:C6:FA:A1:EA";
		//// String test2=testAD.replaceAll(":", "");
		// String[] arrAD = testAD.split(":");
		//
		// String revAD="";
		// byte[] newByte=new byte[arrAD.length];
		// for(int i=arrAD.length-1;i>=0;i--) {
		// Integer x = Integer.parseInt(arrAD[i],16);
		// int xx=x;
		// newByte[i]=(byte)xx;
		//
		// }
		//
		// System.out.println(newByte);

		// byte[] b1 = toBytes("C6");
		// System.out.println(b1);
		//
		// Integer x = Integer.parseInt("C6",16);
		//
		// System.out.println(x);

		String mainDevice = "6F:06:C6:FA:A1:EA" + ":" + "6F:06:C6:FA:A1:EA" + ":00:00:00:01:01:00";
		String[] temp = mainDevice.split(":");
		String dg = "";
		for (int i = temp.length - 1; i >= 0; i--) {
			dg += temp[i];
		}
		System.out.println(dg);
		byte[] bytes = toBytes(dg);
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i] + ":");
		}
	}

	/**
	 * 将16进制字符串转换为byte[]
	 *
	 * @param str
	 * @return
	 */
	public static byte[] toBytes(String str) {
		if (str == null || str.trim().equals("")) {
			return new byte[0];
		}
		byte[] bytes = new byte[str.length() / 2];
		for (int i = 0; i < str.length() / 2; i++) {
			String subStr = str.substring(i * 2, i * 2 + 2);
			bytes[i] = (byte) Integer.parseInt(subStr, 16);
		}
		return bytes;
	}

}
