package com.thread;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {

    private int account = 100;
    //需要声明这个锁
    private Lock lock = new ReentrantLock();

    public int getAccount() {
        return account;
    }

    //这里不再需要synchronized
    public void save(int money) {
        lock.lock();
        try {
            account += money;
            System.out.println(Thread.currentThread().getName() + " " + account);
        }finally {
            lock.unlock();
        }
    }
}

class ReenThread extends Thread {

    private MyReentrantLock myReentrantLock;

    public ReenThread(MyReentrantLock myReentrantLock) {
        this.myReentrantLock = myReentrantLock;
    }

    public void run() {
        myReentrantLock.save(100);
    }

    public static void main(String[] args) {
        MyReentrantLock ml = new MyReentrantLock();
        ReenThread rt = new ReenThread(ml);
        Thread t1= new Thread(rt,"t1");
        Thread t2= new Thread(rt,"t2");
        Thread t3= new Thread(rt,"t3");
        t1.start();
        t2.start();
        t3.start();
//        ReenThread rt1 = new ReenThread(ml);
//        ReenThread rt2 = new ReenThread(ml);
//        ReenThread rt3 = new ReenThread(ml);
//        rt1.start();
//        rt2.start();
//        rt3.start();
    }
}
