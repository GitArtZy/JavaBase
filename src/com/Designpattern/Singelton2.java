package com.Designpattern;
//饿汉模式
public class Singelton2 {
	//1,私有构造函数
    private Singelton2(){}
  //2,创建本类对象
    private static Singelton2 singelton2= new Singelton2();
  //3,对外提供公共的访问方法
    public static Singelton2 getInstance(){
    	return singelton2;
    }
    public static void print() {
		System.out.println("22222222");
	}
}
