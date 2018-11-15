package com.training.huawei;


//计算字符串最后一个单词的长度，单词以空格隔开。

import java.util.Scanner;

/**
 * 一行字符串，非空，长度小于5000。
 * 输出描述:
 * 整数N，最后一个单词的长度。
 */
public class StringLengh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = test(s);
        System.out.println(i);

    }

    public static int test(String str){

        String[] split = str.split(" ");
        String s = split[split.length-1];
        int i = s.length();

        return i;

    }

}
