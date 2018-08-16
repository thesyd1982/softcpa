/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import fr.sysdev.softcpa.entity.Address;
import fr.sysdev.softcpa.entity.Client;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author f
 */
public class ClientTest {
    
    public ClientTest() {
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

    /**
     * Test of getId method, of class Client.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Client instance = new Client();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Client.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long clientId = 0L;
        Client instance = new Client();
        instance.setId(clientId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Client.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Client instance = new Client();
        Address expResult = null;
        Address result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Client.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Address address = null;
        Client instance = new Client();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Client.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Client.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Client instance = new Client();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Client.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Client.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Client instance = new Client();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Client.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Client.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Client instance = new Client();
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephone method, of class Client.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getTelephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephone method, of class Client.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        String telephone = "";
        Client instance = new Client();
        instance.setTelephone(telephone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Client.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Client instance = new Client();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
