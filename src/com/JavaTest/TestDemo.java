package com.JavaTest;

class TestDemo  
{  
     static  
     {  
         System.out.println("��������̬�����");  
     }  
     public static void main(String[] args)   
     {   
          System.out.println("��������ʼ");  
          People p1 = new People(1);  
          People p = new People();  
          System.out.println("����������");  
     }  
}  
class People  
{  
    //���������о�̬�����-->��������-->���캯��  
    //��������  
     {  
         System.out.println("People��������");  
     }  
     //��̬�����  
     static  
     {  
         System.out.println("People��̬�����");  
     }  
     //���캯��  
     People()  
     {  
         System.out.println("�ղι��캯��");  
     }  
     People(int num)  
     {  
         System.out.println("һ�������Ĺ��캯��");  
     }   
} 