package com.oop;

import java.util.Scanner;
//���󣺲�����С��Ϸ(������1-100֮��)
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int num= sc.nextInt();
		int guessnum= (int) (Math.random()*100+1);
		
		if (num>guessnum) {
			System.out.println("����");
			
		}else if (num<guessnum) {
			System.out.println("С��");
		}else {
			System.out.println("�¶���");
		}
	}

}
