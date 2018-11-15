package com.training;

public class RemoveElement {
	
	 /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
    	
    	
        // write your code here
    	int B = 0;
    	for(int i=0;i<A.length;i++){
    		if(A[i]!=elem){
    			A[B++]= A[i];
    		}
    	}
    	return B;
    }
    public static void main(String[] args) {
		int[] A ={2};
		int elem=3;
		RemoveElement r = new RemoveElement();
		int removeElement = r.removeElement(A, elem);
		System.out.println(removeElement);
	}

}
