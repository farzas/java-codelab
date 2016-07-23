package com.codelab;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/***
 * 
 * @author farzaali
 *
 */
public class HornerTest {
	private static Horner horner = null;;
	
	@BeforeClass
	public static void beforeClass(){
		horner = new Horner();
	}
	
	@AfterClass
	public static void afterClass(){
		horner = null;
	}
	
	/*Test for negative numbers*/
	@Test
	public void testNegativeCoefficients() throws Exception {
		String[] input = {"3", "2", "1", "1", "-2", "5"};
		int result = horner.solve(input);
		assertEquals(35, result);
	}
	
	/*Test with negative value for variable*/
	@Test
	public void testNegativeVariable() throws Exception {
		String[] input = {"3", "-5", "1", "1", "-2", "5"};
		int result = horner.solve(input);
		assertEquals(-679, result);
	}
	
	/*Test for polynomial of degree 0*/
	@Test
	public void testZeroDegreePolynomial() throws Exception{
		String[] input = {"0", "0", "1"};
		int result = horner.solve(input);
		assertEquals(1, result);
	}
	
	/*Test for negative array size*/
	@Test(expected = NegativeArraySizeException.class)
	public void testNegativeDegree() throws Exception{
		String[] input = {"-2", "1", "1", "3"};
		int result = horner.solve(input);
	}
	
	/*Test to ensure exception is thrown when integer overflow occurs*/
	
	/* This test fails since negative value is being displayed (MSB is set to 1) when the 
	 * value of the polynomial is greater than the maximum integer value
	 */
	
	@Test(expected = Exception.class)
	public void testIntegerOverflowForResult() throws Exception{
		String[] input = {"1", "1", "2", "2147483646"};
		int result = horner.solve(input); 
		
	}
	
	/*Test to ensure exception is thrown for integer underflow*/
	@Test(expected = Exception.class)
	public void testIntegerUnderflowForResult() throws Exception{
		String[] input = {"1", "1", "2", "-2147483651"};
		int result = horner.solve(input);
		/*
		 * Exception thrown is not the expected exception
		 */
	}
	
	/*Test to check whether all coefficients are provided*/
	@Test(expected = Exception.class)
	public void testAllCoefficientsProvided() throws Exception{
		String[] input = {"3", "1", "2", "100"};
		int result = horner.solve(input);
	}
	
	/*Test to check if all input values are integers*/
	@Test(expected = NumberFormatException.class)
	public void testAllCoefficientsAreNumbers() throws Exception{
		String[] input = {"3", "1", "Coefficient", "19870"};
		int result = horner.solve(input);
	}
	
	/* Test for normal coefficients */
	@Test
	public void testNormalCoefficients1() throws Exception{
		String[] input = {"6", "123", "1", "30", "543", "673", "2", "20", "34"};
		int result = horner.solve(input);
		assertEquals(284008773, result);
	}
	
	/* Test for normal coefficients */
	@Test
	public void testNormalCoefficients2() throws Exception{
		String[] input = {"3", "2", "2", "4", "10", "34"};
		int result = horner.solve(input);
		assertEquals(322, result);
	}
}
