package com.training.LeetCode;

/**
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
 *
 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
 *
 * ʾ��:
 *
 * ���� nums = [2, 7, 11, 15], target = 9
 *
 * ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 * ���Է��� [0, 1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,9,7,11};
        int target =18;
        TwoSum.twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target){

        for (int i=0;i<nums.length;i++){
            for (int j=1+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" "+nums[j]);
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }
}
