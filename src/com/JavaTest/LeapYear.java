package com.JavaTest;

public class LeapYear {
	public static void main(String[] args) {
		int year=  (int) (Math.random()*10000);
		System.out.println("年份:"+year);
		if(year%400==0&&year%4==0&&year%100!=0){
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"不是闰年");
		}
	}

}
