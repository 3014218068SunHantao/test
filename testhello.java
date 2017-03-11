package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class testhello {
private hello cal;
	
	// 执行任意一个方法之前都会执行setUp方法
	@Before
	public void setUp(){
		cal = new hello();
	}
	
	// 加了@Test表示该方法是一个单元测试
 	@Test
	public void testEquilateral(){
 		assertEquals("It cannot identify an equilateral triangle!", "equilateral triangel!", cal.triangle(12,12,12));
	}
 	@Test
 	public void testIsosceles(){
 		assertEquals("It cannot identify an isosceles triangle!", "isosceles triangel!", cal.triangle(12,12,5));
 		assertEquals("It cannot identify an illegal isosceles triangle!", "illegal triangel!", cal.triangle(12,12,24));
 	}
 	@Test
 	public void testScalene(){
 		assertEquals("It cannot identify a scalene triangle!", "scalene triangel!", cal.triangle(3,4,5));
 		assertEquals("It cannot identify an illegal scalene triangle!", "illegal triangel!", cal.triangle(1,2,3));
 	}
 	
 	@Test
 	public void testMinus(){
 		assertEquals("Trueminus() is a wrong function!", 1, cal.trueminus(3,4));
 		assertEquals("Trueminus() is a wrong function!", 1, cal.trueminus(4,3));
 	}
 	
 	//hamcrest 1.3
}
