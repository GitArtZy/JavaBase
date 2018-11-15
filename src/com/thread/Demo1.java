package com.thread;
//匿名内部类实现和继承Thread
public class Demo1 {

    private static int i =0;
    public static void main(String[] args) {

        new Thread("张三"){
            public void run(){
                for (int i=0;i<100;i++){
                    System.out.println(this.getName()+"Thread");
                    System.out.println(i++);
                }
                System.out.println(i++);
            }

        }.start();
        new Thread(new Runnable(){
            public void run(){
                for (int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+"Runnable");
                    System.out.println(i++);
                }
            }
        },"李四").start();

        System.out.println(Thread.currentThread().getName());

    }
}


