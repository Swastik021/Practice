package com.java.array;

public class Bubble_Sort {

	public static void main(String[] args) {
		int a[]= {43,35,532,436,432,22,1};
		int res[] =sortedArr(a);
		for(int i =0;i<a.length;i++) {
			System.out.println(res[i]+" ");
		}
	}

	
	
	public static int[] sortedArr(int[]a) {
		for(int i = 0;i<a.length;i++) {
			for(int j =0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1]=temp;	
				}
			}
		}
		return a;
		
		
	
	}
}
