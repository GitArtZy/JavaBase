package com.JavaTest;
//Java�Ĳ������ݷ�ʽ��ֵ���ݣ��������Ǽ�����ʱ�����ı������ֵ��
//����������������ʱ,���ı������������á�
//String �Ƚ��ر𣬿���String ����Ķ�֪���� String ��  final �ġ�����ֵ�ǲ���ġ� 
//������String�������õĸ���ָ��������һ����String����,
//������������õĸ���û�иı�,���Ǹı���������ݵ�����.
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
		str="test go";//�൱��str = new String("test ok");����str����ָ����һ������
		// ch = {'a','b','c'};�����һ����ʱ��͸ı��ڲ�ch�����ݵ�ַ�ˣ�
		//����������Ȼ����abc�������Ѿ�ָ��һ���µ���������
		ch[0]='g';
		
	}
	//change()�Ĳ���str��ch[]�����������ͣ�����Example��strָ��"good"�ĵ�ַ��ch[]ָ��ch[]�ĵ�ַ��
	//ʹ��str="test ok"����change()��strָ��"test ok"��
	//��������str��ָ��"good"����ch[0]��ָ��ch[0]��
	//��ΪString��StringBuffer��ͬ���ı�����ֵʵ�����Ǹı�����ָ����ڴ��ַ(�¿���)��
	//���ɺ�������ʱ��ָ��ԭ��ַ��

}
