package com.arry1;
/**
 * ���󣺹�˾�����۶����
 * ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
      ��һ���ȣ�22,66,44
      �ڶ����ȣ�77,33,88
      �������ȣ�25,45,65
      ���ļ��ȣ�11,66,99

 */
public class Demo6 {

	public static void main(String[] args) {
		int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum = getSum(arr);
		System.out.println(sum);

	}
	public static int getSum(int[][] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				 sum = sum + arr[i][j];
			}
			
		}
		
		return sum;
		
	}

}
