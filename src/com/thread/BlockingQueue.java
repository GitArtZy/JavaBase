package com.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * �������м�ʵ�֡�
 * �Ƚ��ȳ�
 *
 */
public class BlockingQueue {

    private Object[] data;//���ݶ���
    private int count = 0;//��ǰ���ݶ����к��ж��ٸ�����
    private int addPosition = 0;//��ǰadd���ݵ�����λ��
    private int takePosition = 0;//��ǰtake���ݵ�����λ��

    private Lock lock = new ReentrantLock();// �߳���

    private Condition addCondition = lock.newCondition();	// �������
    private Condition takeCondition = lock.newCondition();	// ȡ������

    public BlockingQueue(int size) {
        data = new Object[size];
    }

    public void add(Object value) {
        lock.lock();// �̼߳���
        try {
            while (count == data.length) {// �����Ѿ�����
                try {
                    //System.out.println("add await thread:" + Thread.currentThread().getName());
                    addCondition.await();// �������ж�����̼߳�⵽��������,��ȫ������ȴ���
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (addPosition == data.length) {// �ж����add����λ�õ���size,������λ����Ҫ��0��ʼ����
                addPosition = 0;
            }

            data[addPosition] = value;
            /*
             * ������и����ʣ��᲻��ѵ�ǰ��λ��ԭ�е�ֵ�����ǣ�
             * ���ᣬ��Ϊ��ǰֻ��һ���߳̽���,��add lock�ͷ�ǰ,��ȥ֪ͨtakeȡֵ
             */

            System.out.println("add:" + value + " add index:" + addPosition + " thread name:" + Thread.currentThread().getName());

            addPosition++;	//���µ�ǰ����λ��
            count++;

            takeCondition.signalAll();//����take�߳�

        } finally {
            lock.unlock();//�߳̽���
        }

    }

    public Object take() {

        lock.lock();
        Object value = null;
        try {
            while (count == 0) {
                try {
                    //System.out.println("take await thread:" + Thread.currentThread().getName());
                    takeCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (takePosition == data.length) {
                takePosition = 0;
            }

            value = data[takePosition];
            System.out.println("take:" + value + " take index:" + takePosition + " thread name:" + Thread.currentThread().getName());

            takePosition++;
            count--;

            addCondition.signalAll();
        } finally {
            lock.unlock();
        }
        return value;
    }

    /*
     * Test main
     */
    public static void main(String[] args) {

        final BlockingQueue blockingQueue = new BlockingQueue(2);

        /*
         * ����5���߳�ͬʱ�������������渳ֵ��
         * ��Ϊ������������size=1,���Կ���5���߳�ÿ��ֻ����һ���߳�������add����,����4���̱߳����ڵȴ�
         */
        for (int i = 0; i < 1000; i++) {
            final int index = i;
            new Thread(){
                public void run() {
                    double value = Math.random();
                    //
                    blockingQueue.add(index);
                };
            }.start();
        }

        /*
         * Ϊ���ڶ��̲߳�������£��۲�add�̵߳ȴ����
         * ����5s֮�����µ��̴߳�������������take
         */
        try {
            //Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Thread(){
            public void run() {
                while (true) {
                    // ��������������ȡֵ
                    Object value = blockingQueue.take();
                }
            };
        }.start();
    }

}
