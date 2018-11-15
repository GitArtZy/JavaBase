package com.training;

public class Palindrome {
	//判断一个正整数是不是回文数。
    //回文数的定义是，将这个数反转之后，得到的数仍然是同一个数。
	public static boolean isPalindrome(int num){
		String str1= num+"";
		StringBuffer str2= new StringBuffer(str1);
		str2.reverse();
		int count=0;
		for(int i=0; i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				
				return false;
				
			}else{
				count++;
			}
		}
		if(count==str1.length()){
			return true;
		}
		return false;
		
		
		
	}
	
	public static void main(String[] args) {

		boolean palindrome = Palindrome.isPalindrome(1221);
		System.out.println(palindrome);
	}

}
