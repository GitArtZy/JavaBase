package com.JavaTest;

public class tryfianlly {
	/*
	static int test(){
	 int x = 1;
	 try {
	 x++;
	 } finally {
	 return ++x;
	 }
	 }
	 public static void main(String[] args) {
	 tryfianlly t=new tryfianlly();
	 System.out.println(t.test());
	 } */
	public static void main(String[] args) {
		System.out.println(new tryfianlly().test());
		;
	}

	static int test(){
             int x = 1;
           try{
                return x;
        	   
              }
                
           //finally 语句块在 try 语句块中的 return 语句之前执行
           finally
              {
                //return ++x;
        	   ++x;
        	   
              }
             }
            }
