package com.arry1;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("");
		int week= sc.nextInt();
		char c = getWeek(week);
		System.out.println(""+c);
		
	}
	public static char getWeek(int week){
		
		char[] arr={' ' , '1','2','3','4','5','6', '7' };
		return arr[week];
		
	}

}
