package com.classmethods;

public class AllGlobalMembers {
	static int value=3;
	int num=45; //global variable
	void run()
	{
		System.out.println("not static run method");
		
	}
	static void execute()
	{
		System.out.println("static execute method");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num=3;//local variable
		System.out.println("local value:n="+num);
		System.out.println("=====================");
		System.out.println("Global static value="+AllGlobalMembers.value);
		AllGlobalMembers.execute();
		System.out.println("====================");	
		System.out.println("non static num:"+num);
		
//		object creation 
		AllGlobalMembers object=new AllGlobalMembers();
		object.run();
		System.out.println("non static num:"+object.num);
		
		

	}

}
