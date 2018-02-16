/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amon Bernardo
 */
public class testeReturnTest {
    
    public testeReturnTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testReturn method, of class testeReturn.
     */
    @Test
    public void testTestReturn() {
        System.out.println("testReturn");
        int number = 1;
        int expResult = 1;
        int result = testeReturn.testReturn(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
