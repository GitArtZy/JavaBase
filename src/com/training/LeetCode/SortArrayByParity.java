package com.training.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����һ���Ǹ��������� A������һ���� A ������ż��Ԫ����ɵ����飬����� A ����������Ԫ�ء�
 *
 * ����Է���������������κ�������Ϊ�𰸡�
 *
 *
 *
 * ʾ����
 *
 * ���룺[3,1,2,4]
 * �����[2,4,3,1]
 * ��� [4,2,3,1]��[2,4,1,3] �� [4,2,1,3] Ҳ�ᱻ���ܡ�
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
