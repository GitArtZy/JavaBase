package com.training.LeetCode;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = MaxArea.maxArea(height);
        System.out.println(i);
    }

    /**
     * 思路：
     * 从两边向中间，比较两线高度，
     * 每次都舍弃最短的并向中心移动一位，同时根据两边距离和最短边高度得到面积。
     * 由于最短边是每个长方形面积的决定因素，因而每次只挪动短边的一端，直到两端相遇。
     * ---------------------
     * 使用贪心算法?
     * 　1.首先假设我们找到能取最大容积的纵线为 i, j (假定i < j)，那么得到的最大容积 C = min( ai , aj ) * ( j- i) ；?
     * ? ? 2.下面我们看这么一条性质：?
     * 　　①: 在 j 的右端没有一条线会比它高！假设存在 k |( j < k && ak > aj) ，那么 由 ak > aj，
     * 所以 min(ai, aj, ak) =min(ai, aj) ，所以由i, k构成的容器的容积C’ = min(ai, aj) * (k - i) > C，与C是最值矛盾，
     * 所以得证j的后边不会有比它还高的线；?
     * 　　②:同理，在i的左边也不会有比它高的线；这说明什么呢？如果我们目前得到的候选：
     * 设为 x, y两条线（x< y)，那么能够得到比它更大容积的新的两条边必然在[x, y]区间内并且 ax’ >= ax , ay’ >= ay;?
     * ? ? 3.所以我们从两头向中间靠拢，同时更新候选值；在收缩区间的时候优先从x, y中较小的边开始收缩；

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
