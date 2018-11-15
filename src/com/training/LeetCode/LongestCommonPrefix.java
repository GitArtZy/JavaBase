package com.training.LeetCode;

/**
 * ��дһ�������������ַ��������е������ǰ׺��
 *
 * ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
 *
 * ʾ�� 1:
 *
 * ����: ["flower","flow","flight"]
 * ���: "fl"
 * ʾ�� 2:
 *
 * ����: ["dog","racecar","car"]
 * ���: ""
 * ����: ���벻���ڹ���ǰ׺��
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs ={"flower","flow","flight"};
        String s = LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(s);
    }

    /**
     * 1. ����Ҫ�������ַ������ĸ���ֻ��Ҫ�������ַ����ĳ��ȼ��ɡ�
     * 2. �ַ�����ļ���������ж�Ӧ���������ˡ�
     * 1���ַ�����Ϊ�� []
     * 2�������ַ���Ϊ��[ ��,��]
     * 3)  �������������
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
