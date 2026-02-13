package com.javabasics;


public class Useoperators {

	public static void main(String[] args) {
		int a=3;
//		post increment: use value first then change in memory
		System.out.println(a++);
		System.out.println(a);
		int b=4;
		int c =b--;
		System.out.println(b);
		System.out.println(c);
		System.out.println("c:"+c);
//		check  a number is divisible by both 3 and 4
		System.out.println(3==0);
		System.out.println(3!=4);
		System.out.println(3!=3);
		System.out.println("---------------------");
		System.out.println("logical operators");
		System.out.println("and (&&)");
		System.out.println(true && true && false);
		System.out.println(false && true);
		System.out.println("===========================");
		System.out.println("OR (||)=======");
		System.out.println(false || true|| false);
		System.out.println(true||false);
		System.out.println(false|| false);
		System.out.println("===========================");
		
		int n=10;
//		divisiblity checked by(remainder ==0) hint(%)
		System.out.println(n% 3==0 && n%4==0);
		System.out.println("eligiblity for marriage");
		System.out.println(n%3==0);
		System.out.println("age is 22 to 32");
		System.out.println("========================");
		int age=21;
		System.out.println(age>=22 && age<=32);
		System.out.println("==========================");
	}

}
