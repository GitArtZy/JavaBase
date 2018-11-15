package com.thread;

public class JoinThread extends Thread{

    private static int count = 0;

    public void run(){
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+count++);
        }

    }

    /**
     * join方法的原理就是调用相应线程的wait方法进行等待操作的，
     * 例如A线程中调用了B线程的join方法，
     * 则相当于在A线程中调用了B线程的wait方法，
     * 当B线程执行完（或者到达等待时间），
     * B线程会自动调用自身的notifyAll方法唤醒A线程，从而达到同步的目的。
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        JoinThread t = new JoinThread();
     //   JoinThread t2 = new JoinThread();
        Thread t1 = new Thread(t,"t1");
        Thread t2 = new Thread(t,"t2");
        t1.start();
        t1.join();
        t2.start();

    }



}
