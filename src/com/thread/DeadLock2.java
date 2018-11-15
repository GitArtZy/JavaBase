package com.thread;

public class DeadLock2 extends Thread{
    private boolean flag = true;
    private static Object o1 = new Object(), o2 = new Object();
    @Override
    public void run() {

        System.out.println("flag=" + flag);
        if(flag){
            synchronized (o1){
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+"获取ob1");
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"获取ob2");
                }
            }
        }
        System.out.println("flag=" + flag);
        if (!flag){
            synchronized (o2){
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+"获取ob2");
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"获取ob1");
                }
            }
        }

    }

    public static void main(String[] args) {
        DeadLock2 t1 = new DeadLock2();
        DeadLock2 t2 = new DeadLock2();
        t1.flag=true;
        t2.flag=false;
        t1.start();
        t2.start();
    }

}
