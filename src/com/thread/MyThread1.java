package com.thread;

public class MyThread1 extends Thread{
    //ÿ���������Լ��ĳ�Ա����������Ϊ��̬�Ķ�����ȫ����Ψһ��
    private static Object o =  new Object();

    public  void run(){
        synchronized(MyThread1.class){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        }
    }
}
class Test{
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread1 m2 = new MyThread1();
        m1.start();
        m2.start();
    }
}