package com.demo_Srtring;
//1. �ֲ��������ֻ����ε���������ͬ���ֱ���
//2. �����Ĳ�����������1. �ֲ��������ֻ����ε���������ͬ���ֱ���

class Value{
	public int i=15;
}
public class Demo6 {

	public static void main(String[] args) {
		Demo6 d= new Demo6();
		d.first();

	}
	public void first(){
		int i=5;//ע�����i�Ǿֲ�����
	    Value v= new Value();
	    v.i=25;//������һ��Value���󣬲��Ѵ˶��������i��ֵ25(Ĭ��ֵΪ15)
	    second(i,v);//v (v�е�����iֵΪ25) �� �ֲ�����i ��������second
	    System.out.println(v.i);//v������i��second�����б���Ϊ��20

	}
	public void second(int i,Value v) {
		i=0;//second�����еľֲ���������֮ǰ��iû��ϵ
		v.i=20;//��������V������i��Ϊ20
		Value val= new Value();
		v=val;//�´�����Value����val,����iֵΪ15������vָ��val����v�Ѿ���֮ǰ�������Ķ���û��ϵ��
		System.out.println("v.i="+v.i+" "+"i="+i);//��ʱv������iΪ15������� 15(v.i) 0(i)
		
	}

}

