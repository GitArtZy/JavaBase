package com.JavaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//4.�Ӽ��̶���һ���ַ����������ַ���������������:"2,10,1,22,19,30";
//��������������߽�������Ȼ����������ӡ������
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
			System.out.println("ǰ��"+list);
			Collections.sort(list);
			System.out.println("��"+list);
		}
		
		
	}
	public static void main(String[] args) {
		sort();
	}

}
