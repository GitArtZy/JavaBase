package com.JavaTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//输入n个数值，从中随机抽取k个数，按顺序排列出输出结果
public class choujiangwentishuzhu {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入n个数字：");
		int n=input.nextInt();
		System.out.println("从"+n+"个数字中取出k个数字：");
		int k=input.nextInt();
		
		//初始化一个数组长度为n的数组num
		int[] num=new int[n];
		//把n个数放入数组中
		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		//初始化一个数组长度为k的数组result
		int[] result=new int[k];
		//在n个数中随机抽取k个数放入数组中
		for(int i=0;i<result.length;i++){
			int r= (int) (Math.random()*n);
			result[i]=num[r];
			//避免num中取出的数重复
			num[r]=num[n-1];
			n--;
		}
		//对result数组进行排序
		Arrays.sort(result);
		System.out.println("抽取的数字");
		for(int i:result){
			System.out.println(i);
		}
	}

}
