package com.training.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * 给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。
 * <p>
 * 输入描述:
 * 输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。
 * <p>
 * <p>
 * 输出描述:
 * 对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。
 */
public class Demo1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
            for(int i =1;i<=n;i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                if ((a + b) > c) {
                    list.add("true");

                } else {
                    list.add("false");

                }
            }

            for (int i = 0;i<list.size();i++){

                System.out.println("Case #" + (i+1) + ": "+list.get(i));
            }



    }
}
