package com.demo_Srtring;
//1. 局部变量名字会屏蔽点外作用域同名字变量
//2. 函数的参数传递问题1. 局部变量名字会屏蔽点外作用域同名字变量

class Value{
	public int i=15;
}
public class Demo6 {

	public static void main(String[] args) {
		Demo6 d= new Demo6();
		d.first();

	}
	public void first(){
		int i=5;//注意这个i是局部变量
	    Value v= new Value();
	    v.i=25;//创建了一个Value对象，并把此对象的属性i赋值25(默认值为15)
	    second(i,v);//v (v中的属性i值为25) 和 局部变量i 传进函数second
	    System.out.println(v.i);//v的属性i在second函数中被改为了20

	}
	public void second(int i,Value v) {
		i=0;//second函数中的局部变量，和之前的i没关系
		v.i=20;//将传进的V的属性i改为20
		Value val= new Value();
		v=val;//新创建的Value对象val,属性i值为15，并将v指向val对象，v已经和之前传进来的对象没关系了
		System.out.println("v.i="+v.i+" "+"i="+i);//此时v的属性i为15，先输出 15(v.i) 0(i)
		
	}

}

