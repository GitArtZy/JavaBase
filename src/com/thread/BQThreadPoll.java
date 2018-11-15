package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BQThreadPoll implements Runnable{
    @Override
    public void run() {

        // ��ӡ����ִ�еĻ����߳���Ϣ
        System.out.println(Thread.currentThread().getName() + "���ڱ�ִ��");
        try {
            // sleepһ�뱣֤3�������ڷֱ���3���߳���ִ��
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class TestBQThreadPool {
    public static void main(String[] args) {
        // ���������ͻ���ȴ�����
        BlockingQueue<Runnable> bq = new ArrayBlockingQueue<Runnable>(10);
        // ThreadPoolExecutor:�����Զ����̳߳أ����б�����߳���Ϊ3�����������߳���Ϊ6
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3, 6, 50, TimeUnit.MILLISECONDS, bq);
        // ����3������
        Runnable t1 = new BQThreadPoll();
        Runnable t2 = new BQThreadPoll();
        Runnable t3 = new BQThreadPoll();
        // Runnable t4 = new BQThreadPoll();
        // Runnable t5 = new BQThreadPoll();
        // Runnable t6 = new BQThreadPoll();
        // 3�������ڷֱ���3���߳���ִ��
        tpe.execute(t1);
        tpe.execute(t2);
        tpe.execute(t3);
        // tpe.execute(t4);
        // tpe.execute(t5);
        // tpe.execute(t6);

        // �ر��Զ����̳߳�
        tpe.shutdown();

    }
}
