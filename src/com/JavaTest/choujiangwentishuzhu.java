package com.JavaTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//����n����ֵ�����������ȡk��������˳�����г�������
public class choujiangwentishuzhu {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����n�����֣�");
		int n=input.nextInt();
		System.out.println("��"+n+"��������ȡ��k�����֣�");
		int k=input.nextInt();
		
		//��ʼ��һ�����鳤��Ϊn������num
		int[] num=new int[n];
		//��n��������������
		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		//��ʼ��һ�����鳤��Ϊk������result
		int[] result=new int[k];
		//��n�����������ȡk��������������
		for(int i=0;i<result.length;i++){
			int r= (int) (Math.random()*n);
			result[i]=num[r];
			//����num��ȡ�������ظ�
			num[r]=num[n-1];
			n--;
		}
		//��result�����������
		Arrays.sort(result);
		System.out.println("��ȡ������");
		for(int i:result){
			System.out.println(i);
		}
	}

}
