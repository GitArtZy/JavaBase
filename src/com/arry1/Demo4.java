package com.arry1;

import java.util.Scanner;

//数组元素查找(查找指定元素第一次在数组中出现的索引)
public class Demo4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr={11,22,33,44,55};
		System.out.println("请输入元素");
		int value = sc.nextInt();
		int index = getIndex(arr, value);
		System.out.println(index);
	}
	public static int getIndex(int[] arr,int value){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value){
				return i;
			}
			
		}
		
		return -1;
		
	}
	

}
