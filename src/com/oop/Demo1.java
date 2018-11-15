package com.oop;

import java.util.Scanner;
//需求：猜数字小游戏(数据在1-100之间)
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int num= sc.nextInt();
		int guessnum= (int) (Math.random()*100+1);
		
		if (num>guessnum) {
			System.out.println("大了");
			
		}else if (num<guessnum) {
			System.out.println("小了");
		}else {
			System.out.println("猜对了");
		}
	}

}
