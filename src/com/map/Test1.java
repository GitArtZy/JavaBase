package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("1","a");
        hm.put("2","b");
        hm.put("3","c");
        hm.put("4","d");
        hm.put("5","f");
//        Set set = hm.keySet();
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            Object o = it.next();
//            Object key = hm.get(o);
//            System.out.println(key);
//        }

        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry en = (Map.Entry) it.next();
            System.out.println(en.getKey()+"  "+en.getValue());
        }


    }

}
