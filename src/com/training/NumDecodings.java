package com.training;

public class NumDecodings {
	
	/**
	 * 有一个消息包含A-Z通过以下规则编码

       'A' -> 1
       'B' -> 2
       ...
       'Z' -> 26
                  现在给你一个加密过后的消息，问有几种解码的方式
                  例如： 给你的消息为12，有两种方式解码 AB(12) 或者 L(12). 所以返回 2
	 */
	public static int numDecodings(String s) {
        // write your code here
		if (s.isEmpty() || (s.length() > 1 && s.charAt(0) == '0')) return 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; ++i) {
            dp[i] = (s.charAt(i - 1) == '0') ? 0 : dp[i - 1];
            if (i > 1 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6'))) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[s.length()];
    }
		
    
	public static void main(String[] args) {
		String s= " ";
		int numDecodings = numDecodings(s);
		System.out.println(numDecodings);
		
		
	}

}
