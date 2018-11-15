package com.test;
// 子类将继承父类所有的数据域和方法。
//但不能重写私有和fianl修饰的方法和数据域
public class Test8 {

    private void t(){}
    private final void t1(){
    }
    public void t2(){}
}
class ChildT8 extends Test8{
//    @Override
//    private void t(){}
//    @Override
//    private final void t1(){}
    @Override
    public void t2(){}
}
