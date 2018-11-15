package com.JavaTest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class yunsuanfu {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入N的值：");
		int num=input.nextInt();
		if(num>90){
			System.out.println("A");
		}else if (num>60) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		//max=(a>b)?a:b; 等效于if(a>b){max=a;}else{max=b;}
		/**String str=JOptionPane.showInputDialog("请输入N的值：");
		int N=0;
		N=Integer.parseInt(str);
		str=(N>=90?"A":(N>60?"B":"C"));
		System.out.println(str);
		*/
	}

}
