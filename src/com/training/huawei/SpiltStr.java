package com.training.huawei;

import com.test.Test;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * <p>
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * 输出描述:
 * 输出到长度为8的新字符串数组
 */
public class SpiltStr {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            SpliteString(str1);
            System.out.println();
            SpliteString(str2);
        }
    }


    static void SpliteString(String str) {
        if (str.length() <= 8) {
            for (int i = 0; i < 8; i++)
                if (i < str.length())
                    System.out.print(str.charAt(i));
                else
                    System.out.print("0");
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
            SpliteString(str.substring(8));//递归，再判断除去前8个字符之后的长度是否大于8
        }
    }

}
