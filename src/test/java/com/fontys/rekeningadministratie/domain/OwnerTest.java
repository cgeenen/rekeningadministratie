package com.fontys.rekeningadministratie.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Alexander
 */
public class OwnerTest {

    private static final Logger LOG = Logger.getLogger(OwnerTest.class.getName());
    
    private Owner owner;
    private static final String TEST = "TEST";
    
    @Before
    public void before() {
        this.owner = new Owner();
    }

    /**
     * Test of getId method, of class Owner.
     */
    @Test
    public void testGetId() {
        LOG.log(Level.INFO, "Test: Owner.getId");
        
        assertNull(this.owner.getId());
    }

    /**
     * Test of setId method, of class Owner.
     */
    @Test
    public void testSetId() {
        LOG.log(Level.INFO, "Test: Owner.setId");
        
        Long ID = Long.MAX_VALUE;
        this.owner.setId(ID);
        
        assertEquals(ID, this.owner.getId());
    }

    /**
     * Test of getName method, of class Owner.
     */
    @Test
    public void testGetName() {
        LOG.log(Level.INFO, "Test: Owner.getName");
        
        assertNull(this.owner.getName());
    }

    /**
     * Test of setName method, of class Owner.
     */
    @Test
    public void testSetName() {
        LOG.log(Level.INFO, "Test: Owner.setName");
        
        this.owner.setName(TEST);
        
        assertEquals(TEST, this.owner.getName());
    }

    /**
     * Test of getProvince method, of class Owner.
     */
    @Test
    public void testGetProvince() {
        LOG.log(Level.INFO, "Test: Owner.getProvince");
        
        assertNull(this.owner.getProvince());
    }

    /**
     * Test of setProvince method, of class Owner.
     */
    @Test
    public void testSetProvince() {
        LOG.log(Level.INFO, "Test: Owner.setProvince");
        
        ProvinceName province = ProvinceName.DRENTHE;
        this.owner.setProvince(province);
        
        assertEquals(province, this.owner.getProvince());
    }

    /**
     * Test of getCity method, of class Owner.
     */
    @Test
    public void testGetCity() {
        LOG.log(Level.INFO, "Test: Owner.getCity");
        
        assertNull(this.owner.getCity());
    }

    /**
     * Test of setCity method, of class Owner.
     */
    @Test
    public void testSetCity() {
        LOG.log(Level.INFO, "Test: Owner.setCity");
        
        this.owner.setCity(TEST);
        
        assertEquals(TEST, this.owner.getCity());
    }

    /**
     * Test of getStreet method, of class Owner.
     */
    @Test
    public void testGetStreet() {
        LOG.log(Level.INFO, "Test: Owner.getStreet");
        
        assertNull(this.owner.getStreet());
    }

    /**
     * Test of setStreet method, of class Owner.
     */
    @Test
    public void testSetStreet() {
        LOG.log(Level.INFO, "Test: Owner.setStreet");
        
        this.owner.setStreet(TEST);
        
        assertEquals(TEST, this.owner.getStreet());
    }

    /**
     * Test of getHouseNumber method, of class Owner.
     */
    @Test
    public void testGetHouseNumber() {
        LOG.log(Level.INFO, "Test: Owner.getHouseNumber");
        
        assertNull(this.owner.getHouseNumber());
    }

    /**
     * Test of setHouseNumber method, of class Owner.
     */
    @Test
    public void testSetHouseNumber() {
        LOG.log(Level.INFO, "Test: Owner.setHouseNumber");
        
        this.owner.setHouseNumber(TEST);
        
        assertEquals(TEST, this.owner.getHouseNumber());
    }

    /**
     * Test of getZipcode method, of class Owner.
     */
    @Test
    public void testGetZipcode() {
        LOG.log(Level.INFO, "Test: Owner.getZipcode");
        
        assertNull(this.owner.getZipcode());
    }

    /**
     * Test of setZipcode method, of class Owner.
     */
    @Test
    public void testSetZipcode() {
        LOG.log(Level.INFO, "Test: Owner.setZipcode");
        
        this.owner.setZipcode(TEST);
        
        assertEquals(TEST, this.owner.getZipcode());
    }

    /**
     * Test of getOwnedVehicles method, of class Owner.
     */
    @Test
    public void testGetOwnedVehicles() {
        LOG.log(Level.INFO, "Test: Owner.getOwnedVehicles");
        
        assertNull(this.owner.getOwnedVehicles());
    }

    /**
     * Test of addOwnedVehicle method, of class Owner.
     */
    @Test
    public void testAddOwnedVehicle() {
        LOG.log(Level.INFO, "Test: Owner.addOwnedVehicle");
        
        Vehicle vehicle = new Vehicle();
        this.owner.addOwnedVehicle(vehicle);
        
        assertEquals(1, this.owner.getOwnedVehicles().size());
    }

    /**
     * Test of removeOwnedVehicle method, of class Owner.
     */
    @Test
    public void testRemoveOwnedVehicle() {
        LOG.log(Level.INFO, "Test: Owner.removeOwnedVehicle");
        
        Vehicle vehicle = new Vehicle();
        this.owner.addOwnedVehicle(vehicle);
        
        this.owner.removeOwnedVehicle(vehicle);
        assertEquals(0, this.owner.getOwnedVehicles().size());
    }
}