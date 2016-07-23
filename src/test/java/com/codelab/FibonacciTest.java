package com.codelab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/***
 * 
 * @author farzaali
 *
 */

public class FibonacciTest {
	private static Fibonacci fibonacci = null;;
	
	@BeforeClass
	public static void beforeClass(){
		fibonacci = new Fibonacci();
	}
	
	@AfterClass
	public static void afterClass(){
		fibonacci = null;
	}

	/*Test for negative numbers.*/
	@Test(expected = StackOverflowError.class)
	public void testNegativeNumbers() {
		fibonacci.fib(-1);
	}
	
	/*Test for integer overflow*/
	@Test(expected = StackOverflowError.class)
	public void testIntegerOverflow(){
			fibonacci.fib(2147483647);
	}
	
	/*Test whether fibonacci of 0 returns correct values*/
	@Test
	public void testForZero(){
		assertEquals(0, fibonacci.fib(0));
	}
	
	/*Test whether fibonacci of 1 returns correct values*/
	@Test
	public void testForOne(){
		assertEquals(1, fibonacci.fib(1));
	}
	
	/*Test for normal values*/
	@Test
	public void testForNormalValues(){
		int[] expectedNumbers = {1597, 21, 233 };
		int[] actualOutput = {fibonacci.fib(17), fibonacci.fib(8), fibonacci.fib(13)};
		assertArrayEquals(expectedNumbers, actualOutput);
	}
	
	

}
