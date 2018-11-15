package com.training;
/**
 * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。
 * @author 50131
 *
 */
public class RemoveDuplicates {
	/**
     * @param : a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums){
    	// write your code here
        int l = nums.length;
        int j = 1;
        if(l==0){
            return 0;
        }
        for(int i=1;i<l;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else{
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
		int[] nums = {1,2,1,1,1,4,3,6};
		RemoveDuplicates r = new RemoveDuplicates();
		int removeDuplicates = r.removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}
}
