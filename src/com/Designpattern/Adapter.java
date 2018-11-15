package com.Designpattern;
/**
 * 适配器模式
 * * 在使用监听器的时候, 需要定义一个类事件监听器接口.
	* 通常接口中有多个方法, 而程序中不一定所有的都用到, 但又必须重写, 这很繁琐.
	* 适配器简化了这些操作, 我们定义监听器时只要继承适配器, 然后重写需要的方法即可.
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
		System.out.println("假摔");
		System.out.println("瑟瑟发抖");
	}
}