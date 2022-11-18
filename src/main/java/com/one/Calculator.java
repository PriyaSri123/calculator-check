package com.one;

public class Calculator {

	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		if(a>=b)
			return a-b;
		else
			return b-a;
		
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		try {
		      // code that generate exception
		      if(b==0)
		    	  System.out.println("Rest of code in try block");
		    }
		    
		    catch (Exception e) {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
	
		return a/b;
			
	}
	public int pow(int a, int b)
	{
	
		return a^b;	
	}
	public double squareroot(double a)
	{
	
		return a*1.414;	
	}
}
