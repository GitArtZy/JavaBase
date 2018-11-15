package com.ListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
 */
public class Demo6 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList();
		list.add(new Student("����",23));
		list.add(new Student("����",23));
		list.add(new Student("����",24));
		list.add(new Student("����",24));
	    list.add(new Student("����",25));
	    list.add(new Student("����",26));
	    list.remove(1);
	    
	    Iterator<Student> it = list.iterator();
	    while (it.hasNext()) {
			Student stu =  it.next();
			System.out.print(stu.getName()+"---"+stu.getAge());
		
		}
	    System.out.println("------ִ��ǰ��-------");
	    ArrayList<Student> newList = getSingle(list);
	    Iterator<Student> nit = newList.iterator();
	    while (nit.hasNext()) {
			Student stu = (Student) nit.next();
			System.out.print(stu.getName()+"---"+stu.getAge());
			
		}
	    
	}
	private  static ArrayList<Student> getSingle(ArrayList<Student> list){
		ArrayList<Student> newList= new ArrayList<Student>();
		 Iterator<Student> it = list.iterator();
		 while (it.hasNext()) {
			Student student = (Student) it.next();
			if(!newList.contains(student)){
				newList.add(student);
			}
		}
		
		return newList;
		
	}

}
