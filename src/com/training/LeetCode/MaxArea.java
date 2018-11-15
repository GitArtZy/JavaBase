package com.training.LeetCode;

/**
 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ��
 * �������ڻ� n ����ֱ�ߣ���ֱ�� i �������˵�ֱ�Ϊ (i, ai) �� (i, 0)��
 * �ҳ����е������ߣ�ʹ�������� x �Ṳͬ���ɵ�����������������ˮ��
 *
 * ˵�����㲻����б�������� n ��ֵ����Ϊ 2��
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = MaxArea.maxArea(height);
        System.out.println(i);
    }

    /**
     * ˼·��
     * ���������м䣬�Ƚ����߸߶ȣ�
     * ÿ�ζ�������̵Ĳ��������ƶ�һλ��ͬʱ�������߾������̱߸߶ȵõ������
     * ������̱���ÿ������������ľ������أ����ÿ��ֻŲ���̱ߵ�һ�ˣ�ֱ������������
     * ---------------------
     * ʹ��̰���㷨?
     * ��1.���ȼ��������ҵ���ȡ����ݻ�������Ϊ i, j (�ٶ�i < j)����ô�õ�������ݻ� C = min( ai , aj ) * ( j- i) ��?
     * ? ? 2.�������ǿ���ôһ�����ʣ�?
     * ������: �� j ���Ҷ�û��һ���߻�����ߣ�������� k |( j < k && ak > aj) ����ô �� ak > aj��
     * ���� min(ai, aj, ak) =min(ai, aj) ��������i, k���ɵ��������ݻ�C�� = min(ai, aj) * (k - i) > C����C����ֵì�ܣ�
     * ���Ե�֤j�ĺ�߲����б������ߵ��ߣ�?
     * ������:ͬ����i�����Ҳ�����б����ߵ��ߣ���˵��ʲô�أ��������Ŀǰ�õ��ĺ�ѡ��
     * ��Ϊ x, y�����ߣ�x< y)����ô�ܹ��õ����������ݻ����µ������߱�Ȼ��[x, y]�����ڲ��� ax�� >= ax , ay�� >= ay;?
     * ? ? 3.�������Ǵ���ͷ���м俿£��ͬʱ���º�ѡֵ�������������ʱ�����ȴ�x, y�н�С�ı߿�ʼ������

     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left<right){
            maxArea= Math.max(maxArea,(Math.min(height[left],height[right])*(right-left)));
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
