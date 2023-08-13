/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class PlayerRegistrationTest {
    
    public PlayerRegistrationTest() {
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
     * Test of registerPlayer method, of class PlayerRegistration.
     */
    @Test
    public void testRegisterPlayer() {
        System.out.println("registerPlayer");
        Player player = null;
        PlayerRegistration instance = new PlayerRegistration();
        instance.registerPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisteredPlayers method, of class PlayerRegistration.
     */
    @Test
    public void testGetRegisteredPlayers() {
        System.out.println("getRegisteredPlayers");
        PlayerRegistration instance = new PlayerRegistration();
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getRegisteredPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerByName method, of class PlayerRegistration.
     */
    @Test
    public void testGetPlayerByName() {
        System.out.println("getPlayerByName");
        String playerName = "";
        PlayerRegistration instance = new PlayerRegistration();
        Player expResult = null;
        Player result = instance.getPlayerByName(playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
