package com.fontys.rekeningadministratie.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Alexander
 */
public class CartrackerTest {

    private static final Logger LOG = Logger.getLogger(CartrackerTest.class.getName());
    
    private Cartracker cartracker;
    
    @Before
    public void before() {
        this.cartracker = new Cartracker();
    }

    /**
     * Test of getId method, of class Cartracker.
     */
    @Test
    public void testGetId() {
        LOG.log(Level.INFO, "Test: Cartracker.getId");
        
        assertNull(this.cartracker.getId());
    }

    /**
     * Test of setId method, of class Cartracker.
     */
    @Test
    public void testSetId() {
        LOG.log(Level.INFO, "Test: Cartracker.setId");
        
        Long ID = Long.MAX_VALUE;
        this.cartracker.setId(ID);
        
        assertEquals(ID, this.cartracker.getId());
    }

    /**
     * Test of getMileage method, of class Cartracker.
     */
    @Test
    public void testGetMileage() {
        LOG.log(Level.INFO, "Test: Cartracker.getMileage");
        
        assertEquals(0, this.cartracker.getMileage());
    }

    /**
     * Test of setMileage method, of class Cartracker.
     */
    @Test
    public void testSetMileage() {
        LOG.log(Level.INFO, "Test: Cartracker.setMileage");
        
        int mileage = 123;
        this.cartracker.setMileage(mileage);
        
        assertEquals(mileage, this.cartracker.getMileage());
    }
}