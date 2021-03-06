package com.training.LeetCode;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [?231,  231 ? 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Reverse {

    public static void main(String[] args) {
        int x = 121;
        int reverse = Reverse.reverse(x);
        System.out.println(reverse);

    }
    public static int reverse(int x) {
        int rev = 0;
        int pop = x % 10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        String s = x+"";
        int num;
        if (s.contains("-")){
            String s1 = s.substring(1);
            StringBuffer sb = new StringBuffer(s1);
            sb.append("-").reverse();
            num = Integer.parseInt(sb.toString());
        }else{
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            num = Integer.parseInt(sb.toString());;
        }
        return num;


    }

}
