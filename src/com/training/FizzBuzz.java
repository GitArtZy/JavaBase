package com.training;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	/**
	 * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
                如果这个数被3整除，打印fizz.
                如果这个数被5整除，打印buzz.
                如果这个数能同时被3和5整除，打印fizz buzz
                比如 n = 15, 返回一个字符串数组：
      ["1", "2", "fizz",
       "4", "buzz", "fizz",
       "7", "8", "fizz",
       "buzz", "11", "fizz",
       "13", "14", "fizz buzz"]
	 */
	
	public  List<String> fizzBuzz(int n){
		
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=1;i<=n;i++){
	    	if(i%15==0){
	    		list.add("fizz buzz");
	    	}
	    	if(i%5==0){
	    		list.add("buzz");
	    	}
	    	if(i%3==0){
	    		list.add("fizz");
	    	}else{
	    		list.add(String.valueOf(i));	    		
	    	}
	    }
		return list;
		
	}
	
	public static void main(String[] args) {
		int n =15;
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> fizzBuzz2 = fizzBuzz.fizzBuzz(n);
		System.out.println(fizzBuzz2);
	}

}
