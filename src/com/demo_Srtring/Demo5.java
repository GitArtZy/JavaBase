package com.demo_Srtring;
//�ж��ַ����д��У�С�����ֵĴ���
public class Demo5 {

	public static void main(String[] args) {
		String max="wodeabcd,nideabcd,dajiadeabc";
		String min="abcd";
		int stringIndex = getStringIndex(max, min);
		System.out.println(stringIndex);

	}
	public static int getStringIndex(String max,String min) {
		int index=0;
		int count=0;
		while ((index=max.indexOf(min,index))!=-1) {
			
			max.substring(index+min.length());
			count++;
		}
		return count;
		
	}

}
