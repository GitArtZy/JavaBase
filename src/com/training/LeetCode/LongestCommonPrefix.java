package com.training.LeetCode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs ={"flower","flow","flight"};
        String s = LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(s);
    }

    /**
     * 1. 不需要求出最短字符串是哪个，只需要求出最短字符串的长度即可。
     * 2. 字符串组的几种情况的判断应更清晰明了。
     * 1）字符串组为空 []
     * 2）公共字符串为空[ ”,”]
     * 3)  按正常情况来做
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        for(int i=1;i<=strs[0].length();i++){
            String head = strs[0].substring(0,i);
            for(String str:strs){
                if(!str.startsWith(head))
                    return head.substring(0,i-1);
            }
        }
        return strs[0];
    }
}
