package com.wrapperdemo;

public class Demo3 {
	public static void mymethod(Integer l)
	{
		System.out.println("in Integer parameter");
	}
	public static void mymethod(Long i)
	{
		System.out.println("in Long parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=22;
		mymethod(i);
	}

}
