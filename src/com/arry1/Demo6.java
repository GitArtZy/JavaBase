package com.arry1;
/**
 * 需求：公司年销售额求和
 * 某公司按照季度和月份统计的数据如下：单位(万元)
      第一季度：22,66,44
      第二季度：77,33,88
      第三季度：25,45,65
      第四季度：11,66,99

 */
public class Demo6 {

	public static void main(String[] args) {
		int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum = getSum(arr);
		System.out.println(sum);

	}
	public static int getSum(int[][] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				 sum = sum + arr[i][j];
			}
			
		}
		
		return sum;
		
	}

}
