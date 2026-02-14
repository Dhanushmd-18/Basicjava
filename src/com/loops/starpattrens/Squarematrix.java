package com.loops.starpattrens;

public class Squarematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++)
			System.out.print("*");
		
		System.out.println("@");
		
		for(int i=1;i<=3;i++)
			System.out.print("*");
		
		System.out.println("@");
		
		for(int i=1;i<=3;i++)
			System.out.print("*");
		
		System.out.println("@");
		System.out.println("================");
		
		int n=10, star=0;
		for(int row=1;row<=n;row++)
			star++;
		    for(int i=1;i<=star;i++)
			    System.out.print("*");
		    System.out.println();

	}

}
