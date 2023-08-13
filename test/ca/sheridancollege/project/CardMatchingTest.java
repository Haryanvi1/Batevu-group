/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Owner
 */
public class CardMatchingTest {
    
    public CardMatchingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isMatch method, of class CardMatching.
     */
    @Test
    public void testIsMatchgood() {
        System.out.println("isMatch");
        Card card1 = null;
        Card card2 = null;
        CardMatching instance = new CardMatching();
        boolean expResult = true;
        boolean result = instance.isMatch(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testIsMatchbad() {
        System.out.println("isMatch");
        Card card1 = null;
        Card card2 = null;
        CardMatching instance = new CardMatching();
        boolean expResult = false;
        boolean result = instance.isMatch(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }@Test
    public void testIsMatchboundary() {
        System.out.println("isMatch");
        Card card1 = null;
        Card card2 = null;
        CardMatching instance = new CardMatching();
        boolean expResult = false;
        boolean result = instance.isMatch(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
