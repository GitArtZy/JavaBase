package com.training.huawei;

import java.util.Scanner;

/**
 * 描述：
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 * 输入描述:
 * 输入一个int整数
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 */
public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        test(num);
    }
    public static void test(int num){
        String s= String.valueOf(num);
        StringBuffer sb = new StringBuffer(s);
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse.toString());

    }

}
