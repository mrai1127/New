package com.jpai.jpai;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter you name, please?");
		String name = scanner.nextLine();
		
		
		
		System.out.println("Welcome to the world of java where objects play." + name);
		
		System.out.println("The remainder of number is " + Divi());
		
	}
	
	public static int Divi() {
		int total = 50;
		int number = 10;
		double ToNu = total/number;
		return (int) ToNu;
	}

}
