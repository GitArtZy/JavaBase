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
    //synchronized修饰方法，锁住调用这个方法的对象
    public synchronized void run(){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt); //虽然是创建了两个不同的t1和t2对象，但是实质是用的同一把锁mt的对象锁
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();//创建了两个线程，有两个不同的锁，所以使用synchronized锁方法无效
        t1.start();
        t2.start();
    }
}
