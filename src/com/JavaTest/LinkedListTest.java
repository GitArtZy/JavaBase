package com.JavaTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		List<String> a=new LinkedList<String>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");
		
		List<String> b=new LinkedList<String>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		//把B链表插入A链表,在A链表第一个元素后加上B链表第一个，然后在A第二个元素后加B第二个
		ListIterator<String> aIter=a.listIterator();
		Iterator<String> bIter=b.iterator();
		//检查序列中是否还有元素。
		while (bIter.hasNext()) {
			if(aIter.hasNext())
			aIter.next();
			aIter.add(bIter.next());
			
		}
		System.out.println(a);
		
		//删除B中每个第二个元素
		bIter=b.iterator();
		while (bIter.hasNext()) {
			//跳过第一个元素
			bIter.next();
			if(bIter.hasNext()){
			bIter.next();
			bIter.remove();
			}
			
		}
		System.out.println(b);
		
		//删除A中所有B链表的元素
		a.removeAll(b);
		System.out.println(a);
	}

}
