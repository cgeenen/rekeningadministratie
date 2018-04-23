package com.fontys.rekeningadministratie.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander
 */
public class ProvinceTest {

    private static final Logger LOG = Logger.getLogger(ProvinceTest.class.getName());

    /**
     * Test of values method, of class Province.
     */
    @Test
    public void testValues() {
        LOG.log(Level.INFO, "Test: Province.values");
        
        assertEquals(12, ProvinceName.values().length);
        assertEquals(ProvinceName.DRENTHE, ProvinceName.values()[0]);
        assertEquals(ProvinceName.FLEVOLAND, ProvinceName.values()[1]);
        assertEquals(ProvinceName.FRIESLAND, ProvinceName.values()[2]);
        assertEquals(ProvinceName.GELDERLAND, ProvinceName.values()[3]);
        assertEquals(ProvinceName.GRONINGEN, ProvinceName.values()[4]);
        assertEquals(ProvinceName.LIMBURG, ProvinceName.values()[5]);
        assertEquals(ProvinceName.NOORDBRABANT, ProvinceName.values()[6]);
        assertEquals(ProvinceName.NOORDHOLLAND, ProvinceName.values()[7]);
        assertEquals(ProvinceName.OVERIJSSEL, ProvinceName.values()[8]);
        assertEquals(ProvinceName.UTRECHT, ProvinceName.values()[9]);
        assertEquals(ProvinceName.ZEELAND, ProvinceName.values()[10]);
        assertEquals(ProvinceName.ZUIDHOLLAND, ProvinceName.values()[11]);
    }

    /**
     * Test of valueOf method, of class Province.
     */
    @Test
    public void testValueOf() {
        LOG.log(Level.INFO, "Test: Province.valueOf");
        
        String drenthe = "DRENTHE";
        assertEquals(ProvinceName.DRENTHE, ProvinceName.valueOf(drenthe));
        
        String flevoland = "FLEVOLAND";
        assertEquals(ProvinceName.FLEVOLAND, ProvinceName.valueOf(flevoland));
        
        String friesland = "FRIESLAND";
        assertEquals(ProvinceName.FRIESLAND, ProvinceName.valueOf(friesland));
        
        String gelderland = "GELDERLAND";
        assertEquals(ProvinceName.GELDERLAND, ProvinceName.valueOf(gelderland));
        
        String groningen = "GRONINGEN";
        assertEquals(ProvinceName.GRONINGEN, ProvinceName.valueOf(groningen));
        
        String limburg = "LIMBURG";
        assertEquals(ProvinceName.LIMBURG, ProvinceName.valueOf(limburg));
        
        String noordbrabant = "NOORDBRABANT";
        assertEquals(ProvinceName.NOORDBRABANT, ProvinceName.valueOf(noordbrabant));
        
        String noordholland = "NOORDHOLLAND";
        assertEquals(ProvinceName.NOORDHOLLAND, ProvinceName.valueOf(noordholland));
        
        String overijssel = "OVERIJSSEL";
        assertEquals(ProvinceName.OVERIJSSEL, ProvinceName.valueOf(overijssel));
        
        String utrecht = "UTRECHT";
        assertEquals(ProvinceName.UTRECHT, ProvinceName.valueOf(utrecht));
        
        String zeeland = "ZEELAND";
        assertEquals(ProvinceName.ZEELAND, ProvinceName.valueOf(zeeland));
        
        String zuidholland = "ZUIDHOLLAND";
        assertEquals(ProvinceName.ZUIDHOLLAND, ProvinceName.valueOf(zuidholland));
    }
}