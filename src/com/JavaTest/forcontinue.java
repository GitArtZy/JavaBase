package com.JavaTest;

import java.util.Scanner;

//continue在for循环中跳出到i++之前；continue跳到最内层循环的首部；break退出循环，
//可以使用标签跳转到带标签的语句块末尾
public class forcontinue {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	//int i=0;
	//int n;
	//标签
	//read_data:
	//while (i<5) {
		//i++;
		//System.out.println("输入n的值：");
		//n=input.nextInt();
		//if(n<0) break read_data;
			
	
	//}
	 int sum=1;
	 int goal=4;
	while (sum<goal) {
		System.out.println("输入一个数：");
		int n=input.nextInt();
		if(n<0) continue;
		sum +=goal;
		System.out.println(sum);
	}
}
}
