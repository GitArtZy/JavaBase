package com.Designpattern;

public class Test {

	public static void main(String[] args) {
		System.out.println("懒汉模式");
		Singleton1.getInstance();
		Singleton1.print();
		System.out.println("饿汉模式");
		Singelton2.getInstance();
		Singelton2.print();
		System.out.println("-------------");
		System.out.println("静态工厂模式");
		Cat cat =(Cat) Factory.createAnimal("cat");
		cat.eat();
		Dog dog= (Dog) Factory.createAnimal("dog");
		dog.eat();

	}

}
