package com.demo_Srtring;
/*A:������ʾ
* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
* */
public class Demo1 {

	public static void main(String[] args) {
		int[] arr={1,3,6};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("String�෽����");
		System.out.println(arrToString(arr));
		System.out.println("StringBuffer�෽����");
		System.out.println(arrToSB(arr));
		

	}
	//��String��
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
	

	//��StringBuffer
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
