package com.training;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i]== target ) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2,9,7,11};
        int target =9;
        int[] result = twoSum2(nums,target);
        for (int i:result
             ) {
            System.out.println(i);
        }
    }
}
