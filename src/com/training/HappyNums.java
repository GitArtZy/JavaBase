package com.training;

public class HappyNums {

	/*
	 * 一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为他每个位置上的数字的平方和，
	 * 然后重复这个过程直到这个数变为1，或是无限循环但始终变不到1。 如果可以变为1，那么这个数就是快乐数。
	 * 
	 * @param n: An integer
	 * 
	 * @return: true if this is a happy number or false
	 */
	/*public static boolean isHappy(int n) {
		// write your code here
		if (n / 100 > 9 || n == 0) {
			System.out.println("参数必须是十进制三位数！");
			return false;
		}
		int ge = n % 10;
		int shi = (n % 100) / 10;
		int bai = n / 100;
		int sum = ge * ge + shi * shi + bai * bai;

		if (sum == 1) {
			return true;
		} else if (sum == 4) {
			return false;// 确认是非快乐数，返回-1
		} else {
			return isHappy(sum);
		}

	}*/

	public static int isHappyNum(int num) {
		int res = 0;// 最终的返回值
		if (num / 100 > 9 || num == 0) {
			System.out.println("参数必须是十进制三位数！");
			return res;
		}
		int unitsDigit = num % 100 % 10;// 个位数
		int tensDigit = num % 100 / 10;// 十位数
		int hundredsDigit = num / 100;// 百位数
		int sum = unitsDigit * unitsDigit + tensDigit * tensDigit + hundredsDigit * hundredsDigit;

		if (sum == 1) {
			res = 1;// 确认是快乐数，返回1
		} else if (sum == 4) {
			res = -1;// 确认是非快乐数，返回-1
		} else {
			return isHappyNum(sum);// 未得到确切结果，进行递归处理。*
		}
		return res;
	}
	
	 public boolean isHappy(int n) {
		 if(n==1)
			 return true;
	        if(n<1)
	        	return false;
	        int s=n;
	        while(s!=89&&s!=1)
	        {
	            s=sum(s);
	            if(s==1)
	            return true;
	            if(s==89)
	            return false;
	        }
			return false;
		 
	 }
	 
	 public int sum(int n){
		 int s=0;
	        while(n!=0)
	        {
	            s=s+(n%10)*(n%10);
	            n=n/10;
	        }
	        return s;
	 }
	 
	public static void main(String[] args) {
		int n = 67;
		HappyNums h= new HappyNums();
		h.isHappy(n);
	}

}
