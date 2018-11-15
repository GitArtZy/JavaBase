package com.training;

public class Reverse {
	   /*将一个整数中的数字进行颠倒，当颠倒后的整数溢出时，返回 0 (标记为 32 位整数).当整数太大是会溢出
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public static int reverseInteger(int n) {
        // write your code here
        String s = n+"";
        if(s.contains("-")){
        	String str = s.substring(1);
        	StringBuffer str1 = new StringBuffer(str);
        	str1.append("-").reverse();
        	int num1 = Integer.parseInt(str1.toString());
        	return num1;
        }else{
        	
        	StringBuffer str2= new StringBuffer(s);
        	str2.reverse();
        	int num2 = Integer.parseInt(str2.toString());
        	return num2;
        }
        
    }
    /**
     * 解题思路：有个技巧，在反转每一位的时候判断一下有没有越界。
     * 这里整数反转可以不判断是否为正负，
     * 因为每次都模拟翻转的过程，即取余加到上次结果左移一位，
     * 同时纪录左移一位之前的结果，判断是否移动一位之后越界溢出了。 
             一刷ac 
             二刷ac
     * @param n
     * @return
     */
    public static int reverseInteger2(int n){
    	int res = 0;
        while(n != 0){
            int val = n % 10;
            int tmp = res;
            res = tmp * 10 + val;
            n = n / 10;
            if(res / 10 != tmp) return 0;
        }
        return res;
    }
    public static void main(String[] args) {
		System.out.println(reverseInteger2(123));
	}
}
