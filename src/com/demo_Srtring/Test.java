package com.demo_Srtring;

import java.util.Collections;

public class Test {
    private static final String MESSAGE="taobao";
    public static void main(String[] args) {

        String s =new String("abc");
        String s1 = "abc";
        String s2 = "a"+"bc";
        String s3 =new String("bc");
        String s4 ="a";
        System.out.println("s==s1"+s==s1);
        System.out.println("s==s2"+s==s2);
        System.out.println(s=="abc");
        System.out.println(s1=="abc");
        System.out.println("s1==s2"+s1==s2);
        System.out.println("s1==s4+s3"+s1==s4+s3);
        System.out.println("---------");
        String a ="tao"+"bao";
        String b="tao";
        String c="bao";
        String d = "oo";
        String e = "xx";
        String f = d+e;
        String g = "ooxx";
        System.out.println(f==g);
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
        int i = (int) 8850.1;
        System.out.println(i);


//        Float  f=new  Float(0.1f);
//
//        Float  t=new  Float(0.1f);
//
//        Double  u=new  Double(0.1);
//
//        System.out.println(f==t);
//        System.out.println(f.equals(t));
//        System.out.println(u.equals(f));
//        System.out.println(t.equals(u));
//        Test test =null;
//        test.hello();


    }
//    public static void hello() {
//        System.out.println("hello");
//    }
}
