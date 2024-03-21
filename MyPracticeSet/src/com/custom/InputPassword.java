package com.custom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputPassword {

	static boolean validatePassword(String p) {
		
		int uCount=0;
		int lcount=0;
		int numCount=0;
		int spCount=0;
		
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)==' ')
				return false;
			if(Character.isUpperCase(p.charAt(i)))
				uCount++;
			if(Character.isLowerCase(p.charAt(i)))
				lcount++;
			if(Character.isDigit(p.charAt(i)))
				numCount++;
			if(p.charAt(i)=='#'||p.charAt(i)=='@'||p.charAt(i)=='.')
				spCount++;
		}
		
		if(uCount<1||lcount<1||numCount<1||spCount<1)
			return false;
		else
			return true;

	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter username:");
		String user = br.readLine();

		System.out.println("Enter password:");
		String pass = br.readLine();

		try {
			if (pass.length() < 8 && pass.length()>15) {
				throw new InvalidPasswordException("Password length must be between 8 and 15 characters");
			}

			if (!validatePassword(pass)) {
				throw new InvalidPasswordException("Password must contain [A-Z],[a-z],[0-9] and[@,#,.]");
			}
			
			System.out.println("Registration completed for:"+user);
		} catch (InvalidPasswordException e) {
			System.out.println(e);
		}
		
		finally {
			sc.close();
		}

		System.out.println("Code Ends.....");
	}

}
