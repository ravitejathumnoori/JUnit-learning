package com.learn.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//TestInstance.Lifecycle.PER_CLASS will avoid creating new instance at every test case.
//So @BeforeAll method need not be static in this case
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	//Any Method which is annotated with @BeforeAll should be static
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before any method run");
	}
	
	@BeforeEach
	void init(){
		
		mathUtils = new MathUtils();
		
	}

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(3, mathUtils.add(1, 2), "The add method should add 2 numbers");
		assertFalse(false);
	}
	
	@Test
	@DisplayName("Unit Testing exception")//@DisplayName is used to give name for test case
	void testDiv() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class,() -> mathUtils.div(1, 0),"Divide by 0 show throw");
	}
	
	@Test
	void allAssert() {
		
		mathUtils.mul(2, 2);
		//assertAll is used to assert multiple asserts at once
		assertAll(
				()->assertEquals(4,mathUtils.mul(2, 2)),
				()->assertEquals(0,mathUtils.mul(2, 0)),
				()->assertEquals(-2,mathUtils.mul(2, -1))
				);
		
	}

	@Disabled//This annotation is used to disable any test case 
	void testDisable() {
		System.out.println("This test is disabled");
	}
	
}
