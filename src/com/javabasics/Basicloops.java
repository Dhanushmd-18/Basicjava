package com.javabasics;

public class Basicloops {
	public static void main(String[] args) {
		int a=1;
		while(a<4)
		{
//			System.out.println(a);
			a++;//updation
		}
		int b=2;
		do
		{
//			System.out.println(b);
			b++;
		}while(b<4);
		
		System.out.println("======================");
		for(int i=1;i<5;i++)
		{
			System.out.println("i="+i);
		}
//		pattren program
		for(int i=1;i<=4;i++)
		{
		   for(int j=0;j<4;j++ )
		   {
			System.out.println("*");
		   }
		}
		
	}

}
