package com.Designpattern;
/**
 * 装饰者设计模式
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Student s = new Student();
        DecoratStudent d = new DecoratStudent(s);
        d.code();
    }
}
interface Coder{
    public void code();
}
class Student implements Coder{
    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("javaweb");
    }
}
class DecoratStudent implements Coder{
    private Student student;  //获取被装饰者的引用

    //在构造方法中传入被装饰者对象
    public DecoratStudent(Student student){
        this.student=student;
    }
    //增强方法
    @Override
    public void code() {
        student.code();
        System.out.println("ssm");
        System.out.println("sql");
    }
}
