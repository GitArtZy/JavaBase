package com.training.pat;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 *
 *
 *
 * A1 = 能被5整除的数字中所有偶数的和；
 *
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 *
 * A3 = 被5除后余2的数字的个数；
 *
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 *
 * A5 = 被5除后余4的数字中最大数字。
 */
public class Demo2 {

    public static void main(String[] args) {

        int flag = 1;
        int j=0;
        String c4=" ";
        int A1=0;
        int A2=0;
        int A3=0;
        double A4=0;
        int A5=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
            if (array[i]%5==0){
                if(array[i]%2==0){
                    A1 += array[i];
                }
            }
            if(array[i]%5==1){
                if(flag==1){
                    A2+=array[i];
                    flag=2;
                }else{
                    A2-=array[i];
                    flag=1;
                }
            }
            if(array[i]%5==2){
                A3++;
            }
            if(array[i]%5==3){
                A4+=array[i];
                j++;
            }
            if(array[i]%5==4){
                if(A5<=array[i]){
                    A5=array[i];
                }
            }
        }
        if(A1==0){
            System.out.print("N"+" ");
        }else {
        System.out.print(A1+" ");
        }
        if(A2==0){
            System.out.print("N"+" ");
        }else{
            System.out.print(A2+" ");
        }
        if(A3==0){
            System.out.print("N"+" ");
        }else{
        System.out.print(A3+" ");
        }
        if (A4==0){
            System.out.print("N"+" ");
        }else {
            c4 = new DecimalFormat("0.0").format(A4*1.0/j);
            System.out.print(c4+" ");
        }
        if(A5==0){
            System.out.print("N");
        }else{
            System.out.print(A5);
        }

    }


}
