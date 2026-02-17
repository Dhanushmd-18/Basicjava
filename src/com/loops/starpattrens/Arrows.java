package com.loops.starpattrens;

public class Arrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int star=0;
		int space=n;
	 
		for(int row=1;row<=n;row++)
		{
		 
			if(star<=3)
			{
				star++; 
				 space--;
			}
			else 
			{
				 
				space++;
				star--;
			}
			 
			for(int i=1;i<=star;i++)
				System.out.print("*");
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			 
			System.out.println();
		}
		  	}

}
