package com.training;

public class FindMissing {
	
	/*
	 * 给出一个包含 0 .. N 中 N 个数的序列，找出0 .. N 中没有出现在序列中的那个数。
	 * N = 4 且序列为 [0, 1, 3] 时，缺失的数为2。
	 * 思路：
	 * 在原始数组上，把A[i] 调整到其原来的位置 是的A[i] = i ，
	 * 结束的地方就是当A[i] <0 此题目没有负数也没有影响的，A[i]>=n 显然的A[n]越界了。
	 * 
     * @param nums: An array of integers
     * @return: An integer
     */
    public static int findMissing(int[] nums) {
        // write your code here
    	int flag=0;
    	maopao(nums);
    	if(nums.length==1){
    		return nums[0]+1;
    	}
    	if(nums[0]!=0){
    		return 0;
    	}
    	for(int i=0;i<nums.length;i++){
    		if(nums[i+1]-nums[i]==1){
    			flag++;
    			continue;
    		}else{
    			return flag+1;
    		}
    	}
    	return flag+1;
    	
    }
    public static void maopao(int[] nums){
    	for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) {
				if (nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
    }
    public static int findMissing_2(int[] A) {
        // write your code here
        int n = A.length;
        for(int i = 0;i< n;i++){
            
            while( A[i] != i){
                if(A[i] <0 || A[i] >= n)
                    break;
                int tmp = A[i];
                A[i] = A[tmp];
                A[tmp] = tmp;
            }
        }
        for(int i =0;i <n;i++){
            if(A[i] !=i)
                return i;
        }
        return n;
    }


    
    public static void main(String[] args) {
		int[] nums = {3,4,1,0};
		//int findMissing = findMissing(nums);
		int findMissing = findMissing_2(nums);
		System.out.println(findMissing);
		
	}

}
