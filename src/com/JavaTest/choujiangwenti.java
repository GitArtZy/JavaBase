package com.JavaTest;

import java.util.Scanner;

//��N�������г�ȡK���������齱�������н�����
public class choujiangwenti {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("����������֣�");
		int n=input.nextInt();
		System.out.println("�����ȡ���ٸ�");
		int k=input.nextInt();
		double keneng=1;
		double gailv=1;
		for(int i=1;i<=k;i++){
			keneng=keneng*(n-i+1)/i;
			gailv=1/keneng;
		}
		System.out.println("�����ԣ�"+keneng);
		System.out.println("�н�����:"+gailv);
	}

}
