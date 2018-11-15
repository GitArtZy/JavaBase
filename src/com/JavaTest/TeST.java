package com.JavaTest;

public class TeST {
	
	public static void main(String[] args) {
		String s = "aa,aab,bcc";
		String[] split = s.split(",");
		for(int i=0;i<split.length;i++){
			
			System.out.println(split[i]);
		}
	}

}
