package com.training.LeetCode;

import java.util.ArrayList;

/**
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 *
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums ={1,2,1,1,1,4,3,6};
        int i = RemoveDuplicates.removeDuplicates2(nums);
        System.out.println();
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                continue;
            }else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static int removeDuplicates2(int[] nums){
        ArrayList<Integer> list = new ArrayList();
        int count=1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(i-1);
                count++;
            }
        }
        for (int j:list
             ) {
            System.out.print(j);
        }
        return count;
    }

}
