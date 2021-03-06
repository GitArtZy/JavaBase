package com.training.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class SortArrayByParity {

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        int[] ints = sortArrayByParity(A);
        for (int i :ints
             ) {
            System.out.println(i);
        }
    }

    public static int[] sortArrayByParity(int[] A){
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        int[] array =new int[A.length];
        for (int i=0;i<A.length;i++){
            if(A[i]%2==0){
                B.add(A[i]);
            }else {
                C.add(A[i]);
            }
        }
        for (int j=0;j<C.size();j++){
            B.add(C.get(j));
        }
        for (int k=0;k<B.size();k++){
            array[k]=B.get(k);
        }

        return array;
    }


}
