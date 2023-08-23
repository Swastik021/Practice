package com.string.java;

public class SubString {
	
	public static int sumOfDigit(int n) {
		int sum = 0;
		while(n>0) {
			int last = n%10;
			sum = sum+last;
			n = n/10;
		}
		
		return sum;
		
	}
	public static int sumOfString(String str) {
		String num = "";
		for(int i = 0 ; i<str.length();i++){
			if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				num = num+str.charAt(i);
				
			}
		}
		int n = Integer.parseInt(num);
		
	return sumOfDigit(n);
		
	}

		
	public static void main(String[] args) {
		String s = "a1b2c3b4";
		System.out.println(sumOfString(s));
	}

}
