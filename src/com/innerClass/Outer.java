package com.innerClass;

import java.sql.SQLOutput;

public class Outer {

    private int num = 30;
    public static int i=1;

    public void method() {
        //�ֲ��ڲ���
        class Local_Inner {
            int num = 10;
            public void show() {
                System.out.println("Local_inner");
                System.out.println(num);
            }
        }
        Local_Inner i = new Local_Inner();
        i.show();
    }

    static class Inner {
        int num = 20;
        public void show() {
            int num = 10;
            System.out.println("inner");
            System.out.println(num);
            System.out.println(i);
//            System.out.println(this.num);
//            System.out.println(Outer.this.num);
        }
//        public static void show1(){
//            System.out.println("static inner");
//        }
    }

    public void print() {
        Inner i = new Inner();
        i.show();
    }
}

class Test {
    public static void main(String[] args) {
//        �ڲ���ķ��ʷ���
//          Outer.Inner oi = new Outer().new Inner();
//          oi.show();
        //��̬�ڲ���ķ��ʷ���
//        Outer.Inner oi = new Outer.Inner();
//          oi.show();
//        ��̬�ڲ���ķ��ʾ�̬����
//        Outer.Inner.show1();
//        �ֲ��ڲ���ķ���
        Outer o = new Outer();
        o.method();
    }
}
