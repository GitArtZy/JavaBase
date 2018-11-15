package com.JavaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//4.从键盘读入一行字符串，这行字符串内容类似如下:"2,10,1,22,19,30";
//输入升序排序或者降序排序，然后根据输入打印排序结果
public class zifuchuanpaixu {
	public static void sort(){
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list= new ArrayList<Integer>(); 
		while (sc.hasNextLine()) {
			String line=sc.nextLine();
			String[] arr=line.split(",");
			
			for (String a : arr) {
				list.add(new Integer(a) );
			}
			System.out.println("前："+list);
			Collections.sort(list);
			System.out.println("后"+list);
		}
		
		
	}
	public static void main(String[] args) {
		sort();
	}

}
