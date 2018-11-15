package com.recursion;

import javax.swing.JOptionPane;

/*  
 *  
 * author:zy  
 * description:  
 */  
public class Hanoi {  
    private final static String from = "柱子B";  
    private final static String mid = "柱子A";  
    private final static String to = "柱子C";  
  
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("请输入你要移动的盘子数");
        int num = Integer.parseInt(input);
        Hanoi.move(num, from, mid, to);
    }  
    //传入参数为num，“柱子B”，“柱子A”，“柱子C”
    private static void move(int num, String from2, String mid2, String to2) {  
        //设置递归出口num=1
    	if (num == 1) {  
            System.out.println("移动盘子1 从" + from2 + "到" + to2);  
        } else {  
        	//move方法中改变了调用参数顺序，此时num=2 from2为"柱子B" to2为"柱子A" mid2为"柱子C"
            move(num - 1, from2, to2, mid2);  
            System.out.println("移动盘子" + num + " 从" + from2 + "到" + to2);
          //move方法中改变了调用参数顺序，此时num=2 mid2为"柱子B"，from2为"柱子A"，to2为"柱子C"
            move(num - 1, mid2, from2, to2);  

        }  
  
    }  
  
}  
