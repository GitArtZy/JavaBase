package com.demo_Srtring;

import java.awt.print.Printable;

/*
 * �������������
 */
public class Demo3 {

	public static void main(String[] args) {
		int[] arr={24,69,80,57,13,77,88};
		System.out.println("ð������");
		bubbleSort(arr);
		print(arr);
		System.out.println();
		System.out.println("ѡ������");
		selectSort(arr);
		print(arr);
		System.out.println();
		System.out.println("���ַ�����");
		int index = getIndex(arr, 24);
		System.out.println(index);
		
		
		

	}
/*
 * ����
 ����Ԫ�أ�{24, 69, 80, 57, 13}
 �������Ԫ�ؽ�������
 ð������
 ����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ��
 */
	private static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
	}
	/*
	 * * �������Ԫ�ؽ�������
	 * ѡ������
	 * ��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
	 */
	private static void selectSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr[i]>arr[j]){
					swap(arr, i, j);
				}
			}
		}
	}
	/*
	 * * ����߼����ֲ��Ҵ���
     * B:ע������
	 * ����������򣬾Ͳ���ʹ�ö��ֲ��ҡ�
	 * ��Ϊ����������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������
	 */
	private static int getIndex(int[] arr,int value){
		bubbleSort(arr);
		int max=arr.length-1;
		int min=0;
		// >>����λ��2��1�η������ڳ���2^1��<<����λ��2��1�η������ڳ���2^1
		int mid=(max+min)>>1;
		while (arr[mid]!=value) {
			if(arr[mid]>=value){
				max=mid-1;
			}else if(arr[mid]<value){
				min=mid+1;
			}
			mid=(min+max)>>1;
			if(min>max){
				return -1;
			}
		}
		
		return mid;
		
	}
	//��ӡ�ķ���
	private static void print(int[] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	//�����ķ���
	private static void swap(int[] arr,int i,int j){
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
