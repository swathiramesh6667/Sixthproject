package com.ternaryOperators;

public class Example1 
{
	//Ternary operator
	public static void main(String[] args) 
	{
int num = -19;
		
		boolean condition = (num > 0);
		
		System.out.println(condition);
		
		String positive = "Numer is positive";
		String negative = "Number is negative";
		
		System.out.println(condition ? positive : negative);
		
	}

}
