package com.SetImpl;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Student_TreeSet {
	/**
	 * * A:������ʾ
	 * ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
	 * 
	 * ����:
	 * 1,����һ��ѧ����
	 * 		��Ա����:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܳɼ�
	 * 		��Ա����:�ղ�,�вι���,�вι���Ĳ����ֱ�������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
	 * 			  toString����,�ڱ��������е�Student�����ӡ�������õ�ʱ�����ʾ����ֵ
	 * 2,����¼����ҪScanner,��������¼�����
	 * 3,����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,�����ֱܷȽ�
	 * 4,¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ͽ��д洢
	 * 5,��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӶ���Ԫ��ת����int��,
	 * 6,��ת����Ľ����װ��Student����,��Student���ӵ�TreeSet������
	 * 7,����TreeSet���ϴ�ӡÿһ��Student����
	 */
	public static void main(String[] args) {
		//2,����¼����ҪScanner,��������¼�����
		Scanner sc= new Scanner(System.in);
		System.out.println("������ѧ���ɼ���ʽ��:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
		//3,����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,�����ֱܷȽ�
		TreeSet<Student> ts =new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getSum()-o1.getSum();
				return num==0? 1:num;
			}
		});
		//4,¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ͽ��д洢
		while (ts.size()<5) {
			//5,��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӶ���Ԫ��ת����int��,
		    String line= sc.nextLine();
		    String[] arry=line.split(",");
		   // 6,��ת����Ľ����װ��Student����,��Student���ӵ�TreeSet������
		   int chinese = Integer.parseInt(arry[1]);
		   int math =Integer.parseInt(arry[2]);
		   int english= Integer.parseInt(arry[3]);
		   ts.add(new Student(arry[0], chinese, math, english));
		}
		
//		7,����TreeSet���ϴ�ӡÿһ��Student����
		System.out.println("������ѧ����Ϣ:");
	for (Student student : ts) {
		System.out.println(student);
	}
		 

 
	}
	
}