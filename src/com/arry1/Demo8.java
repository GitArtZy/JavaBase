package com.arry1;

import java.util.Scanner;

/**
 * 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。 比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。
 * 
 * @author Administrator
 *
 */
public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.next();
		char[] c = str.toCharArray();
		String string = getString(c);
		System.out.println(string);

	}

	public static String getString(char[] c) {
		StringBuffer sb = new StringBuffer();
		int count = 1;
		if (c.length == 0) {
			System.out.println("null");
		}
		if (c.length == 1) {
			System.out.println(count + c[0]);
		}
		for (int i = 1; i < c.length; i++) {
			if (c[i] == c[i - 1]) {
				count++;
			} else {
				sb.append(count).append(c[i - 1]);
				count = 1;
			}
			if (i == c.length - 1) {
				sb.append(count).append(c[i]);
			}
		}
		return sb.toString();
	}

}
