package com.SetImpl;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
//	//* TreeSet存储自定义对象并遍历练习2(按照姓名的长度排序)
//	@Override
//	public int compareTo(Person o) {
//		int length =this.name.length()-o.name.length();//比较姓名长度
//		int num = length ==0? this.name.compareTo(o.name): length;//如果长度一致，比较姓名内容
//		return num ==0? this.age-o.age:num;//果然都一致，比较年龄
//	}
	
//	//TreeSet存储自定义对象并遍历练习2(按照年龄排序)
//	@Override
//	public int compareTo(Person o) {
//		int num = this.name.compareTo(o.name); //姓名是主要条件
//		return num == 0 ? this.age-o.age: num; //如果姓名一样比较年龄
//	}
	
//	//TreeSet存储自定义对象并遍历练习1(按照年龄排序)
//	@Override
//	public int compareTo(Person o) {
//		int num = this.age-o.age;  //年龄是比较的主要条件
//		return num== 0? this.name.compareTo(o.name):num;  //如果两个年纪一样，比较年龄
//	}
	
	
	
	
	

}
