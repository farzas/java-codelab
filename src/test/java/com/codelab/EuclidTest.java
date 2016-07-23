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
public class EuclidTest {
	private static Euclid euclid = null;
	
	@BeforeClass
	public static void beforeClass(){
		euclid = new Euclid();
	}
	
	@AfterClass
	public static void afterClass(){
		euclid = null;
	}
	
	/*Testing when one of the number is zero*/
	@Test
	public void testWhenOneNumberIsZero() throws Exception {
		assertEquals(12, euclid.gcd(12, 0));
		assertEquals(198, euclid.gcd(0, 198));
	}
	
	/*Testing for both numbers are zero*/
	@Test
	public void testBothZero() throws Exception{
		assertEquals(0, euclid.gcd(0, 0));
	}
	
	/*Testing for negative input*/
	/*
	 * This test throws error since the code provided does not handle
	 * the gcd calculation of negative numbers.
	 */
	@Test(expected = Exception.class)
	public void testNegative() throws Exception{
		int result = euclid.gcd(-1, -10);
	}
	
	/*Test when one of the numbers is zero*/
	@Test
	public void testOneNumberNegative() throws Exception{
		assertEquals(10, euclid.gcd(10, -3));
		assertEquals(66, euclid.gcd(-8, 66));
	}
	
	/*Test normal cases*/
	@Test
	public void testNormalNumbers() throws Exception{
		assertEquals(3, euclid.gcd(3, 9));
		assertEquals(1, euclid.gcd(350, 999));
	}

}
