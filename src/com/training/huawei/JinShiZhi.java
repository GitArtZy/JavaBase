package com.training.huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class JinShiZhi {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        test(d);

    }

    public static void test(double d){



        int i = (int) d;
        if ((d-i)>=0.5&&(d-i)<1) {
            i++;
            System.out.println(i);
        }else {
            System.out.println(i);
        }


    }

}
