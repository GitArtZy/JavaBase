package com.JavaTest;

public class zifuchuanxiangdeng {
	public static void main(String[] args) {
		String greeting="hello";
		String greeting1= new String("hello");
		String greeting2= greeting1;
		String greeting3="he"+"llo";
		if(greeting=="hello"){
			System.out.println("��ַ��ͬ");
		}
		if(greeting.substring(0, 3)=="hell"){
			System.out.println("��ͬ");
		}
		if(greeting==greeting1){
			System.out.println("��ַ��ͬ");
		}
		if(greeting.equals(greeting1)){
			System.out.println("������ͬ");
		}
		
		//if("hello".equals(greeting)){
		//	System.out.println("������ͬ");
		//}
		
		//�ж��ַ�����Сд��ĸ������
		String str1="HELLO";
		String str2="hello";
		String str3="��ӭ";
		System.out.println("str1:"+str1.length());
		System.out.println("str2:"+str2.length());
		System.out.println("str3:"+str3.length());
	}

}
