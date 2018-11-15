package com.innerClass;

public class Outer1 {
    public static void main(String[] args) {
        new inter(){
            public void show(){

            }
        };
    }
}
interface inter {
    public void show();
}
