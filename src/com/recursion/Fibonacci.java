package com.recursion;

public class Fibonacci {  
    /** 
     * time:2012.12.2 
     * author:王金宇 
     * description:用递归实现斐波那契数列，但是此方法是嫉妒危险的，适用于求解比较小的位置数值 
     */  
    public static void main(String[] args) {  
        Fibonacci fibonacci=new Fibonacci();
        int result=fibonacci.fib2(10);
               System.out.println(result); 
    }
  
    public int fib(int index){  
    	if(index==1){
            return 0;
        }
        if(index==2){
            return 1;
        }else{
            return fib(index-1)+fib(index-2);
        } 
    }
    //增强版，简化复杂度
    public int fib2(int index){
    	if(index==1){
            return 0;
        }
        if(index==2){
            return 1;
        }else{
        	int a=0;
        	int b=1;
        	int c=0;
        	for(int i=3; i<index+1;i++){
        		c=a+b;
        		a=b;
        		b=c;
        	}
        	return c;
        }
        
    }
    
    
}  
