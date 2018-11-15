package com.training.LeetCode;

/**
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 *
 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
 *
 * ����Լ���������� 0 ֮�⣬��������������㿪ͷ��
 *
 * ʾ�� 1:
 *
 * ����: [1,2,3]
 * ���: [1,2,4]
 * ����: ���������ʾ���� 123��
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        int[] ints = plusOne2(digits);
        for (int i:ints
             ) {
            System.out.println(i);
        }
    }
    public static int[] plusOne(int[] digits) {
        String num ="";
        for(int i=0;i<digits.length;i++){
            num+=digits[i];
        }
        Integer integer = Integer.valueOf(num);
        integer++;
        String s = String.valueOf(integer);
        int[] n = new int[s.length()];
        for(int i=0;i<s.length();i++){
            n[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return n;
    }
    public static int[] plusOne2(int[] digits){
        int n = digits.length;
        for(int i = n-1; i >= 0; i --) {
            // ��9��1
            if(digits[i] < 9) {
                // �����ǰһλ��Ҫ��λ�Ļ���ôǰһλ��Ϊ0,���ں�һλ(Ҳ���Ǵ�ʱ�ĵ�ǰλ+1)
                digits[i]++;
                // ֱ�ӰѸı�֮������鷵��(��Ϊ��ǰλ����9�Ͳ���Ҫ��λ��,ǰ��ý���λ���Ѿ���������ֱ�Ӱ����鷵�ؾ�����)
                return digits;
            }
            // ��9��0
            digits[i] = 0;
        }
        // ȫ��Ϊ9,����Ҫ��������1λ
        /**
         * ���λ��ȫ������9�Ļ�,��ô����ԭ��=�����ϵ����е���,�����������ϵ����е������0
         * Ҳ����˵�������if������������ᶼ��û���ߵ�,����Ҫ������������
         */
        int[] result = new int[n+1];
        result[0] = 1;
        return result;

    }
}
