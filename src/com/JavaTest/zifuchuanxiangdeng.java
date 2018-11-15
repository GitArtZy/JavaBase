package com.JavaTest;

public class zifuchuanxiangdeng {
	public static void main(String[] args) {
		String greeting="hello";
		String greeting1= new String("hello");
		String greeting2= greeting1;
		String greeting3="he"+"llo";
		if(greeting=="hello"){
			System.out.println("地址相同");
		}
		if(greeting.substring(0, 3)=="hell"){
			System.out.println("不同");
		}
		if(greeting==greeting1){
			System.out.println("地址相同");
		}
		if(greeting.equals(greeting1)){
			System.out.println("内容相同");
		}
		
		//if("hello".equals(greeting)){
		//	System.out.println("内容相同");
		//}
		
		//判断字符串大小写字母，中文
		String str1="HELLO";
		String str2="hello";
		String str3="欢迎";
		System.out.println("str1:"+str1.length());
		System.out.println("str2:"+str2.length());
		System.out.println("str3:"+str3.length());
	}

}
