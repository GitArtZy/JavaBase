package com.arry1;


public class Demo1 {
	public static void main(String[] args) {
		int[] arr= {11,66,33,44,55};
		int max= getMax(arr);
		System.out.println(max);
	}
	
	public static int getMax(int[] arr){
		
		int max =arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		
		return max;
		
	} 

}
