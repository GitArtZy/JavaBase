package com.ListImpl;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author Administrator
 *
 */
public class InvertLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		Collections.reverse(linkedList);
		System.out.println(linkedList);
		

	}
	

}
