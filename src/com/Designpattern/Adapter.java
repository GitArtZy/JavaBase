package com.Designpattern;
/**
 * ������ģʽ
 * * ��ʹ�ü�������ʱ��, ��Ҫ����һ�����¼��������ӿ�.
	* ͨ���ӿ����ж������, �������в�һ�����еĶ��õ�, ���ֱ�����д, ��ܷ���.
	* ������������Щ����, ���Ƕ��������ʱֻҪ�̳�������, Ȼ����д��Ҫ�ķ�������.
 * @author Administrator
 *
 */

public class Adapter {
	public static void main(String[] args) {
		Meiss meiss =new Meiss();
		meiss.cry();
		
				
	}

}
interface Soccer{
	public void pass();
	public void shot();
	public void flag();
	public void cry();
}
abstract class Sf implements Soccer{
	@Override
	public void pass() {
		// TODO Auto-generated method stub
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}@Override
	public void flag() {
		// TODO Auto-generated method stub
		
	}@Override
	public void shot() {
		// TODO Auto-generated method stub
	}
}
class Meiss extends Sf{
	@Override
	public void cry() {
		System.out.println("��ˤ");
		System.out.println("ɪɪ����");
	}
}