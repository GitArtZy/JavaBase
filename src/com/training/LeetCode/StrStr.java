package com.training.LeetCode;

/**
 * ����һ�� haystack �ַ�����һ�� needle �ַ�����
 * �� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��
 */
public class StrStr {

    public static void main(String[] args) {

        String haystack="hello";
        String needle ="ll";
        StrStr.strStr(haystack,needle);
    }

    public static int strStr(String haystack, String needle) {

        int i = haystack.indexOf(needle);
        System.out.println(i);

        return i;
    }
}
