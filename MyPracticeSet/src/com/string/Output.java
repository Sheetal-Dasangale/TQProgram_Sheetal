package com.string;

import java.util.Scanner;

public class Output {
	
	public static int max1(int arr[][]){
		int max = 0;
		max=arr[0][0];
		for(int i=0; i<arr.length;i++){
		
		for(int j=0; j<arr[i].length;j++)
			{
		if(arr[i][j]>max){
			max=arr[i][j];
			}

			}
		}
		return max;
			
		}
	public static void main(String[] args) {
		int arr[][]={{22, 31, 9}, {12, 25, 16}};
		int maxVal=Output.max1(arr);
		System.out.print(maxVal);

//		String x = "xyz";
//
//		x.toUpperCase(); /* Line 2 */
//
//		String y = x.replace('Y', 'y');
//
//		y = y + "abc";
//		System.out.println(y);

//		------------------------------------------
//		String x = new String("xyz");
//		String y = "abc";
//		x = x + y;
//		System.out.println(x);
		
//		-----------------------------------------------
//		String[] s1 = {"ONE", "TWO", "THREE", "FOUR"};
//		 
//        String[] s2 = {"THREE", "TWO", new String("ONE")};
// 
//        System.out.println(s1[0] == s2[2]);
// 
//        System.out.println(s1[1] == s2[1]);
// 
//        System.out.println(s1[2] == s2[0]);
        
        

		
	}
	}


