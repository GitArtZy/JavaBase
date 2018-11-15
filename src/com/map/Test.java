package com.map;

import java.util.ArrayList;
import java.util.Collections;

/*
 * * 模拟斗地主洗牌和发牌，牌没有排序
 */
public class Test {

	public static void main(String[] args) {
		//买一副扑克
		String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color= {"方片","梅花","红桃","黑桃"};
		//把花色和数字连接起来
		ArrayList<String> poker= new ArrayList<String>();
		for (String s1 : num) {
			for (String s2 : color) {
				poker.add(s2.concat(s1));
			}
		}
		poker.add("大王");
		poker.add("小王");
		//洗牌
		Collections.shuffle(poker);
		System.out.println(poker);
		
		ArrayList<String> zhangsan = new ArrayList<>();
		ArrayList<String> lisi = new ArrayList<>();
		ArrayList<String> me = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		for (int i = 0; i < poker.size(); i++) {
			if(i>=poker.size()-3){
				dipai.add(poker.get(i));
			}else if (i%3==0) {
				zhangsan.add(poker.get(i));
			}else if (i%3==1) {
				lisi.add(poker.get(i));
			}else {
				me.add(poker.get(i));
			}
		}
		//看牌
		System.out.println(zhangsan);
		System.out.println(lisi);
		System.out.println(me);
		System.out.println(dipai);
		

	}

}
