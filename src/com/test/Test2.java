package com.test;

import java.util.HashMap;

public class Test2 {

    public static void main(String[] args) {


        int f = f(f(9));
//        System.out.println(f);

        System.out.println(foo(20, 13));


    }

    public static int f(int n){

        Boolean flag = false;
        if(n<=3) {
            return 1;
        }
        else {
            return f(n - 2) + f(n - 6) + 1;
        }

    }
    public static int foo(int x, int y){
        if (x <= 0 || y <= 0)
            return 1;
        return 3 * foo( x-6, y/2 );
    }
}
