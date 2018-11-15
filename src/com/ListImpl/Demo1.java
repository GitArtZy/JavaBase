package com.ListImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//* �����������洢Ԫ��,�洢��Ԫ����Ҫ�鿴,��ô����Ҫ���(����)
public class Demo1 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("张三");
		c.add("李四");
		c.add("王五");
		Iterator it = c.iterator();
		while (it.hasNext()) {
			//String str = (String) it.next();
			//System.out.print(str);
			System.out.println(it.next());
		}
		

	}

}
