package com.training.program;

import java.util.Scanner;
/**
 * 输入描述:
 * 读取这一行字符串，每个字符串长度小于80个字符
 *
 *
 * 输出描述:
 * 对于每组数据，输出每行字符串的加密字符串。
 *
 * 输入例子1:
 * Hello! How are you!
 *
 * 输出例子1:
 * Ifmmp! Ipx bsf zpv!
 */
public class CodeTranslate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        test(s);

    }

    private static void test(String s) {

        char[] c = s.toCharArray();
        for(int i =0;i<c.length;i++){
            if ((c[i]>='a'&&c[i]<='y')||(c[i]>='A'&&c[i]<='Y')){
                c[i]+=1;
            }else if (c[i]>='z'){
                c[i]='a';
            }else if(c[i]>='Z'){
                c[i]='A';
            }
        }
        System.out.println(c);

    }
}
