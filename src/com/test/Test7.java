package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test7 {
    public static void main(String[] args) {
        double d = 0x12345678;
        Test7 t = new Test7();
        //=��ֵ��䣬�൱��if((flag=true)==true)������ʲôֵ�ͷ���ʲô
        boolean flag = true;
        if (flag = true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
