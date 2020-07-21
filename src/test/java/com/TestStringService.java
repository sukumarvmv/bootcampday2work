package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestStringService {
	
    StringService str =  new StringService();
    
    @Test
    public void testTruncateAInFirst2Positions() {
   
    	String actual = str.truncateAInFirst2Positions("AABC");
       	String expect = "BC";
    	Assertions.assertEquals(expect , actual);
   }
    	

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
      	
    	Assertions.assertTrue(str.areFirstAndLastTwoCharactersTheSame("ABAB"));
   
    }
   
    @Test
    public void testHelloName() {
      	
    	Assertions.assertEquals( "HelloSukumar",  str.helloName("Sukumar"));
   
    } 
    
    @Test
    public void testHelloName1() {
      	
    	Assertions.assertEquals( "HelloRavi",  str.helloName("Ravi"));
   
    }
    
    
    @Test
    public void testHelloName2() {
      	
    	Assertions.assertEquals( "HelloRaju",  str.helloName("Raju"));
   
    }

}

