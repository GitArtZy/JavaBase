package com.ListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* ��������һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�
 ����У��Ҿ����һ��"javaee"Ԫ���滻"world"����д����ʵ�֡�
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
