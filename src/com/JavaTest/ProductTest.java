package com.JavaTest;

/*
�߳�ͨѶ�� һ���߳�������Լ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������һ������.

��������������


wait():  �ȴ�   ����߳�ִ����wait��������ô���̻߳����ȴ���״̬���ȴ�״̬�µ��̱߳���Ҫ�������̵߳���notify�������ܻ��ѡ�
notify()�� ����    �����̳߳صȴ��߳����е�һ����
notifyAll() : �����̳߳����еȴ� �̡߳�


wait��notify����Ҫע������
	1. wait������notify����������Object���� �ġ�
	2. wait������notify��������Ҫ��ͬ������������ͬ�������в��� ʹ�á�
	3. wait������notify��������Ҫ����������á�
	
����һ���������̰߳�ȫ���⡣ �۸������...

*/

//��Ʒ��
class Product {

	String name;

	double price;

	boolean flag = false;//��Ʒ�Ƿ�������ϵı�ʶ��Ĭ�������û��������ɡ�
}

//������
class Producer implements Runnable {

	Product p;//��Ʒ

	public Producer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			synchronized (p) {
				if (p.flag == false) {
					if (i % 2 == 0) {
						p.name = "ƻ��";
						p.price = 6.5;
					} else {
						p.name = "�㽶";
						p.price = 2.0;
					}
					System.out.println(Thread.currentThread().getName() + "������"
							+ p.name + "�۸���" + p.price);
					i++;
					p.flag = true;
					p.notifyAll();//����������ȥ����
				} else {
					//�Ѿ����� ��ϣ��ȴ���������ȥ����
					try {
						p.wait();//�Ѿ��������ˣ� �����ߵȴ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}

//������
class Customer implements Runnable {

	Product p;

	public Customer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if (p.flag == true) {  //��Ʒ�Ѿ��������
					System.out.println(Thread.currentThread().getName() + "������"
							+ p.name + "�۸�" + p.price);
					p.flag = false;
					p.notifyAll(); // ����������ȥ����
				} else {
					//��Ʒ��û������,Ӧ�� �ȴ���������������
					try {
						p.wait();//������Ҳ�ȴ���...
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}
}

public class ProductTest {

	public static void main(String[] args) {
		//��Ʒ
		Product p = new Product();
		//������������
		Producer producer = new Producer(p);
		Customer customer = new Customer(p);

		Thread thread_p = new Thread(producer, "������");
		Thread thread_c = new Thread(customer, "������");
		thread_p.start();
		thread_c.start();
	}

}
