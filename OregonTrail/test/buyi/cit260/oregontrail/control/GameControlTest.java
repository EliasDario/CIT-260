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
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gamePunctuation method, of class GameControl.
     */
    @Test
    public void testGamePunctuation() {
        System.out.println("gamePunctuation");
        String occupation = "";
        int actorQty = 0;
        int actorHealthy = 0;
        int fund = 0;
        int expResult = 0;
        int result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
