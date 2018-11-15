package com.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutation {

	/*
	 * 给定两个字符串，请设计一个方法来判定其中一个字符串是否为另一个字符串的置换。 置换的意思是，通过改变顺序可以使得两个字符串相等。
	 * 
	 * @param A: a string
	 * 
	 * @param B: a string
	 * 
	 * @return: a boolean
	 */
	/**
	 * (1)排序 如果不限制时间复杂度的话，可以直接调用（或自己实现）字符串排序函数，
	 * 比较两个字符串排序之后的结果是否一致，如果一致，则判断为真，否则为假。 这种方式的时间复杂度最快也是nlogn。
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean isPermutation(String A, String B) {
		// write your code here
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		Arrays.sort(b);
		System.out.println(b);
		if (String.copyValueOf(a).equals(String.copyValueOf(b))) {
			return true;
		}

		return false;
	}

	/**
	 * (2)哈希 字符串a,b的每一个字符都哈希到一个map里，a的字符加1，b的字符减1， 统计为0 的时候删除字符，最后判断map的大小是否等于0。
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean isPermutation2(String A, String B) {
		// 同一个对象
		if (A == B) {
			return true;
		}

		// 长度不一致
		if (A == null || B == null || A.length() != B.length()) {
			return false;
		}

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < A.length(); i++) {
			char a = A.charAt(i);
			if (charMap.containsKey(a)) {
				charMap.put(a, charMap.get(a) + 1);
				if (charMap.get(a) == 0) {
					charMap.remove(a);
				}
			} else {
				charMap.put(a, 1);
			}
			char b = B.charAt(i);
			if (charMap.containsKey(b)) {
				charMap.put(b, charMap.get(b) - 1);
				if (charMap.get(b) == 0) {
					charMap.remove(b);
				}
			} else {
				charMap.put(b, -1);
			}
		}

		if (charMap.isEmpty()) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String A = "abcd";
		String B = "bcad";
		Permutation p = new Permutation();
		boolean permutation = p.isPermutation(A, B);
		System.out.println(permutation);
		boolean permutation2 = p.isPermutation2(A, B);
		System.out.println(permutation2);
	}

}
