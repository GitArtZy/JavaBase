package com.training.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
 * 输入描述:
 * 输入N个字符
 * 输出描述:
 * 输出该字符串反转后的字符串
 */
public class ReverseStr {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        String s = sc.next();
        test1(s);
        test2(s);

    }

    private static void test2(String s) {
        String s1 = "";
        char[] c = s.toCharArray();
        for (int i =s.length()-1; i>=0;i--){
            s1+= c[i];
        }
        System.out.println(s1.toString());

    }

    private static void test1(String s) {

        StringBuffer sb= new StringBuffer(s);
        System.out.println(sb.reverse().toString());

    }


}
