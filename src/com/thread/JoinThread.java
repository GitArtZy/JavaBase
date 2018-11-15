package com.thread;

public class JoinThread extends Thread{

    private static int count = 0;

    public void run(){
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+count++);
        }

    }

    /**
     * join������ԭ����ǵ�����Ӧ�̵߳�wait�������еȴ������ģ�
     * ����A�߳��е�����B�̵߳�join������
     * ���൱����A�߳��е�����B�̵߳�wait������
     * ��B�߳�ִ���꣨���ߵ���ȴ�ʱ�䣩��
     * B�̻߳��Զ����������notifyAll��������A�̣߳��Ӷ��ﵽͬ����Ŀ�ġ�
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
