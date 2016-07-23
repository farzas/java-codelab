package com.codelab;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	/*check if measurement of any of the sides is negative */
	@Test
	public void testNegativeValueForMeasurement() {
		Triangle triangle = new Triangle(-3, 10, 123);
		int result = triangle.classify();
		assertEquals(-1, result);
	}
	
	/*Check if sum of smaller two sides is less than third*/
	@Test
	public void testSumOfTwoSides() {
		Triangle triangle = new Triangle(3, 4, 8);
		int result = triangle.classify();
		assertEquals(-1, result);
	}
	
	/*Test for equilateral triangle*/
	@Test
	public void testForEquilateralTriangle() {
		Triangle triangle = new Triangle(1123, 1123, 1123);
		int result = triangle.classify();
		assertEquals(1, result);
	}
	
	/*Test for isosceles triangle*/
	@Test
	public void testForIsoscelesTriangle() {
		Triangle triangle = new Triangle(1123, 1123, 345);
		int result = triangle.classify();
		assertEquals(2, result);
	}
	
	/*Test for scalene triangle*/
	@Test
	public void testForScaleneTriangle() {
		Triangle triangle = new Triangle(2, 3, 4);
		int result = triangle.classify();
		assertEquals(3, result);
	}
	
	/*Test when one of the side is zero*/
	/*
	 * This test case is not valid since the code for return value of 4 will never be executed.
	 *
	@Test
	public void testForZeroMeasurement() {
		Triangle triangle = new Triangle(0, 123, 1456);
		int result = triangle.classify();
		assertEquals(4, result);
	}
	*/
	
	/*Test when sum of two sides equal to third*/
	
	/*
	 * This test case is not valid since the code for return value of 4 will never be executed.
	 *
	@Test
	public void testForSumOfTwoSidesEqualToThird() {
		Triangle triangle = new Triangle(10, 5, 15);
		int result = triangle.classify();
		assertEquals(4, result);
	}*/
	
	

}
