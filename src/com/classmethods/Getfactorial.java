package com.classmethods;

public class Getfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getfactorial.fact(5);
		 
		
	}

	private static void fact(int num) {
		// TODO Auto-generated method stub
		int prod=1;
		for(int i=1;i<=num;i++)
			prod=prod*i;
		System.out.println("factorial of 5 is:"+prod);

	}

}
