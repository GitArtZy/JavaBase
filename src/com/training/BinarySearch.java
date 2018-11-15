package com.training;

public class BinarySearch {

	/**
	 * 给定一个排序的整数数组（升序）和一个要查找的整数target， 用O(logn)的时间查找到target第一次出现的下标（从0开始），
	 * 如果target不存在于数组中，返回-1。
	 * 
	 * @param nums:
	 *            The integer array.
	 * @param target:
	 *            Target to find.
	 * @return: The first position of target. Position starts from 0.
	 */
	//错误
	public int binarySearch(int[] nums, int target) {
		// write your code here
		int max = nums.length - 1;
		int min = 0;
		int mid = (max + min) >> 1;
		while (min <= max) {
			mid = (max + min) >> 1;
			if (nums[mid] >= target) {
				max = mid - 1;
			} 
			else if (nums[mid] < target) {
				min = mid + 1;
			} else{
				return mid;
			}
			
		}
		//return nums[mid] == target? mid : -1;
		return -1;
	}
	public int binarySearch2(int[] nums, int target) {
        //write your code here
         if (nums == null || nums.length == 0) {  
        return -1;  
    }  
    int start = 0, end = nums.length - 1;  
    while (start + 1 < end) {  
        int mid = start + (end - start) / 2;  
        if (nums[mid] >= target) {  
            end = mid;  
        } else {  
            start = mid;  
        }  
    }  
      
    if (nums[start] == target) {  
        return start;  
    }  
    if (nums[end] == target) {  
        return end;
    }  
    return -1;
}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 8, 8, 8, 8, 8, 10, 13, 14 };
		int target = 8;
		BinarySearch b = new BinarySearch();
		int binarySearch = b.binarySearch2(nums, target);
		System.out.println(binarySearch);
	}
}
