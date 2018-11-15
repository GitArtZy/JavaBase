package com.ListImpl;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
	* 思路：创建新集合方式
 */
public class Demo5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		System.out.println(list);
		ArrayList<String> newList = getSingle(list);
		System.out.println(newList);

	}

	private static ArrayList<String> getSingle(ArrayList<String> list) {
		ArrayList<String> newList= new ArrayList<String>();
		Iterator<String> it= list.iterator();
		while(it.hasNext()){
			String str = it.next();
			if(!newList.contains(str)){
				newList.add(str);
			}
		}
		return newList;
	}

}
