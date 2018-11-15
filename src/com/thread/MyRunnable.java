package com.thread;

public class MyRunnable implements Runnable{

    private static int count=0;
    @Override
    public void run() {
       for (int i=0;i<100;i++){
           System.out.println(Thread.currentThread().getName()+"   "+count++);
      }
    }

    public static void main(String[] args) {

        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();
        new Thread(mr1).start();
        new Thread(mr2).start();

    }


}
