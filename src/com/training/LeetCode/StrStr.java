package com.training.LeetCode;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
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
