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
		
		//��B�������A����,��A�����һ��Ԫ�غ����B�����һ����Ȼ����A�ڶ���Ԫ�غ��B�ڶ���
		ListIterator<String> aIter=a.listIterator();
		Iterator<String> bIter=b.iterator();
		//����������Ƿ���Ԫ�ء�
		while (bIter.hasNext()) {
			if(aIter.hasNext())
			aIter.next();
			aIter.add(bIter.next());
			
		}
		System.out.println(a);
		
		//ɾ��B��ÿ���ڶ���Ԫ��
		bIter=b.iterator();
		while (bIter.hasNext()) {
			//������һ��Ԫ��
			bIter.next();
			if(bIter.hasNext()){
			bIter.next();
			bIter.remove();
			}
			
		}
		System.out.println(b);
		
		//ɾ��A������B�����Ԫ��
		a.removeAll(b);
		System.out.println(a);
	}

}
