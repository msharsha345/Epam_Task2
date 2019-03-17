package com.simple.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

Calculator calculator =new Calculator();
	
	@Test
	public void Addition_Test() {
		assertEquals(" Wrong answer error in add() method",8,calculator.add(5, 3),0.0);
		assertEquals(" Wrong answer error in add() method",12.5,calculator.add(9.5, 3),0.0);
		assertEquals(" Wrong answer error in add() method",2192986.5,calculator.add(2161343.5,31643),0.0);
		assertEquals(" Wrong answer error in add() method",70860.9,calculator.add(5427, 65433.9),0.0);
		assertEquals("Excuted successfully",7.75304,calculator.add(3.8765, 3.87654),0.0);
		assertEquals("Excuted successfully",7863875.5,calculator.add(7837347.7, 26527.8),0.0);
	}	
	@Test
	public void multiplication_Test() {
		
			assertEquals(" Wrong answer error in mul() method",15,calculator.mul(5, 3),0.0);
			assertEquals(" Wrong answer error in mul() method",28.5,calculator.mul(9.5, 3),0.0);
			assertEquals(" Wrong answer error in mul() method",68391392370.5,calculator.mul(2161343.5,31643),0.0);
			assertEquals(" Wrong answer error in mul() method",355109775.3,calculator.mul(5427, 65433.9),0.0);
			assertEquals("Wrong answer error in mul() method",15.02740731,calculator.mul(3.8765, 3.87654),0.0);
			assertEquals("Wrong answer error in mul() method",207919651.734705,calculator.mul(7837.789, 26527.845),0.0);

		
	}
	@Test
	public void division_testing()
	{
		assertEquals("error in sub()",0.5,calculator.div(4, 8),0.001);
		assertEquals(" Wrong answer error in div() method",1.6666666666666667,calculator.div(5, 3),0.0);
		assertEquals(" Wrong answer error in div() method",3.1666666666666665,calculator.div(9.5, 3),0.0);
		assertEquals(" Wrong answer error in div() method",68.30400088487185,calculator.div(2161343.5,31643),0.0);
		assertEquals(" Wrong answer error in div() method",0.08293866023574936,calculator.div(5427, 65433.9),0.0);
		assertEquals("Wrong answer error in div() method",0.9999896815201185,calculator.div(3.8765, 3.87654),0.0);
		assertEquals("Wrong answer error in div() method",0.2954551717261617,calculator.div(7837.789, 26527.845),0.0);	
	}	

}
