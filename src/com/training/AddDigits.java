package com.training;

public class AddDigits {
	
/**
 * 给出一个非负整数 num，反复的将所有位上的数字相加，直到得到一个一位的整数。
 * 给出 num = 38。
 * 相加的过程如下：3 + 8 = 11，1 + 1 = 2。因为 2 只剩下一个数字，所以返回 2。
 * @param num
 * @return
 */
	public static int addDigits(int num) {
        // write your code here
		if(num<10){
			return num;
		}
		if(num==10){
			return 1;
		}
		else{
			int sum=0;
			while(num%10!=0){
				//num%10得到个位
				sum+=num%10;
				//得到向前进一位
				num=num/10;
			}
			sum+=num%10;
			return addDigits(sum);
		}

    }
	
	/**
	 * 最优解
	 * 另一个方法比较简单，可以举例说明一下。假设输入的数字是一个5位数字num，则num的各位分别为a、b、c、d、e。
     * 有如下关系：num = a * 10000 + b * 1000 + c * 100 + d * 10 + e
     * 即：num = (a + b + c + d + e) + (a * 9999 + b * 999 + c * 99 + d * 9)
     * 因为 a * 9999 + b * 999 + c * 99 + d * 9 一定可以被9整除，因此num模除9的结果与 a + b + c + d + e 模除9的结果是一样的。
     * 对数字 a + b + c + d + e 反复执行同类操作，最后的结果就是一个 1-9 的数字加上一串数字，最左边的数字是 1-9 之间的，右侧的数字永远都是可以被9整除的。
     * 这道题最后的目标，就是不断将各位相加，相加到最后，当结果小于10时返回。
     * 因为最后结果在1-9之间，得到9之后将不会再对各位进行相加，因此不会出现结果为0的情况。
     * 因为 (x + y) % z = (x % z + y % z) % z，又因为 x % z % z = x % z，
     * 因此结果为 (num - 1) % 9 + 1，只模除9一次，并将模除后的结果加一返回。
	 *
	 */
	public int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }
	
	public static void main(String[] args) {
		int num = 338;
		int addDigits = addDigits(num);
		System.out.println(addDigits);
		
	}

}
