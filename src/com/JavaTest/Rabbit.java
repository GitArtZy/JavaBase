package com.JavaTest;

/**��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
*/
public class Rabbit {
	public static void main(String args[]) {
		int i = 0;
		for (i = 1; i <= 20; i++)
			System.out.println(f(i));
	}

	public static int f(int x) {
		if (x == 1 || x == 2)
			return 1;
		else
			return f(x - 1) + f(x - 2);
	}

}
