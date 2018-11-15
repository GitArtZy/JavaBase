package com.arry1;

/**
 * 
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������ �����һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 *
 */
public class Solution {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		boolean find = find(1, arr);
		System.out.println(find);

	}

	public static boolean find(int value, int[][] arr) {
		boolean target = false,flag=false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(value==arr[i][j]){
					target=true;
					flag=true;
					break;
					}
			}if(flag==true){
				break;
			}
		}

		return target;
	}

}
