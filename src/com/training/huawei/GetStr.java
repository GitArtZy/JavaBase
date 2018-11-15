package com.training.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 * 输入描述:
 * 输入N个字符，字符在ACSII码范围内。
 * 输出描述:
 * 输出范围在(0~127)字符的个数。s
 */
public class GetStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String s2 = s.substring(s.length() - 1);
            int count = 1;
            demo1(s);
            demo2(s);

        }

    }

    //通过截取字符串
    public static void demo1(String s) {
        String s2 = s.substring(s.length() - 1);
        int count = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            String s1 = s.substring(i, i + 1);
            if (!s2.contains(s1)) {
                s2 = s2 + s1;
                count++;
            }
        }
        System.out.println(count);

    }

    //通过set集合的值的不重复性
    public static void demo2(String s) {

        char[] c = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }
        System.out.println(set.size());

    }


}
