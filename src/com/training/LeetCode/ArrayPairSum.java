package com.training.LeetCode;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 *
 * 示例 1:
 *
 * 输入: [1,4,3,2]
 *
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 */
public class ArrayPairSum {

    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        int i = arrayPairSum(nums);
        System.out.println(i);
    }

    public static int arrayPairSum(int[] nums) {

        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        //偶数位求和
        int sum = 0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                sum+=nums[k];
            }
        }
        return sum;
    }
}
