package com.thread;

public class MyThread extends Thread{

    private static int count = 0;
    private static Object ob = new Object();
//    public void run(){
//        synchronized (ob) {
//            for (int i = 0; i < 100; i++) {
//                System.out.println(Thread.currentThread().getName() + " " + i);
//            }
//        }
//    }
    //synchronized���η�������ס������������Ķ���
    public synchronized void run(){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt); //��Ȼ�Ǵ�����������ͬ��t1��t2���󣬵���ʵ�����õ�ͬһ����mt�Ķ�����
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();//�����������̣߳���������ͬ����������ʹ��synchronized��������Ч
        t1.start();
        t2.start();
    }
}
