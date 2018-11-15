package com.training;


public class GuessNumber {
	
	public static int guessNumber(int n) {
        // Write your code here
        int low =1;
        int high= n;
        while(low<=high){
        int mid = low+(high-low)/2;
        int r=guess(mid);
            if(r==0){
                return mid;
            }else if(r<0){
            	low=mid+1;
            }else{
            	high=mid-1;
            }
        }
        return n;

        
    }

	private static int guess(int mid) {
		int num=5;
		if(mid>num){
			System.out.println("你的数大了");
			return 1;
		}
		if(mid<num){
			System.out.println("你的数小了");
			return -1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		int n =100;
		int guessNumber = guessNumber(n);
		System.out.println(guessNumber);
	}

}
