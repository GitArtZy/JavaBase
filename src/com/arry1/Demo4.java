package com.arry1;

import java.util.Scanner;

//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
public class Demo4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr={11,22,33,44,55};
		System.out.println("������Ԫ��");
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
