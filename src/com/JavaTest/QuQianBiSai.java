package com.JavaTest;

class DrawMoney extends Thread{
	
	static int money=5000;

	static Object o=new Object();
	public DrawMoney(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(true){
			synchronized ("o") {
				if(money>0){
					System.out.println(Thread.currentThread().getName()+"ȡ����1000��");
					money=money-1000;
				}
			}
		}
	}
	
}

public class QuQianBiSai {
	public static void main(String[] args) {
		DrawMoney fa=new DrawMoney("�ɷ�");
		DrawMoney mo=new DrawMoney("����");
		fa.start();
		mo.start();
	}

}
