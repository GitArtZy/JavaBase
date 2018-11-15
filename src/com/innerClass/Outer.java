package com.innerClass;

import java.sql.SQLOutput;

public class Outer {

    private int num = 30;
    public static int i=1;

    public void method() {
        //局部内部类
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
//        内部类的访问方法
//          Outer.Inner oi = new Outer().new Inner();
//          oi.show();
        //静态内部类的访问方法
//        Outer.Inner oi = new Outer.Inner();
//          oi.show();
//        静态内部类的访问静态方法
//        Outer.Inner.show1();
//        局部内部类的访问
        Outer o = new Outer();
        o.method();
    }
}
