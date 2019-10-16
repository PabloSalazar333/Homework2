package com.homework2.app;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		//Constant declaration
		
		//Variable declaration 
		int initialNumber = 0;
		int finalNumber =0;
		int limit = 0;
		int mul = 0;
		int cont = 0;
		
		//Object construction
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give me a first number multiplication table to go initialization: ");
		initialNumber = input.nextInt();
		
		System.out.print("Give me a number multiplication table to go finalizer: ");
		finalNumber = input.nextInt();
		
		System.out.print("Give me a number to limit of range: ");
		limit = input.nextInt();
		System.out.println("");
		
		//
			for(int i=initialNumber; i<=finalNumber; i++) 
			{
				cont =i;
		
				for(int j=1; j<=limit; j++)
				{
					mul = initialNumber*j;
					System.out.println(cont+"X"+j+"="+mul);
				}
			System.out.println("");
			}
		
		input.close();
	}

}
