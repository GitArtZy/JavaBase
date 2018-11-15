package com.JavaTest;

public class shuixianhua {
	public static void main(String[] args) {
		int sum  ;
		shuixianhua num = new shuixianhua();
		System.out.println("水仙花数为：");
		for (int i = 100; i < 1000; i++) {
			sum = num.getshuixianhua(i / 100)
					+ num.getshuixianhua((i / 10) % 10)
					+ num.getshuixianhua(i % 10);
			if(sum==i){
				System.out.println(i);
			}

		}
	}

	public int getshuixianhua(int x) {
		x = x * x * x;
		return x;

	}

}
