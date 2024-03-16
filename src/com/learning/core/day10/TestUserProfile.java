package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserProfile {
	@Test(timeout = 2000)
    public void testName() {

		D10P10 profile1 = new D10P10();
		boolean isValidName1 = profile1.validateUsername("JohnDoe");
        assertEquals(true,isValidName1);
        
        D10P10 profile2 = new D10P10();
        boolean isValidName2 = profile2.validateUsername("John Doe"); // Contains space
        assertEquals(false,isValidName2);

    }


	@Test(timeout = 2000)
    public void testPassword() {
    	
		D10P10 profile1 = new D10P10();
        boolean isValidPassword1 = profile1.validatePassword("Password123");
        assertEquals(true,isValidPassword1);

    	D10P10 profile2 = new D10P10();
        boolean isValidPassword2 = profile2.validatePassword("12ped"); 
        assertEquals(false,isValidPassword2);
        
    }

}