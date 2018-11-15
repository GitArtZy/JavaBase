package com.ListImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//* Collection�洢�Զ�������õ��������
public class Demo2 {

	public static void main(String[] args) {
		
		Collection<Student> c =new ArrayList<Student>();
		c.add(new Student("张三",23));
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		Iterator<Student> it = c.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			System.out.println(stu.getName()+"----"+stu.getAge());
			
		}

	}

}
