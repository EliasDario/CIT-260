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
     * Test of changeWagonHealth method, of class PlayerControl.
     */
    @Test
    public void testChangeWagonHealth() {
        System.out.println("changeWagonHealth");
        String ration = "filling";
        String pace = "strenuous";
        String weather = "sunny";
        String expResult = "good";
        String result = PlayerControl.changeWagonHealth(ration, pace, weather);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /*
     * Test of chooseOccupation method, of class PlayerControl.
     */
    @Test
    public void testChooseOccupation() {
        System.out.println("chooseOccupation");
        String playerOccupation = "1";
        String expResult = "$1600";
        String result = PlayerControl.chooseOccupation(playerOccupation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
