package com.training.LeetCode;

/**
 * ����һ�� 32 λ�з����������������е����ֽ��з�ת��
 *
 * ʾ�� 1:
 *
 * ����: 123
 * ���: 321
 *  ʾ�� 2:
 *
 * ����: -123
 * ���: -321
 * ʾ�� 3:
 *
 * ����: 120
 * ���: 21
 * ע��:
 *
 * �������ǵĻ���ֻ�ܴ洢 32 λ�з�������������ֵ��Χ�� [?231,  231 ? 1]������������裬�����ת�������������򷵻� 0��
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
