/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entities;

import fr.sysdev.softcpa.entity.Address;
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
public class AddressTest {
    
    public AddressTest() {
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
     * Test of getPostCode method, of class Address.
     */
    @Test
    public void testGetPostCode() {
        System.out.println("getPostCode");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getPostCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPostCode method, of class Address.
     */
    @Test
    public void testSetPostCode() {
        System.out.println("setPostCode");
        String postCode = "";
        Address instance = new Address();
        instance.setPostCode(postCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Address.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class Address.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Address instance = new Address();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlatNumber method, of class Address.
     */
    @Test
    public void testGetFlatNumber() {
        System.out.println("getFlatNumber");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getFlatNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlatNumber method, of class Address.
     */
    @Test
    public void testSetFlatNumber() {
        System.out.println("setFlatNumber");
        String flatNumber = "";
        Address instance = new Address();
        instance.setFlatNumber(flatNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHouseNumber method, of class Address.
     */
    @Test
    public void testGetHouseNumber() {
        System.out.println("getHouseNumber");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getHouseNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHouseNumber method, of class Address.
     */
    @Test
    public void testSetHouseNumber() {
        System.out.println("setHouseNumber");
        String houseNumber = "";
        Address instance = new Address();
        instance.setHouseNumber(houseNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStreet method, of class Address.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getStreet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStreet method, of class Address.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "";
        Address instance = new Address();
        instance.setStreet(street);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdAddress method, of class Address.
     */
    @Test
    public void testGetIdAddress() {
        System.out.println("getIdAddress");
        Address instance = new Address();
        long expResult = 0L;
        long result = instance.getIdAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAddress method, of class Address.
     */
    @Test
    public void testSetIdAddress() {
        System.out.println("setIdAddress");
        long idAddress = 0L;
        Address instance = new Address();
        instance.setIdAddress(idAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
