package com.Designpattern;

public class Test {

	public static void main(String[] args) {
		System.out.println("����ģʽ");
		Singleton1.getInstance();
		Singleton1.print();
		System.out.println("����ģʽ");
		Singelton2.getInstance();
		Singelton2.print();
		System.out.println("-------------");
		System.out.println("��̬����ģʽ");
		Cat cat =(Cat) Factory.createAnimal("cat");
		cat.eat();
		Dog dog= (Dog) Factory.createAnimal("dog");
		dog.eat();

	}

}
