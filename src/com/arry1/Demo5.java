package com.arry1;

//��ά�������
public class Demo5 {

	public static void main(String[] args) {
		int[][] arr= {{1,3,2},{3,2},{5,6}};
		getArr(arr);


	}
	public static void getArr(int[][] arr){
		//��ȡ��ÿ����ά�����е�һά����
		for (int i = 0; i < arr.length; i++) {
			//��ȡÿ��һά�����е�Ԫ��
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
