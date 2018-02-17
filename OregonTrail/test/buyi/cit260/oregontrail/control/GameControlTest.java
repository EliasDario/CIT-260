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
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        String occupation = "banker";
        int actorQty = 3;
        int actorHealthy = 2;
        int fund = 80;
        int expResult = 85;
        int result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        occupation = "banker";
        actorQty = 6;
        actorHealthy = 2;
        fund = 80;
        expResult = 88;
        result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        occupation = "banker";
        actorQty = 3;
        actorHealthy = -1;
        fund = 80;
        expResult = 82;
        result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        occupation = "banker";
        actorQty = 3;
        actorHealthy = 2;
        fund = -1;
        expResult = 4;
        result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        occupation = "bankre";
        actorQty = 3;
        actorHealthy = 2;
        fund = 80;
        expResult = 0;
        result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        occupation = "banker";
        actorQty = 0;
        actorHealthy = 0;
        fund = 0;
        expResult = 0;
        result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        // --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        occupation = "farmer";
        actorQty = 5;
        actorHealthy = 5;
        fund = 999;
        expResult = 3027;
        result = GameControl.gamePunctuation(occupation, actorQty, actorHealthy, fund);
        assertEquals(expResult, result);
        
        
    }
    
}
