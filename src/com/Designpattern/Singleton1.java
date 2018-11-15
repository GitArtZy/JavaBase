package com.Designpattern;
//懒汉式,单例的延迟加载模式
public class Singleton1 {
	//1,私有构造函数
	private Singleton1(){}
	//2,声明一个本类的引用
	private static Singleton1 singleton1;
	//3,对外提供公共的访问方法
	public static Singleton1 getInstance(){
		synchronized ("锁") {
			if(singleton1==null){
				//线程1,线程2
				singleton1 = new Singleton1();
			}
			return singleton1;
			
		}
	}
	public static void print() {
		System.out.println("11111111111");
	}

}
