package com.training;

public class MoveZeroes {
	
	/**
	 * 给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
	 * 给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0]
	 * @param nums
	 */
	public static void moveZeroes(int[] nums) {
        // write your code here
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length-1;j++){
				if(nums[j]==0){
					nums[j]=nums[j+1];
					nums[j+1]=0;
				}
			}
		}
    }
	
	public static void main(String[] args) {
		int[] nums={0,1,0,3,12};
		moveZeroes(nums);
	}

}
