package com.demo_Srtring;

/*
 * ͳ���ַ��������ģ���СдӢ�ģ����ֳ��ִ���
 */
public class Demo4 {

	public static void main(String[] args) {
		String str = "��ha12Ĥ33��Ҫ������ GaoGe Da XingWen";
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
		System.out.println("��дӢ���ַ���������" + abc);
		System.out.println("СдӢ���ַ�������:" + ABC);
		System.out.println("�����ַ���������" + num);
		System.out.println("�ո��ַ���������" + space);
		System.out.println("�����ַ���������" + ch);

	}

}
