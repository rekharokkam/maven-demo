package com.learning.build.basic;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class App
{
	private static boolean isNumeric (String nextLine){
		return StringUtils.isNumeric(nextLine);
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("provie a valid Numeric value");
		
		if (isNumeric(scanner.nextLine())){
			System.out.println("Provided string is numeric");
		}
		else{
			System.out.println("your input is not valid");
		}
		
		scanner.close();
	}
}
