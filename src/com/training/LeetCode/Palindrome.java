package com.training.LeetCode;

/**
 *�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 *
 * ʾ�� 1:
 *
 * ����: 121
 * ���: true
 * ʾ�� 2:
 *
 * ����: -121
 * ���: false
 * ����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
 * ʾ�� 3:
 *
 * ����: 10
 * ���: false
 * ����: ���������, Ϊ 01 �����������һ����������
 */
public class Palindrome {

    public static void main(String[] args) {
        int x=1000021;
        boolean b = Palindrome.isPalindrome(x);
        System.out.println(b);
    }
    public static boolean isPalindrome(int x) {
        String s = x+"";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        int count=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=sb.charAt(i)){
                System.out.println(s.charAt(i));
                System.out.println(sb.charAt(i));
                return false;
            }else {
                count++;
            }
            if(count==s.length()){
                return true;
            }
        }
        return false;
    }
}
