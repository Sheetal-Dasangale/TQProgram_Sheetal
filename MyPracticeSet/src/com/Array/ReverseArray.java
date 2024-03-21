package com.Array;

import java.util.Arrays;

public class ReverseArray {
	public static int[] reverseArray(int a[]) {
		int b[]=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		return b;
	}
	public static void main(String[] args) {
		int a[]= {2,4,7,9,0,1};
		int num[]=ReverseArray.reverseArray(a);
//		System.out.println(num); This way not correct coz print hashcode not array
		System.out.println(Arrays.toString(num));

	}

}
