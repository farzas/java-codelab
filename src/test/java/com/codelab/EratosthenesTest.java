package com.codelab;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/***
 * 
 * @author farzaali
 *
 */
public class EratosthenesTest {
	
	private static Eratosthenes eratosthenes = null;
	
	@BeforeClass
	public static void beforeClass(){
		eratosthenes = new Eratosthenes();
	}
	
	@AfterClass
	public static void afterClass(){
		eratosthenes = null;
	}

	/*Test to check for negative array size*/
	@Test(expected = NegativeArraySizeException.class)
	public void testNegativeArraySize() throws Exception  {
		int[] outputArray = eratosthenes.primes(-10);
	}
	
	/*Test for array size of 1*/
	@Test
	public void testArraySizeOne() throws Exception{
		assertEquals(0, eratosthenes.primes(1).length);
		
	}
	
	/*Test for array size out of memory*/
	@Test(expected = OutOfMemoryError.class)
	public void testOutOfMemory() throws Exception{
		int[] outputArray = eratosthenes.primes(2147483647);
		
	}
	
	/*Test for random values*/
	@Test
	public void testNormalValues1() throws Exception{
		int[] expectedNumbers = {2, 3, 0, 5, 0, 7, 0, 0, 0 };
		int[] actualOutput = eratosthenes.primes(10);
		assertArrayEquals(expectedNumbers, actualOutput);
	}
	
	@Test
	public void testNormalValues2() throws Exception{
		int[] expectedNumbers = {2, 3, 0, 5, 0, 7, 0, 0, 0, 11, 0, 13, 0, 0, 0, 17, 0, 19, 0, 0, 0, 23, 0, 0, 0, 0, 0, 29, 0 };
		int[] actualOutput = eratosthenes.primes(30);
		assertArrayEquals(expectedNumbers, actualOutput);
	}

}
