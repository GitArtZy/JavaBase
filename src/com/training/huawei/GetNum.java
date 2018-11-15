package com.training.huawei;


import java.util.*;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入描述:
 * 输入一个int型整数
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class GetNum {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//        int num = sc.nextInt();
//        String s = String.valueOf(num);
//        String s2 = s.substring(s.length()-1);
//        int count=1;
//        for (int i=s.length()-1;i>=0;i--){
//            String s1 = s.substring(i,i+1);
//            if(!s2.contains(s1)){
//                s2=s2+s1;
//                count++;
//            }
//
//        }
//            System.out.println(s2);
//            System.out.println(count);
//        }
        //int sort = GetNum.demo1(112233456);
        int sort2 = GetNum.demo2(112233456);
       // System.out.println(sort);
        System.out.println(sort2);
    }
    //将整数转换为char类型数组，因为LinkedHashSet的有序和不重复性，在逆序遍历出整数
    public static int demo1(int num){
        String s = String.valueOf(num);
        String result ="";
        char[] chars = s.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (int i=chars.length-1;i>=0;i--){
            set.add(chars[i]);
        }
        for (Character c:set
             ) {
            result = result+c;
        }
        int i = Integer.parseInt(result);
        // int n = Integer.parseInt(s);
        return i;
    }
    //set不允许重复添加相同的元素和StringBuffer的反转方法
    public static int demo2(int num) {
        String str = String.valueOf(num);
        StringBuffer sb = new StringBuffer(str);
        String news="";
        Set s = new HashSet();
        sb.reverse();//字符串反转
        for (int i = 0; i < sb.length(); i++) {
            if (s.add(sb.substring(i, i + 1))) {//set不允许重复添加相同的元素
                news=news+sb.substring(i, i + 1);
            }
        }
        int i = Integer.parseInt(news);
        return i;
    }

}
