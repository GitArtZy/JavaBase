package com.training.huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，
 * 然后输出输入字符串中含有该字符的个数。不区分大小写。
 * ABCDEF A
 * 1
 */
public class StringNums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 =sc.next();
        int i = test(s, s1);
        System.out.println(i);

    }

    public static int test(String s,String s1){

        char[] chars = s.toCharArray();

        int count = 0;
        for (int i=0;i<=chars.length-1;i++) {
            String str = String.valueOf(chars[i]);
            if (str.equalsIgnoreCase(s1)) {
                count++;
            }
        }
        return count;
    }





}

