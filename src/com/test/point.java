package com.test;

import java.io.*;
import java.util.*;

public class point {
	public static void main(String[] args) throws IOException {
		float[][] a = new float[100][2]; // 浮点型二维数组；代表多边形
		int n; // 整型变量声明
		float x, y, max1, max2, min1, min2; // 浮点型变量声明
		Scanner scanneer = new Scanner(System.in); // 通过 Scanner 类来从控制台获取用户的输入
		System.out.println("您需要输入几个坐标:"); // 向控制台输出提示信息
		n = scanneer.nextInt(); // 从控制台获取用户输入并赋值给n；（n变形）
		System.out.println("请输入坐标："); // 向控制台输出提示信息
		for (int i = 0; i < n; i++) // 输入n个坐标
			for (int j = 0; j < 2; j++) { // 输入（x,y）坐标
				a[i][j] = scanneer.nextInt(); // 给浮点浮点型二维数组赋值
			}
		max1 = a[0][0];
		min1 = a[0][0];
		for (int i = 0; i < n - 1; i++) { // 找出浮点型二维数组的最大值和最小值
			if (max1 >= a[i + 1][0]) // 谁大max1就等于谁
				max1 = a[i][0];
			else
				max1 = a[i + 1][0];
			if (min1 <= a[i + 1][0]) // 谁小max1就等于谁
				min1 = a[i][0];
			else
				min1 = a[i + 1][0];
		}
		max2 = a[0][1];
		min2 = a[0][1];
		for (int i = 0; i < n - 1; i++) { // 找出浮点型二维数组的最大值和最小值
			if (max2 >= a[i + 1][1]) // 谁大max1就等于谁
				max2 = a[i][1];
			else
				max2 = a[i + 1][1];
			if (min2 <= a[i + 1][1]) // 谁小max1就等于谁
				min2 = a[i][1];
			else
				min2 = a[i + 1][1];
		}
		System.out.println("请输入x y：");
		x = scanneer.nextInt();
		y = scanneer.nextInt();
		if (x < min1 || x > max1 || y < min2 || y > max2) // 判断用户输入的(x,y)的坐标点是否在float[][] a代表的多边形内
			System.out.println("不在多边形内");
		else
			// 如果x大于等于多边形交点最小坐标且小于等于多边形交点最大坐标，如果y大于等于多边形交点最小坐标且小于等于多边形交点最大坐标；则(x,y)坐标点在该多边形内
			System.out.println("在多边形内");
	}
}
