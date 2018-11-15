package com.Designpattern;
/**
 * װ�������ģʽ
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
    private Student student;  //��ȡ��װ���ߵ�����

    //�ڹ��췽���д��뱻װ���߶���
    public DecoratStudent(Student student){
        this.student=student;
    }
    //��ǿ����
    @Override
    public void code() {
        student.code();
        System.out.println("ssm");
        System.out.println("sql");
    }
}
