package com.test;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {1,0,2,7,9,4,5,3};
        Test5.maopao(array);
        for (int i:array
             ) {
            System.out.print(i);
        }
    }

    private static void maopao(int[] array) {

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if(array[j+1]>array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }


}

