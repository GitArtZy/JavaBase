package com.training;

import java.math.BigInteger;

public class AddStrings {
	
	public static String addStrings(String num1, String num2) {
        // write your code here
		//防止字符串太长。
		BigInteger n1 = new BigInteger(num1);
		BigInteger n2 = new BigInteger(num2);
		int i =n1.intValue()+n2.intValue();
		String s = String.valueOf(i);
		return s;
    }
	
	public static String addStrings2(String num1, String num2){
		
		
		return "0";
		
	}
	public static void main(String[] args) {
		String num1= "99999999";
		String num2="19";
		String addStrings = addStrings(num1, num2);
		System.out.println(addStrings);

	}
	

}
