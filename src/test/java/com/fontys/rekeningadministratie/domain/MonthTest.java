package com.fontys.rekeningadministratie.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander
 */
public class MonthTest {

    private static final Logger LOG = Logger.getLogger(MonthTest.class.getName());

    /**
     * Test of values method, of class Month.
     */
    @Test
    public void testValues() {
        LOG.log(Level.INFO, "Test: Month.values");
        
        assertEquals(12, Month.values().length);
        assertEquals(Month.JANUARY, Month.values()[0]);
        assertEquals(Month.FEBRUARY, Month.values()[1]);
        assertEquals(Month.MARCH, Month.values()[2]);
        assertEquals(Month.APRIL, Month.values()[3]);
        assertEquals(Month.MAY, Month.values()[4]);
        assertEquals(Month.JUNE, Month.values()[5]);
        assertEquals(Month.JULY, Month.values()[6]);
        assertEquals(Month.AUGUST, Month.values()[7]);
        assertEquals(Month.SEPTEMBER, Month.values()[8]);
        assertEquals(Month.OCTOBER, Month.values()[9]);
        assertEquals(Month.NOVEMBER, Month.values()[10]);
        assertEquals(Month.DECEMBER, Month.values()[11]);
    }

    /**
     * Test of valueOf method, of class Month.
     */
    @Test
    public void testValueOf() {
        LOG.log(Level.INFO, "Test: Month.valueOf");
        
        String january = "JANUARY";
        assertEquals(Month.JANUARY, Month.valueOf(january));
        
        String february = "FEBRUARY";
        assertEquals(Month.FEBRUARY, Month.valueOf(february));
        
        String march = "MARCH";
        assertEquals(Month.MARCH, Month.valueOf(march));
        
        String april = "APRIL";
        assertEquals(Month.APRIL, Month.valueOf(april));
        
        String may = "MAY";
        assertEquals(Month.MAY, Month.valueOf(may));
        
        String june = "JUNE";
        assertEquals(Month.JUNE, Month.valueOf(june));
        
        String july = "JULY";
        assertEquals(Month.JULY, Month.valueOf(july));
        
        String august = "AUGUST";
        assertEquals(Month.AUGUST, Month.valueOf(august));
        
        String september = "SEPTEMBER";
        assertEquals(Month.SEPTEMBER, Month.valueOf(september));
        
        String october = "OCTOBER";
        assertEquals(Month.OCTOBER, Month.valueOf(october));
        
        String november = "NOVEMBER";
        assertEquals(Month.NOVEMBER, Month.valueOf(november));
        
        String december = "DECEMBER";
        assertEquals(Month.DECEMBER, Month.valueOf(december));
    }
}