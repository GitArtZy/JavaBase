package com.training.LeetCode;

/**
 * ��������Ϊ 2n ������, ��������ǽ���Щ���ֳ� n ��, ���� (a1, b1), (a2, b2), ..., (an, bn) ��ʹ�ô�1 �� n �� min(ai, bi) �ܺ����
 *
 * ʾ�� 1:
 *
 * ����: [1,4,3,2]
 *
 * ���: 4
 * ����: n ���� 2, ����ܺ�Ϊ 4 = min(1, 2) + min(3, 4).
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
        //ż��λ���
        int sum = 0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                sum+=nums[k];
            }
        }
        return sum;
    }
}
