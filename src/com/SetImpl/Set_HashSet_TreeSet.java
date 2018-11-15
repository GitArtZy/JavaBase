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
		//通过比较器比较字符串长度排序
		TreeSet<String> ts =new TreeSet<>(new CompareLen());
		
		ts.add("aaaa");
		ts.add("bbbb");
		ts.add("nba");
		ts.add("cba");
		
			System.out.println(ts);
	}
	private static void Demo8() {
		//* TreeSet存储自定义对象并遍历练习2(按照姓名的长度排序)
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
		 * TreeSet存储自定义对象并遍历练习2(按照年龄排序)
		 */
		TreeSet<Person> ts =new TreeSet<>();
		ts.add(new Person("张三",23));
		ts.add(new Person("李四",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("赵六",26));
		ts.add(new Person("张三",27));
		
			System.out.println(ts);
	}
	private static void Demo6() {
		/**
		 *  A:案例演示
		 * TreeSet存储自定义对象并遍历练习1(按照年龄排序)
		 */
		TreeSet<Person> ts =new TreeSet<>();
		ts.add(new Person("张三",23));
		ts.add(new Person("张三",27));
		ts.add(new Person("李四",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("赵六",26));
		
		
			System.out.println(ts);
	}
	/**
	 * 将集合中的重复元素去掉
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
		System.out.println("去除重复后:");
		getSingle(list);
		System.out.println(list);
	}

	/*
	 * 将集合中的重复元素去掉
	 * 1,void
	 * 2,List<String> list
	 */
	public static void getSingle(List<String> list) {
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		//将list集合中的所有元素添加到lhs
		lhs.addAll(list);
		//清空原集合
		list.clear();
		//将去除重复的元素添回到list中
		list.addAll(lhs);
		
		
	}


	/**
	 * * 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
		* aaaabbbcccddd		
	 */
	private static void Demo4() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入字符串");
		String str= sc.nextLine();
		//将字符串转换成字符数组
		char[] arry= str.toCharArray();
		HashSet<Character> hs =new HashSet<>();
		//遍历字符数组
		for (char c : arry) {
			//将字符数组中的字符添加到集合中
			hs.add(c);
		}
		//遍历集合
		for (Character ch : hs) {
			System.out.println(ch);
		}
	}



	private static void Demo3() {
		//		A:案例演示
		//		* 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
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
		
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		
		for (Person person : hs) {
			System.out.println(person);
		}
	}

}
//通过比较器比较

class CompareLen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int num = o1.length()-o2.length();//按照字符串长度比较
		return num ==0? o1.compareTo(o2):num;//再按照内容比较
	}
	
}
