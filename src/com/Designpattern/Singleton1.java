package com.Designpattern;
//����ʽ,�������ӳټ���ģʽ
public class Singleton1 {
	//1,˽�й��캯��
	private Singleton1(){}
	//2,����һ�����������
	private static Singleton1 singleton1;
	//3,�����ṩ�����ķ��ʷ���
	public static Singleton1 getInstance(){
		synchronized ("��") {
			if(singleton1==null){
				//�߳�1,�߳�2
				singleton1 = new Singleton1();
			}
			return singleton1;
			
		}
	}
	public static void print() {
		System.out.println("11111111111");
	}

}
