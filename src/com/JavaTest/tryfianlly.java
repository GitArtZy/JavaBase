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
                
           //finally ������ try �����е� return ���֮ǰִ��
           finally
              {
                //return ++x;
        	   ++x;
        	   
              }
             }
            }
