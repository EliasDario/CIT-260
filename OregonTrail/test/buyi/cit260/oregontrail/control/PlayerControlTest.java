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
 * @author Elías
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of changePlayerHealth method, of class PlayerControl.
     */
    @Test
    public void testChangePlayerHealth() {
        System.out.println("changePlayerHealth");
        int ration = 0;
        int pace = 0;
        int weather = 0;
        int expResult = 0;
        int result = PlayerControl.changePlayerHealth(ration, pace, weather);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
