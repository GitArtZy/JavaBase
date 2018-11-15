package com.arry1;

import java.util.Collections;


public class Demo2 {
	public static void main(String[] args) {
		int[] arr= new int[]{11,22,33,44,55,66};
	    invok(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void invok(int[] arr){
		for (int i = 0; i < arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}

}
