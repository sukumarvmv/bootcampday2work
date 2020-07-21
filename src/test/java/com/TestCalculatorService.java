package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	CalculatorService cs = new CalculatorService();
	
	
	@Test
	public void testMessage() {
			Assertions.assertEquals("HelloWold", cs.sayHello());
	}
	
	@Test
	public void testsum( ) {
		Assertions.assertEquals(20 ,cs.sum() );
		}
	
	@Test
	public void testmultip( ) {
		Assertions.assertEquals(30 ,cs.multip() );
		}
	

	@Test
	public void testdiff( ) {
		Assertions.assertEquals(40 ,cs.diff() );
		}
	

	@Test
	public void testdiv( ) {
		Assertions.assertEquals(50 ,cs.div() );
		}
	
	
	

}
