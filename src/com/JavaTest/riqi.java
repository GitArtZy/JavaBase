package com.JavaTest;

import java.util.Calendar;

//��̼���൱ǰʱ��10�������ں�ʱ�䣬���á�xxxx��xx��xx�ա��ĸ�ʽ����µ����ں�ʱ��
public class riqi {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, 10);
		String strDate = cal.get(Calendar.DAY_OF_YEAR) + "��"
				+ cal.get(Calendar.DAY_OF_MONTH) + "��"
				+ cal.get(Calendar.DAY_OF_WEEK) + "��";
		System.out.println(strDate);

	}

}
