package com.demo_Srtring;

import java.util.Scanner;

/*A:案例演示
 * 
 需求：把字符串反转
 举例：键盘录入"abc"		
 输出结果："cba"
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = sc.nextLine();
		System.out.println("String类方法：");
		System.out.println(reString(str));
		System.out.println("StringBuffer类方法：");
		System.out.println(revString(str));

	}
//用String
	public static String reString(String str) {

		char[] arr = str.toCharArray();
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i];

		}
		return s;
	}
	//用StringBuffer
	public static String revString(String str){
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		return sb.toString();
		
	}

}
