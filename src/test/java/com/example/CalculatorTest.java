package com.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Calculator tests")
public class CalculatorTest {
	static Calculator c1 = null;
	
	@ParameterizedTest
	@CsvSource({
		"1, 2, 3",
		"10, 20, 30",
		"4, 5, 9"
	})
	public void testMultipleAdditions(int a, int b, int expected) {
		assertEquals(expected, c1.add(a, b));
	}
	
	
	@BeforeAll
	public static void setUp() {
		c1 = new Calculator();
	}
	@AfterAll
	public static void tearDown() {
		c1 = null;
	}
	
	@BeforeEach
	public void setUpEach() {
		
	}
	
	@AfterEach
	public void tearDownEach() {
		
	}
		
	@Test
	@DisplayName("Addition test")
	public void testAddtion() {
		 assertEquals(5,c1.add(2, 3));
	}
	@Test
	@DisplayName("Subtraction test")
	public void testSubtraction() {
		assertNotEquals(1, c1.sub(2, 3));
	}
	
	@Test
	public void testMultplication() {
		assertEquals(6, c1.prod(2, 3));
		assertNotEquals(5, c1.prod(2, 3));
	}
	
	@Test
	public void testDivision() {
		assertEquals(2, c1.division(10, 5));
	}
	
	@Test
	public void testDivException() {
		assertThrows(ArithmeticException.class, ()-> c1.division(10, 0));
	}
	
	@Test
	public void testPositive() {
		assertFalse(c1.add(5, 5)>100);
	}
	
	@Test
	public void testSame() {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3= c1;
		assertSame(c1,c3);
		
	}
	
	@Test
	public void testNoSame() {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		assertNotSame(c1,c2);
	}
	
	@Test
	public void testNull() {
		String s1 = null;
		assertNull(s1);
	}
	@Test
	public void testNotNull() {
		String s1 = "hello";
		assertNotNull(s1);
	}
	
	@Test
	public void testMultiple() {
		assertAll(
			()->assertEquals(10, c1.add(5, 5)),
			()->assertNull(null)
			
		);
	}
	
	
}
