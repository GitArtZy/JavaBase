package com.training;

public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    public int width;
    public int height;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return width*height;
    }
    public static void main(String[] args) {
		Rectangle rt = new Rectangle(3, 4);
		int area = rt.getArea();
		System.out.println(area);
	}
}
