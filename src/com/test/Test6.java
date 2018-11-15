package com.test;

public class Test6 {

    public static void main(String[] args) {
        //if((flag=true)==true)
        int t = t();
        System.out.println(t);
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

    public static int t(){
        try{
            int i= 0;
            return i;
        }finally {
            return 1;
        }
    }


}

