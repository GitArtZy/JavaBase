package com.JavaTest;

import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("�������"+(i+1)+"��ѧ���ɼ�");
			score[i]=input.nextInt();
			sum=sum+score[i];
			
		}
		System.out.println("�ܷ�"+sum);
		double avg=sum*1.0/score.length;
		System.out.println("ƽ�ַ�"+avg);
	}
}
