package com.JavaTest;

import java.util.Scanner;

public class TestMaxCommonDivisorAndMinCommonMultiple {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("第一个数");
		int num1=input.nextInt();
		System.out.println("第二个数");
		int num2=input.nextInt();
		System.out.println("最大公约数"+MaxCommonDivisor(num1, num2));
		System.out.println("最小公倍数"+MinCommonMultiple(num1, num2));
	}
	public static double MaxCommonDivisor(int a,int b){
		
		if(a<b){
			int temp=a;
			a=b;
			b=temp;
			}
		while (a%b!=0) {
			int temp1=a%b;
			a=b;
			b=temp1;
		}
		return b;
		
	}
	public static double MinCommonMultiple(int a,int b){
		return a*b/MaxCommonDivisor(a, b);
		
	}
	

}
