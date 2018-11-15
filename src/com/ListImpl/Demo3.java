package com.ListImpl;

import java.util.ArrayList;
import java.util.List;

//* 通过size()和get()方法结合使用遍历。
public class Demo3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三",23));
		list.add(new Student("李四",24));
	    list.add(new Student("王五",25));
	    list.add(new Student("赵六",26));
	    for(int i=0;i<list.size();i++){
	    	//System.out.println(list.get(i));
	    	Student stu = list.get(i);
	    	System.out.println(stu.getName()+"---"+stu.getAge());
	    }
	}

}
