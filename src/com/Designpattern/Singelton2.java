package com.Designpattern;
//����ģʽ
public class Singelton2 {
	//1,˽�й��캯��
    private Singelton2(){}
  //2,�����������
    private static Singelton2 singelton2= new Singelton2();
  //3,�����ṩ�����ķ��ʷ���
    public static Singelton2 getInstance(){
    	return singelton2;
    }
    public static void print() {
		System.out.println("22222222");
	}
}
