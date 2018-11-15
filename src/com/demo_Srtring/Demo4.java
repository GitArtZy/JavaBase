package com.demo_Srtring;

/*
 * 统计字符串中中文，大小写英文，数字出现次数
 */
public class Demo4 {

	public static void main(String[] args) {
		String str = "蛤ha12膜33不要总是想 GaoGe Da XingWen";
		getStringTimes(str);

	}

	private static void getStringTimes(String str) {
		int ch = 0;
		int abc = 0;
		int ABC = 0;
		int num = 0;
		int space = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] > 'a' && c[i] < 'z') {
				abc += 1;
			} else if (c[i] > 'A' && c[i] < 'Z') {
				ABC += 1;
			} else if (c[i] > '0' && c[i] < '9') {
				num += 1;
			} else if (c[i] == ' ') {
				space++;
			} else {
				ch += 1;
			}
		}
		System.out.println("大写英文字符串个数：" + abc);
		System.out.println("小写英文字符串个数:" + ABC);
		System.out.println("数字字符串个数：" + num);
		System.out.println("空格字符串个数：" + space);
		System.out.println("汉字字符串个数：" + ch);

	}

}
