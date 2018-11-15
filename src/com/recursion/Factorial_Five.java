package com.recursion;

//问题描述：求5的阶乘
public class Factorial_Five {

	public static void main(String[] args) {
		Factorial_Five factorial_Five = new Factorial_Five();
		int i = factorial_Five.factorial(5);
		System.out.println(i);

	}

	public int factorial(int index) {
		if (index == 1) {
			return index;
		} else {
			return index * factorial(index - 1);
		}

	}

}
