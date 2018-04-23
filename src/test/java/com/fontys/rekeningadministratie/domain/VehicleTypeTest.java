package com.fontys.rekeningadministratie.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander
 */
public class VehicleTypeTest {

    private static final Logger LOG = Logger.getLogger(VehicleTypeTest.class.getName());

    /**
     * Test of values method, of class VehicleType.
     */
    @Test
    public void testValues() {
        LOG.log(Level.INFO, "Test: VehicleType.values");
        
        assertEquals(3, VehicleType.values().length);
        assertEquals(VehicleType.CAR, VehicleType.values()[0]);
        assertEquals(VehicleType.TRUCK, VehicleType.values()[1]);
        assertEquals(VehicleType.MOTORCYCLE, VehicleType.values()[2]);
    }

    /**
     * Test of valueOf method, of class VehicleType.
     */
    @Test
    public void testValueOf() {
        LOG.log(Level.INFO, "Test: VehicleType.valueOf");
        
        String car = "CAR";
        assertEquals(VehicleType.CAR, VehicleType.valueOf(car));
        
        String truck = "TRUCK";
        assertEquals(VehicleType.TRUCK, VehicleType.valueOf(truck));
        
        String motorcycle = "MOTORCYCLE";
        assertEquals(VehicleType.MOTORCYCLE, VehicleType.valueOf(motorcycle));
    }
}