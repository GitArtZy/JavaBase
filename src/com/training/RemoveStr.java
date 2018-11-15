package com.training;

import java.util.Scanner;

public class RemoveStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        test(s);
    }

    public static void test (String s){
        char[] c = s.toCharArray();
        int p = 0;
        for (int i=0;i<c.length-1;i++){
            for(int j=1;j<c.length-i;j++){
                if((c[j-1]>='A'&&c[j-1]<='Z')&&(c[j]>='a'&&c[j]<='z')){
                    char temp;
                    temp = c[j];
                    c[j] = c[j-1];
                    c[j-1] = temp;
                }
            }
        }
        System.out.println(String.valueOf(c));
    }
}
