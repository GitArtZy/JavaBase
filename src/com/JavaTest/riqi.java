package com.JavaTest;

import java.util.Calendar;

//编程计算距当前时间10天后的日期和时间，并用“xxxx年xx月xx日”的格式输出新的日期和时间
public class riqi {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, 10);
		String strDate = cal.get(Calendar.DAY_OF_YEAR) + "年"
				+ cal.get(Calendar.DAY_OF_MONTH) + "月"
				+ cal.get(Calendar.DAY_OF_WEEK) + "日";
		System.out.println(strDate);

	}

}
