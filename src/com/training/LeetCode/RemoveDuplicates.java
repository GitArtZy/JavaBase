package com.training.LeetCode;

import java.util.ArrayList;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
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
