package com.Array;

import java.util.Arrays;

public class SwappingOfArrayElement {
	
	public static int[] swap(int a[]) {
		int b[]=new int[a.length];
		int temp;
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			b[i]=a[a.length-(i+1)];
			b[a.length-(i+1)]=temp;
		}
			
		
		return b;
		
		}

	public static void main(String[] args) {
		
		int a[]= {4,6,8,7,9,3,5};
		
		int num[]=SwappingOfArrayElement.swap(a);
		System.out.println(Arrays.toString(num));

	}

}
