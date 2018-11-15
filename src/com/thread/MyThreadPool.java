package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class MyThreadPool {

    public static void main(String[] args) {
//        demo1();
//        demo2(Executors.newFixedThreadPool(3));
//        demo3();
        //����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С�������ִ��
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //�ӳ�1���ÿ3��ִ��һ��
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("�ӳ�1���ÿ3��ִ��һ��");
            }
        }, 1,3, TimeUnit.SECONDS);
    }

    private static void demo3() {
        //����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С����ӳ�ִ��
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //�ӳ�1��ִ��
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("�ӳ�1��ִ��");
            }
        }, 1, TimeUnit.SECONDS);
    }


    private static void demo2(ExecutorService executorService) {
        ExecutorService newFixedThreadPool = executorService;
        for (int i = 0; i < 10; i++) {
            try {
                //sleep�����Կ���ʹ�õ����̳߳�������ǰ���̣߳�û�д����µ��߳�
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            newFixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    //��ӡ����ִ�еĻ����߳���Ϣ
                    System.out.println(Thread.currentThread().getName() + "���ڱ�ִ��");
                }
            });
        }
    }

    public static void demo1(){
        ExecutorService mCachedThreadPool = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            try {
                //sleep�����Կ���ʹ�õ����̳߳�������ǰ���̣߳�û�д����µ��߳�
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mCachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    //��ӡ����ִ�еĻ����߳���Ϣ
                    System.out.println(Thread.currentThread().getName()+"���ڱ�ִ��");
                }
            });
        }
    }

}
