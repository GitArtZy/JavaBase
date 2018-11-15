package com.training;

public class MyPow {
	/**
	 * x的n次幂
	 * 
	 * @param x
	 *            the base number
	 * @param n
	 *            the power number
	 * @return the result
	 */
	public static double myPow(double x, int n) {
		// Write your code here
		if (n == 0) {
			return 1.0;
		}
		int exp = n > 0 ? n : -n;

		double res = exp % 2 == 0 ? myPow(x * x, exp / 2) : myPow(x * x, exp / 2) * x;

		return n > 0 ? res : 1 / res;
	}

	public static void main(String[] args) {
		double x = 4;
		int n = -2;
		double myPow = myPow(x, n);
		System.out.println(myPow);
	}

}
