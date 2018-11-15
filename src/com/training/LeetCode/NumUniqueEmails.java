package com.training.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * ���룺["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * �����2
 * ���ͣ�ʵ���յ��ʼ����� "testemail@leetcode.com" �� "testemail@lee.tcode.com"��
 */
public class NumUniqueEmails {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(emails);
    }


    public static int numUniqueEmails(String[] emails) {
        Set s = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            String name = emails[i].substring(0, emails[i].indexOf("@")).replace(".", "");
            String domain = emails[i].substring(emails[i].indexOf("@") + 1);
            String sub = "";
            if (name.contains("+")) {
                sub = name.substring(0, name.indexOf("+"));
            }
            s.add(sub + domain);
        }
        System.out.println(s.size());
        return s.size();
    }
}
