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
					System.out.println(Thread.currentThread().getName()+"取出了1000块");
					money=money-1000;
				}
			}
		}
	}
	
}

public class QuQianBiSai {
	public static void main(String[] args) {
		DrawMoney fa=new DrawMoney("丈夫");
		DrawMoney mo=new DrawMoney("妻子");
		fa.start();
		mo.start();
	}

}
