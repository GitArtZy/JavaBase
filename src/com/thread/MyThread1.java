package com.thread;

public class MyThread1 extends Thread{
    //每个对象都有自己的成员变量，设置为静态的对象在全局是唯一的
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