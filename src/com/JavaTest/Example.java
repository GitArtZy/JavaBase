package com.JavaTest;
//Java的参数传递方式是值传递，当参数是简单类型时，不改变参数的值；
//当参数是引用类型时,不改变这个对象的引用。
//String 比较特别，看过String 代码的都知道， String 是  final 的。所以值是不变的。 
//函数中String对象引用的副本指向了另外一个新String对象,
//而数组对象引用的副本没有改变,而是改变对象中数据的内容.
public class Example {
	String str=new String("good");
	char[] ch={'a','b','c'};
	public static void main(String[] args) {
		Example ex= new Example();
		ex.change(ex.str, ex.ch);
		System.out.println(ex.str+"and");
		System.out.println(ex.ch);
	}
	public void change(String str,char ch[]){
		str="test go";//相当于str = new String("test ok");这里str重新指向了一个对象
		// ch = {'a','b','c'};如果加一句这时候就改变内部ch的数据地址了，
		//它的内容虽然还是abc，但是已经指向一个新的数据区域。
		ch[0]='g';
		
	}
	//change()的参数str和ch[]都是引用类型，在类Example中str指向"good"的地址，ch[]指向ch[]的地址，
	//使用str="test ok"后在change()内str指向"test ok"，
	//但在类中str仍指向"good"，而ch[0]仍指向ch[0]，
	//因为String与StringBuffer不同，改变它的值实际上是改变了它指向的内存地址(新开辟)，
	//但由函数返回时仍指向原地址。

}
