package com.training;

public class ClimbStairs {
	/**
	 * 爬楼梯
	 * 假设你正在爬楼梯，需要n步你才能到达顶部。但每次你只能爬一步或者两步，你能有多少种不同的方法爬到楼顶部？
	 * 比如n=3，1+1+1=1+2=2+1=3，共有3种不同的方法
	 * @param n
	 * @return
	 */
	public static int climbStairs(int n){
		
		
		
		return n;
		
	}
	
	/**
	 * 爬楼梯
	 * 一个人爬楼梯，一步可以迈一级，二级，三级台阶，如果楼梯有N级，编写程序，输出所有走法。
	 * 有n级楼梯
	 * @param n
	 * @return
	 */
	 public static int climbStairs2(int n) {
	     // write your code here
		 int max_one = n/1;
		 int max_two = n/2;
		 for(int i=0;i<=max_one;i++){
			 int temp_one = i;
			 for(int j=0;j<=max_two-temp_one/2;j++){
				 int temp_two= j*2;
				 if(temp_one+temp_two==n){
					 return i+j;
					 
				 }
			 }
		 }
		return 0;
	    }
	 public static void main(String[] args) {
		int n =4;
		int climbStairs = climbStairs2(n);
		System.out.println(climbStairs);
		
	}
	 

}
