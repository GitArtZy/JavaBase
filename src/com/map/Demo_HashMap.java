package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*A1:&frac14;&uuml;&Otilde;&Ograve;&Ouml;&micro;&Euml;&frac14;&Acirc;&middot;&pound;&ordm;
 * &raquo;&ntilde;&Egrave;&iexcl;&Euml;&ugrave;&Oacute;&ETH;&frac14;&uuml;&micro;&Auml;&frac14;&macr;&ordm;&Iuml;
 * &plusmn;&eacute;&Agrave;&uacute;&frac14;&uuml;&micro;&Auml;&frac14;&macr;&ordm;&Iuml;&pound;&not;&raquo;&ntilde;&Egrave;&iexcl;&micro;&frac12;&Atilde;&iquest;&Ograve;&raquo;&cedil;&ouml;&frac14;&uuml;
 * &cedil;&ugrave;&frac34;&Yacute;&frac14;&uuml;&Otilde;&Ograve;&Ouml;&micro;*/
/* A2:¼üÖµ¶Ô¶ÔÏóÕÒ¼üºÍÖµË¼Â·£º
* »ñÈ¡ËùÓÐ¼üÖµ¶Ô¶ÔÏóµÄ¼¯ºÏ
* ±éÀú¼üÖµ¶Ô¶ÔÏóµÄ¼¯ºÏ£¬»ñÈ¡µ½Ã¿Ò»¸ö¼üÖµ¶Ô¶ÔÏó
* ¸ù¾Ý¼üÖµ¶Ô¶ÔÏóÕÒ¼üºÍÖµ
* B:°¸ÀýÑÝÊ¾
* Map¼¯ºÏµÄ±éÀúÖ®¼üÖµ¶Ô¶ÔÏóÕÒ¼üºÍÖµ
*/

public class Demo_HashMap {

	public static void main(String[] args) {
		//»ñÈ¡ËùÓÐ¼üµÄ¼¯ºÏ
		/* ±éÀú¼üµÄ¼¯ºÏ£¬»ñÈ¡µ½Ã¿Ò»¸ö¼ü
		* ¸ù¾Ý¼üÕÒÖµ*/
		Demo1();
		//Demo2();
		//¼üÖµ¶Ô¶ÔÏóÕÒ¼üºÍÖµ
		//Demo3();
		//* ÐèÇó£ºÍ³¼Æ×Ö·û´®ÖÐÃ¿¸ö×Ö·û³öÏÖµÄ´ÎÊý
		String str ="aaabbbccccccc";
		char[] arr=str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		//±éÀú×Ö·ûÊý×é
		for (char c : arr) {
			//Èç¹û²»°üº¬Õâ¸ö¼ü
//			if(!hm.containsKey(c)){
//				hm.put(c, 1);
			//Èç¹û°üº¬Õâ¸ö¼ü
//			}else {
//				hm.put(c, hm.get(c)+1);
//			}
			 hm.put(c, !hm.containsKey(c)? 1:hm.get(c)+1);
		}
		for (Character key : hm.keySet()) {
			System.out.println(key+"="+hm.get(key));
		}

	}

	private static void Demo3() {
		HashMap<String , Integer> hm =new HashMap<String, Integer>();
		hm.put("ÕÅÈý", 23);
		hm.put("ÀîËÄ", 24);
		hm.put("ÍõÎå", 25);
		hm.put("ÕÔÁù", 26);
		Set<Map.Entry<String, Integer>> entrySet= hm.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> en = it.next();
			String key = en.getKey();
			System.out.println(key+"="+hm.get(key));
			
		}
	}

	private static void Demo2() {
		HashMap<String , Integer> hm =new HashMap<String, Integer>();
		hm.put("ÕÅÈý", 23);
		hm.put("ÀîËÄ", 24);
		hm.put("ÍõÎå", 25);
		hm.put("ÕÔÁù", 26);
		for (String key : hm.keySet()) {
			Integer value = hm.get(key);
			System.out.println(key+"="+value);
		}
	}

	private static void Demo1() {
		HashMap<String , Integer> hm =new HashMap<String, Integer>();
		hm.put("ÕÅÈý", 23);
		hm.put("ÀîËÄ", 24);
		hm.put("ÍõÎå", 25);
		hm.put("ÕÔÁù", 26);
		
		//»ñÈ¡¼¯ºÏÖÐËùÓÐµÄ¼ü
		Set<String> keyset= hm.keySet();
		//»ñÈ¡µü´úÆ÷
		Iterator<String> it =keyset.iterator();
		//ÅÐ¶Ïµ¥ÁÐ¼¯ºÏÖÐÊÇ·ñÓÐÔªËØ
		while (it.hasNext()) {
			//»ñÈ¡¼¯ºÏÖÐµÄÃ¿Ò»¸öÔªËØ,ÆäÊµ¾ÍÊÇË«ÁÐ¼¯ºÏÖÐµÄ¼ü
			String key = (String) it.next();
			//¸ù¾Ý¼ü»ñÈ¡Öµ
			Integer value = hm.get(key);
			System.out.println(key+"="+value);
		}
	}

}
