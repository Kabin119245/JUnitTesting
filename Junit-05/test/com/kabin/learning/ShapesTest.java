package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//if we want to create only one instance then we use @TestInstance annotation
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {
	 ShapesTest() {
		System.out.println("Test obj is created");
	}
	 //we have changed the behaviour to PER_CLASS to create only one object so no need to make static method, previously static method were used 
	 //if PER.MEthod -> before all and after all method should be static
	@BeforeAll
	 void beforeAll() {
		System.out.println("Before all tests");
		
	}
	
	Shapes shape;
	@BeforeEach //before each test it will be executed
	void init() {
		
		shape = new Shapes();
		System.out.println("Before each test");
		
	}
	

	@Test
	void testcomputeSquareArea() {
		
		assertEquals(36, shape.computeSquareArea(6));
		System.out.println("Actual Test Running");
	}
	
	@Test
	void testcomputeCircleArea() {
		
		assertEquals(113.04, shape.computeCircleArea(6));
		System.out.println("Actual Test Running");
	}
	
	@AfterEach
	void destroy() {
		//closing resources
		System.out.println("After each test");
	}
	
	@AfterAll
	 void afterAll() {
		System.out.println("After all tests");
	}

}
