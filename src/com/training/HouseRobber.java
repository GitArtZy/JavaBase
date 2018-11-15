package com.training;

public class HouseRobber {

	/*
	 * 给定一个非负整数列表，表示每个房子中存放的钱， 算一算，如果今晚去打劫，
	 * 你最多可以得到多少钱 在不触动报警装置的情况下。 给定 [3, 8,4], 返回 8.
	 * 
	 * @param A: An array of non-negative integers
	 * 
	 * @return: The maximum amount of money you can rob tonight
	 */
	public long houseRobber(int[] A) {
		// write your code here
		int len=A.length;  
		if(A==null||len==0)  
			return 0;  
		long res[]=new long[len];  
		//res[i]表示打劫前i个房子获得的最大金额  
		for(int i=0;i<len;i++){  
			if(i==0){  
				res[i]=A[0];
			}
			if(i==1){
				res[i]=Math.max(A[0],A[1]);
			}
			else if(i>1){  
				res[i]=Math.max(res[i-1],res[i-2]+A[i]);
			}
		}  
		return res[len-1];

	}

	public static void main(String[] args) {
/*		int[] A = { 828, 125, 740, 724, 983, 321, 773, 678, 841, 842, 875, 377, 674, 144, 340, 467, 625, 916, 463, 922,
				255, 662, 692, 123, 778, 766, 254, 559, 480, 483, 904, 60, 305, 966, 872, 935, 626, 691, 832, 998, 508,
				657, 215, 162, 858, 179, 869, 674, 452, 158, 520, 138, 847, 452, 764, 995, 600, 568, 92, 496, 533, 404,
				186, 345, 304, 420, 181, 73, 547, 281, 374, 376, 454, 438, 553, 929, 140, 298, 451, 674, 91, 531, 685,
				862, 446, 262, 477, 573, 627, 624, 814, 103 };*/
		int[] A = { 828, 125, 740, 724, 983, 321, 773, 678, 841, 842, 875, 377, 674, 144, 340, 467, 625, 916, 463, 922,
				255, 662, 692, 123, 778, 766, 254, 559, 480, 483, 904, 60, 305, 966, 872, 935, 626, 691, 832, 998, 508,
				657, 215, 162, 858, 179, 869, 674, 452, 158, 520, 138, 847, 452, 764, 995, 600, 568, 92, 496, 533, 404,
				186, 345, 304, 420, 181, 73, 547, 281, 374, 376};
		HouseRobber h = new HouseRobber();
		long houseRobber = h.houseRobber(A);
		System.out.println(houseRobber);
	}

}
