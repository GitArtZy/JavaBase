package com.training;

public class HouseRobber2 {
	
	/*在上次打劫完一条街道之后，窃贼又发现了一个新的可以打劫的地方，但这次所有的房子围成了一个圈，
	 * 这就意味着第一间房子和最后一间房子是挨着的。每个房子都存放着特定金额的钱。
	 * 你面临的唯一约束条件是：相邻的房子装着相互联系的防盗系统，且当相邻的两个房子同一天被打劫时，该系统会自动报警。
	 * 给出nums = [3,6,4], 返回6，你不能打劫3和4所在的房间，
	 * 因为它们围成一个圈，是相邻的。
	 * @param A: An array of non-negative integers
	 * 
	 * @return: The maximum amount of money you can rob tonight
	 */
    public int houseRobber2(int[] nums) {
        // write your code here
    	int length = nums.length;
    	if(nums==null||length==0){
    		return 0;
    	}
    	
    	return 0;
    }

}
