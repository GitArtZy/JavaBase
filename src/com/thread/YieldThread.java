package com.thread;

public class YieldThread implements Runnable{
//当前线程让出cpu
    @Override
    public void run() {
        for (int i =0;i<10;i++){
            if(i%2==0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        YieldThread yt = new YieldThread();
        Thread t1 = new Thread(yt,"t1");
        Thread t2 = new Thread(yt,"t2");
        t1.start();
       // Thread.yield();
        t2.start();
    }
}
