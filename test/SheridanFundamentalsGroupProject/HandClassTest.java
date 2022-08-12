/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheridanFundamentalsGroupProject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moosundammy
 */
public class HandClassTest {

    public HandClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
        int player;
        int dealer;
        boolean result = false;
        
    @Test
//    I am testing if the Player Hand is <= 21 and Dealer Hand is greater than 21
    public void testPlayerWins() {
        player = 20;
        dealer = 30;
        result = false;
        if (player <= 21 && dealer > 21) {
            result = true;
        }

        boolean expResult = true;
        assertEquals(expResult, result);

    }
    
        @Test
//    I am testing if the Dealer Hand is <= 21 and Dealer Hand is greater than 21
    public void testDealerWins() {
        player = 15;
        dealer = 20;
        result = false;
        if (player < 21 && dealer > player) {
            result = true;
        }

        boolean expResult = true;
        assertEquals(expResult, result);

    }
    
    
       @Test
//    I am testing if it is Draw
    public void testDrawCard() {
        player = 10;
        dealer = 10;
        if (player == dealer) {
            result = true;
        }

        boolean expResult = true;
        assertEquals(expResult, result);

    }

}
