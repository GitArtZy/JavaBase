package com.Designpattern;

public class Factory {
	public static Animal createAnimal(String animalName){
		if("dog".equals(animalName)) {
			return new Dog();
		}
		
		else if("cat".equals(animalName)) {
			return new Cat();

		}else {
			return null;
		}
	}
}
abstract class  Animal{
	public abstract void eat();
}
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("√®≥‘”„");
		
	}

}
class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("π∑≥‘»‚");
		
	}
	
}
