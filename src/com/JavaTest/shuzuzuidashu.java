package com.JavaTest;

import java.util.Scanner;

//求数组中最大数
public class shuzuzuidashu {
	public static void main(String[] args) {
		int[] arry=new int[3];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arry.length;i++){
			System.out.print("请输入第"+(i+1)+"个数:");
			arry[i]=input.nextInt();
		}
		showshuzhu(arry);
		System.out.println("最大数为："+getMaxshuzhu(arry));
	}
     public static void showshuzhu(int a[]){
    	 System.out.println("数组序列为:");
    	 for(int i=0;i<a.length;i++){
    		 System.out.print(" "+a[i]);
    	 }
     }
     public static int getMaxshuzhu(int a[]){
    	 int max=a[0];
    	 for(int i=0;i<a.length;i++){
    		 if(a[i]>max){
    			 max=a[i];
    		 }
    	 }
		return max;
     }

}
