package com.JavaTest;
//string �ж��Ƿ���ȣ�
//stringBuffer����ַ�
//�滻�ַ��� m��i��
public class lianjiezifuchuan {
	public static void main(String[] args) {
	//	String str1=new String();
	//	str1="It is";
		StringBuffer str1= new StringBuffer("It is");
		String str2=new String();
		str2="It is";
	//	if(str1==str2){
	//		System.out.println("���");
	//	}else {
	//		System.out.println("����");
	//	}
		StringBuffer str3=new StringBuffer(" a book");
		str1.append(str3);
		System.out.println(str1);
		String str4=str2.replace('i', 'm');
				System.out.println("�滻����ַ���Ϊ��"+str4);
		
	}

}
