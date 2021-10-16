package com.richu.example.myproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DemoTest {
	
	MyprojectApplication mypro =new MyprojectApplication();
	
	@Test
	void testAdd() {
		

		
	assertEquals(10, mypro.add(5, 5));
	
	assertEquals(25, mypro.prod(5, 5));
	}


}
