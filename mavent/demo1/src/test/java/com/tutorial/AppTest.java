package com.tutorial;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    
    // App app = new App();
    @Test
    void testgetStringMe(){
        String str = "ME";
        assertEquals(str,new App().getStringMe());
    }
    

}
