package com.simple.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

Calculator calculator =new Calculator();
	
	@Test
	public void Addition_Test_Pass() {
		assertEquals(" Excuted successfully ",6,calculator.add(2, 4),0.0);
		assertEquals(" Excuted successfully ",13.0,calculator.add(9.5, 3.5),0.0);
		assertEquals(" Excuted successfully ",155288.5,calculator.add(29345.5,125943),0.0);
		assertEquals(" Excuted successfully ",1864778.2,calculator.add(1232224, 632554.2),0.0);
		assertEquals(" Excuted successfully ",7.7419,calculator.add(3.8765, 3.8654),0.0);
		
	}	
	
	@Test
	public void Addition_Test_Fail() {
		assertFalse(" Excuted successfully ",6!=calculator.add(2, 4));
		assertFalse(" Excuted successfully ",13.0!=calculator.add(9.5, 3.5));
		assertFalse(" Excuted successfully ",155288.5!=calculator.add(29345.5,125943));
		assertFalse(" Excuted successfully ",1864778.2!=calculator.add(1232224, 632554.2));
		assertFalse(" Excuted successfully ",7.7419!=calculator.add(3.8765, 3.8654));
		
	}
	
	@Test
	public void Multiplication_Test_Pass() {
		
			assertEquals(" Excuted successfully ",35,calculator.mul(5, 7),0.0);
			assertEquals(" Excuted successfully ",90.25,calculator.mul(9.5, 9.5),0.0);
			assertEquals(" Excuted successfully ",3938055.0,calculator.mul(1234.5,3190),0.0);
			assertEquals(" Excuted successfully ",48257978.4,calculator.mul(5490, 8790.16),0.0);

		
	}
	
	@Test
	public void Mltiplication_Test_Fail() {
		
			assertFalse(" Excuted successfully ",35!=calculator.mul(5, 7));
			assertFalse(" Excuted successfully ",90.25!=calculator.mul(9.5, 9.5));
			assertFalse(" Excuted successfully ",3938055.0!=calculator.mul(1234.5,3190));
			assertFalse(" Excuted successfully ",48257978.4!=calculator.mul(5490, 8790.16));

		
	}
	
	@Test
	public void Division_Test_Pass()
	{
		assertEquals(" Excuted successfully ",0.65,calculator.div(13, 20),0.0);
		assertEquals(" Excuted successfully ",0.2727272727272727,calculator.div(3, 11),0.0);
		assertEquals(" Excuted successfully ",3,calculator.div(10.5, 3.5),0.0);
		assertEquals(" Excuted successfully ",1.8379468325791855,calculator.div(6498.98,3536),0.0);
		assertEquals(" Excuted successfully ",0.9845205000835499,calculator.div(6481, 6582.90),0.0);	
	}	
	
	@Test
	public void Division_Test_Fail()
	{
		assertFalse(" Excuted successfully ",0.65!=calculator.div(13, 20));
		assertFalse(" Excuted successfully ",0.2727272727272727!=calculator.div(3, 11));
		assertFalse(" Excuted successfully ",3!=calculator.div(10.5, 3.5));
		assertFalse(" Excuted successfully ",1.8379468325791855!=calculator.div(6498.98,3536));
		assertFalse(" Excuted successfully ",0.9845205000835499!=calculator.div(6481, 6582.90));	
	}	

}
