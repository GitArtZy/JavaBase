package com.JavaTest;
//全局变量和局部变量都要进行初始化，全局变量会对未赋值的变量默认赋值；
class Something {
    int i;
    public void doSomething() {
    	//int i=0；局部变量如果没有初始化会报错
        System.out.println("i = " + i);
    }
} 
