package com.SetImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Set_HashSet_TreeSet {
	
	public static void main(String[] args) {
		
		//Demo2();
        //Demo3();
        //Demo4();
		//Demo5();
		//Demo6();
		//Demo7();
		//Demo8();
		
		Demo9();
	}
	private static void Demo9() {
		//ͨ���Ƚ����Ƚ��ַ�����������
		TreeSet<String> ts =new TreeSet<>(new CompareLen());
		
		ts.add("aaaa");
		ts.add("bbbb");
		ts.add("nba");
		ts.add("cba");
		
			System.out.println(ts);
	}
	private static void Demo8() {
		//* TreeSet�洢�Զ�����󲢱�����ϰ2(���������ĳ�������)
		TreeSet<Person> ts =new TreeSet<>();
		ts.add(new Person("zhangsan",23));
		ts.add(new Person("lisi",24));
		ts.add(new Person("wangwu",25));
		ts.add(new Person("zhaonliu",26));
		ts.add(new Person("zhangsan",27));
		
			System.out.println(ts);
	}
	private static void Demo7() {
		/**
		 * TreeSet�洢�Զ�����󲢱�����ϰ2(������������)
		 */
		TreeSet<Person> ts =new TreeSet<>();
		ts.add(new Person("����",23));
		ts.add(new Person("����",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",26));
		ts.add(new Person("����",27));
		
			System.out.println(ts);
	}
	private static void Demo6() {
		/**
		 *  A:������ʾ
		 * TreeSet�洢�Զ�����󲢱�����ϰ1(������������)
		 */
		TreeSet<Person> ts =new TreeSet<>();
		ts.add(new Person("����",23));
		ts.add(new Person("����",27));
		ts.add(new Person("����",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",26));
		
		
			System.out.println(ts);
	}
	/**
	 * �������е��ظ�Ԫ��ȥ��
	 */
	private static void Demo5() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		System.out.println(list);
		System.out.println("ȥ���ظ���:");
		getSingle(list);
		System.out.println(list);
	}

	/*
	 * �������е��ظ�Ԫ��ȥ��
	 * 1,void
	 * 2,List<String> list
	 */
	public static void getSingle(List<String> list) {
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		//��list�����е�����Ԫ����ӵ�lhs
		lhs.addAll(list);
		//���ԭ����
		list.clear();
		//��ȥ���ظ���Ԫ����ص�list��
		list.addAll(lhs);
		
		
	}


	/**
	 * * ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
		* aaaabbbcccddd		
	 */
	private static void Demo4() {
		Scanner sc =new Scanner(System.in);
		System.out.println("�������ַ���");
		String str= sc.nextLine();
		//���ַ���ת�����ַ�����
		char[] arry= str.toCharArray();
		HashSet<Character> hs =new HashSet<>();
		//�����ַ�����
		for (char c : arry) {
			//���ַ������е��ַ���ӵ�������
			hs.add(c);
		}
		//��������
		for (Character ch : hs) {
			System.out.println(ch);
		}
	}



	private static void Demo3() {
		//		A:������ʾ
		//		* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
				HashSet<Integer> hs= new HashSet<>();
				Random rd= new Random();
				while (hs.size()<10) {
					//hs.add(rd.nextInt(20)+1);
					int num= rd.nextInt(20)+1;
					hs.add(num);
				}
				for (Integer integer : hs) {
					System.out.println(integer);
				}
	}
	
	

	private static void Demo2() {
		Scanner sc =new Scanner(System.in);
		HashSet<Person> hs= new HashSet<>();
		
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 24));
		
		for (Person person : hs) {
			System.out.println(person);
		}
	}

}
//ͨ���Ƚ����Ƚ�

class CompareLen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int num = o1.length()-o2.length();//�����ַ������ȱȽ�
		return num ==0? o1.compareTo(o2):num;//�ٰ������ݱȽ�
	}
	
}
