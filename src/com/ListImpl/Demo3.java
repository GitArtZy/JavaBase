package com.ListImpl;

import java.util.ArrayList;
import java.util.List;

//* ͨ��size()��get()�������ʹ�ñ�����
public class Demo3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("����",23));
		list.add(new Student("����",24));
	    list.add(new Student("����",25));
	    list.add(new Student("����",26));
	    for(int i=0;i<list.size();i++){
	    	//System.out.println(list.get(i));
	    	Student stu = list.get(i);
	    	System.out.println(stu.getName()+"---"+stu.getAge());
	    }
	}

}
