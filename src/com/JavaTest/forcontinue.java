package com.JavaTest;

import java.util.Scanner;

//continue��forѭ����������i++֮ǰ��continue�������ڲ�ѭ�����ײ���break�˳�ѭ����
//����ʹ�ñ�ǩ��ת������ǩ������ĩβ
public class forcontinue {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	//int i=0;
	//int n;
	//��ǩ
	//read_data:
	//while (i<5) {
		//i++;
		//System.out.println("����n��ֵ��");
		//n=input.nextInt();
		//if(n<0) break read_data;
			
	
	//}
	 int sum=1;
	 int goal=4;
	while (sum<goal) {
		System.out.println("����һ������");
		int n=input.nextInt();
		if(n<0) continue;
		sum +=goal;
		System.out.println(sum);
	}
}
}
