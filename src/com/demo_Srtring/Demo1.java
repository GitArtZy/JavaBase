package com.demo_Srtring;
/*A:案例演示
* 需求：把数组中的数据按照指定个格式拼接成一个字符串
* */
public class Demo1 {

	public static void main(String[] args) {
		int[] arr={1,3,6};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("String类方法：");
		System.out.println(arrToString(arr));
		System.out.println("StringBuffer类方法：");
		System.out.println(arrToSB(arr));
		

	}
	//用String类
	public static String arrToString(int[] arr){
		String s="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				s=s+arr[i]+"]";
			}else {
				s=s+arr[i]+", ";
			}
		}
		return s;
		
	}
	

	//用StringBuffer
	public static String arrToSB(int[] arr){
		StringBuffer sb= new StringBuffer();
		sb.append("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				//sb.append(arr[i]+"]");
				sb.append(arr[i]).append("]");
			}else {
				//sb.append(arr[i]+", ");
				sb.append(arr[i]).append(", ");
			}
			
		}
		return sb.toString();
	}
}
