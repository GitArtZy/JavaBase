package com.JavaTest;

import java.util.Scanner;

//从N个数字中抽取K个数字来抽奖，计算中奖概率
public class choujiangwenti {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("输入最高数字：");
		int n=input.nextInt();
		System.out.println("输入抽取多少个");
		int k=input.nextInt();
		double keneng=1;
		double gailv=1;
		for(int i=1;i<=k;i++){
			keneng=keneng*(n-i+1)/i;
			gailv=1/keneng;
		}
		System.out.println("可能性："+keneng);
		System.out.println("中奖概率:"+gailv);
	}

}
