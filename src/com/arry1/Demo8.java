package com.arry1;

import java.util.Scanner;

/**
 * ����һ���ַ��������㽫�ַ������±��룬���������ַ��滻�ɡ��������ֵĸ���+�ַ����� �����ַ���AAAABCCDAA�ᱻ�����4A1B2C1D2A��
 * 
 * @author Administrator
 *
 */
public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
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
