package com.JavaTest;

import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第"+(i+1)+"个学生成绩");
			score[i]=input.nextInt();
			sum=sum+score[i];
			
		}
		System.out.println("总分"+sum);
		double avg=sum*1.0/score.length;
		System.out.println("平局分"+avg);
	}
}
