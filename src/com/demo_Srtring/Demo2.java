package com.demo_Srtring;

import java.util.Scanner;

/*A:������ʾ
 * 
 ���󣺰��ַ�����ת
 ����������¼��"abc"		
 ��������"cba"
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		String str = sc.nextLine();
		System.out.println("String�෽����");
		System.out.println(reString(str));
		System.out.println("StringBuffer�෽����");
		System.out.println(revString(str));

	}
//��String
	public static String reString(String str) {

		char[] arr = str.toCharArray();
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i];

		}
		return s;
	}
	//��StringBuffer
	public static String revString(String str){
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		return sb.toString();
		
	}

}
