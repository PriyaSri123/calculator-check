package com.verify;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.one.Calculator;

public class CalculatorTest{
	
	Calculator cal = new Calculator();
	@Test
	public void addcheck()
	{
		int a = 10;
		int b= 20;
		int exp_res = a+b;
		int res= cal.add(10, 20);
		Reporter.log(res);
		//Assert.assertEquals(exp_res, res);
	}
	@Test
	public void subcheck()
	{
		int a = 30;
		int b= 20;
		int exp_res = a-b;
		int res= cal.sub(30, 20);
		Reporter.log(res);
		//Assert.assertEquals(exp_res, res);
		
	}
	@Test
	public void mulcheck()
	{
		int a = 30;
		int b= 20;
		int exp_res = a*b;
		int res= cal.mul(30, 20);
		Reporter.log(res);
		//Assert.assertEquals(exp_res, res);
	}
	@Test
	public void divcheck()
	{
		
		int a = 6;
		int b= 2;
		int exp_res = 0;
		try
		{
	     exp_res = a/b;
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		int res= cal.div(6, 2);
		Reporter.log(res);
		//Assert.assertEquals(exp_res, res);
	}
	
}
