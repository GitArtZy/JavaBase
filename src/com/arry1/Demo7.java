package com.arry1;
/**
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * @author Administrator
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		int[] arr= {3,5,2,6,1};
		int min = sortInt(arr);
		System.out.println("最小值为"+min);

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
