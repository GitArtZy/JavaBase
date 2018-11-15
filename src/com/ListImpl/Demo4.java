package com.ListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，
 如果有，我就添加一个"javaee"元素替换"world"，请写代码实现。
 */
public class Demo4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		ListIterator<String> lit =list.listIterator();
		while (lit.hasNext()) {
			String str = (String) lit.next();
			if(str.equals("world")){
				lit.remove();
				lit.add("javaee");
			}
			
		}
		System.out.println(list);
		

	}
}
