package com.training.LeetCode;

import java.util.*;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int i = SearchInsert.searchInsert(nums, target);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=(high+low)/2;
        if(nums.length == 0)
            return 0;
        if(nums == null)
            return -1;
        while (low<=high){
            mid=(high+low)/2;
            if (target>nums[mid]){
                low=mid+1;
            }else if (target<nums[mid]){
                high=mid-1;
            }else {
                return mid;
            }
        }
        return low;
    }
}
