package com.training.huawei;


import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * 输入描述:
 * 将一个英文语句以单词为单位逆序排放。
 * 输出描述:
 * 得到逆序的句子
 *
 * 输入
 *
 * I am a boy
 * 输出
 *
 * boy a am I
 */

public class ReverseStr2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        test(s);

    }

    private static void test(String s) {

        String[] split = s.split(" ");
        String s1 ="";
        for(int i =split.length-1;i>=0;i--){
            s1= s1+split[i]+" ";
        }
        System.out.println(s1.trim());


    }


}
