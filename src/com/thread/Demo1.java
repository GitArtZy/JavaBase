package com.thread;
//�����ڲ���ʵ�ֺͼ̳�Thread
public class Demo1 {

    private static int i =0;
    public static void main(String[] args) {

        new Thread("����"){
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
        },"����").start();

        System.out.println(Thread.currentThread().getName());

    }
}


