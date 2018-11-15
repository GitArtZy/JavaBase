package com.training;

public class Aplusb {

	// 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
	/*
	 * @param a: An integer
	 * 
	 * @param b: An integer
	 * 
	 * @return: The sum of a and b
	 */
	public int aplusb(int a, int b) {
		// write your code here
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		int sum, i;
		i = a ^ b;
		sum = (a & b) << 1;
		return aplusb(sum, i);
	}

	public int aplusb2(int a, int b) {
		if ((a & b) == 0) {
			return a | b;
		}
		return aplusb(a ^ b, (a & b) << 1);
	}

	public static void main(String[] args) {
		Aplusb a = new Aplusb();
		int aplusb = a.aplusb(1, 4);
		System.out.println(aplusb);
	}

}
