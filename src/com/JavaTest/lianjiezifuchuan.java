package com.JavaTest;
//string 判断是否相等；
//stringBuffer添加字符
//替换字符串 m换i；
public class lianjiezifuchuan {
	public static void main(String[] args) {
	//	String str1=new String();
	//	str1="It is";
		StringBuffer str1= new StringBuffer("It is");
		String str2=new String();
		str2="It is";
	//	if(str1==str2){
	//		System.out.println("相等");
	//	}else {
	//		System.out.println("不等");
	//	}
		StringBuffer str3=new StringBuffer(" a book");
		str1.append(str3);
		System.out.println(str1);
		String str4=str2.replace('i', 'm');
				System.out.println("替换后的字符串为："+str4);
		
	}

}
