package com.fontys.rekeningadministratie.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Alexander
 */
public class VehicleTest {

    private static final Logger LOG = Logger.getLogger(VehicleTest.class.getName());
    
    private Vehicle vehicle;
    
    @Before
    public void before() {
        this.vehicle = new Vehicle();
    }

    /**
     * Test of getLicensePlate method, of class Vehicle.
     */
    @Test
    public void testGetLicensePlate() {
        LOG.log(Level.INFO, "Test: Vehicle.getLicensePlate");
        
        assertNull(this.vehicle.getLicensePlate());
    }

    /**
     * Test of setLicensePlate method, of class Vehicle.
     */
    @Test
    public void testSetLicensePlate() {
        LOG.log(Level.INFO, "Test: Vehicle.setLicensePlate");
        
        String licensePlate = "TEST";
        this.vehicle.setLicensePlate(licensePlate);
        
        assertEquals(licensePlate, this.vehicle.getLicensePlate());
    }

    /**
     * Test of getVehicleType method, of class Vehicle.
     */
    @Test
    public void testGetVehicleType() {
        LOG.log(Level.INFO, "Test: Vehicle.getVehicleType");
        
        assertNull(this.vehicle.getVehicleType());
    }

    /**
     * Test of setVehicleType method, of class Vehicle.
     */
    @Test
    public void testSetVehicleType() {
        LOG.log(Level.INFO, "Test: Vehicle.setVehicleType");
        
        this.vehicle.setVehicleType(VehicleType.CAR);
        
        assertEquals(VehicleType.CAR, this.vehicle.getVehicleType());
    }

    /**
     * Test of getCartracker method, of class Vehicle.
     */
    @Test
    public void testGetCartracker() {
        LOG.log(Level.INFO, "Test: Vehicle.getCartracker");
        
        assertNull(this.vehicle.getCartracker());
    }

    /**
     * Test of setCartracker method, of class Vehicle.
     */
    @Test
    public void testSetCartracker() {
        LOG.log(Level.INFO, "Test: Vehicle.setCartracker");
        
        Cartracker cartracker = new Cartracker();
        this.vehicle.setCartracker(cartracker);
        
        assertEquals(cartracker, this.vehicle.getCartracker());
    }

    /**
     * Test of getOwner method, of class Vehicle.
     */
    @Test
    public void testGetOwner() {
        LOG.log(Level.INFO, "Test: Vehicle.getOwner");
        
        assertNull(this.vehicle.getOwner());
    }

    /**
     * Test of setOwner method, of class Vehicle.
     */
    @Test
    public void testSetOwner() {
        LOG.log(Level.INFO, "Test: Vehicle.setOwner");
        
        Owner owner = new Owner();
        this.vehicle.setOwner(owner);
        
        assertEquals(owner, this.vehicle.getOwner());
    }
}