package com.arry1;
/**
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
     ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * @author Administrator
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		int[] arr= {3,5,2,6,1};
		int min = sortInt(arr);
		System.out.println("��СֵΪ"+min);

	}
	public static int sortInt(int[] arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr[0];
	} 

}
