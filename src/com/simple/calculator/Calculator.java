package com.simple.calculator;

public class Calculator {
	
	/*
	 * method for addition of two numbers 
	 */
	
	public double add(double operand1,double operand2)
	{
		
		return operand1+operand2;
	}
	
	/*
	 * method for multiplication of two numbers 
	 */
	
	public  double mul(double operand1,double operand2)
	{
		return operand1*operand2;
	}
	
	/*
	 * method for division of two numbers 
	 */
	
	public  double div(double operand1,double operand2)
	{
		if(operand2==0)
		{
			throw new IllegalArgumentException("Number cannot be divided by 0");
		}
		else
			return operand1/operand2;

}
}
