package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test7 {
    public static void main(String[] args) {
        double d = 0x12345678;
        Test7 t = new Test7();
        //=赋值语句，相当于if((flag=true)==true)，赋了什么值就返回什么
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
