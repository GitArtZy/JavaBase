package com.training.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * �������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
 * �ַ�          ��ֵ
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV��
 * ���� 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��
 * ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������
 *
 * I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
 * X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90��
 * C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
 * ���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��
 * ʾ�� 1:
 *
 * ����: "III"
 * ���: 3
 * ʾ�� 2:
 *
 * ����: "IV"
 * ���: 4
 * ʾ�� 3:
 *
 * ����: "IX"
 * ���: 9
 */
public class RomanToInt {

    public static void main(String[] args) {
        String s = "IV";
        int i = romanToInt(s);
        System.out.println(i);
    }
    public static int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); ++i) {
            int val = map.get(s.charAt(i));
            if (i == s.length() - 1 || map.get(s.charAt(i + 1)) <= map.get(s.charAt(i))) {
                res += val;
            } else {
                res -= val;
            }
        }
        return res;

    }


}
