//clone element from one array to other

package com.Array;

import java.util.Arrays;

public class CloneArray {
	public static int[] clone(int a[]) {
		int b[]=new int[a.length];
//		int j=0;
		for (int i=0;i<a.length;i++)
		{
		  b[i]= a[i];
//		  b[j]= a[i];  another approch 
//		  j++;    but not required
		}
		return b;
		
	}

	public static void main(String[] args) {
		int a[]= {2,4,6,4,1};
		int arr[]=CloneArray.clone(a);
		System.out.println(Arrays.toString(arr));
		

	}

}
