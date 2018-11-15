package com.training.huawei;


import java.util.LinkedList;
import java.util.Scanner;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * 输入描述:
 * 输入一个整数（int类型）
 * 输出描述:
 * 这个数转换成2进制后，输出1的个数
 */
public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        demo1(num);

    }

        private static void demo1(int num) {

        String s = Integer.toBinaryString(num);
        int i1 = Integer.parseInt(s);
        System.out.println(s);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);

    }


}
