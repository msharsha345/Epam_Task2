package com.simple.calculator;

public class Calculator {
	public double add(double a,double b)
	{
		
		return a+b;
	}
	public  double mul(double a,double b)
	{
		return a*b;
	}
	public  double div(double a,double b)
	{
		if(b==0)
		{
			throw new IllegalArgumentException("Number cannot be divided by 0");
		}
		else
			return a/b;

}
}
