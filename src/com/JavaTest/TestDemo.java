package com.JavaTest;

class TestDemo  
{  
     static  
     {  
         System.out.println("主函数静态代码块");  
     }  
     public static void main(String[] args)   
     {   
          System.out.println("主函数开始");  
          People p1 = new People(1);  
          People p = new People();  
          System.out.println("主函数结束");  
     }  
}  
class People  
{  
    //程序先运行静态代码块-->构造代码块-->构造函数  
    //构造代码块  
     {  
         System.out.println("People构造代码块");  
     }  
     //静态代码块  
     static  
     {  
         System.out.println("People静态代码块");  
     }  
     //构造函数  
     People()  
     {  
         System.out.println("空参构造函数");  
     }  
     People(int num)  
     {  
         System.out.println("一个参数的构造函数");  
     }   
} 