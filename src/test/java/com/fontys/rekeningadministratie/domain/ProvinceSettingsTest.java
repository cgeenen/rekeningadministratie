/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.rekeningadministratie.domain;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Alexander
 */
public class ProvinceSettingsTest {

    private static final Logger LOG = Logger.getLogger(ProvinceSettingsTest.class.getName());

    private ProvinceSettings provinceSettings;
    
    @Before
    public void before() {
        this.provinceSettings = new ProvinceSettings();
    }
    /**
     * Test of getProvinceName method, of class ProvinceSettings.
     */
    @Test
    public void testGetProvinceName() {
        LOG.log(Level.INFO, "Test: ProvinceSettings.getProvinceName");
        
        assertNull(this.provinceSettings.getProvinceName());
    }

    /**
     * Test of setProvinceName method, of class ProvinceSettings.
     */
    @Test
    public void testSetProvinceName() {
        LOG.log(Level.INFO, "Test: ProvinceSettings.setProvinceName");
        
        this.provinceSettings.setProvinceName(ProvinceName.DRENTHE);
        
        assertEquals(ProvinceName.DRENTHE, this.provinceSettings.getProvinceName());
    }

    /**
     * Test of getBaseRate method, of class ProvinceSettings.
     */
    @Test
    public void testGetBaseRate() {
        LOG.log(Level.INFO, "Test: ProvinceSettings.getBaseRate");
        
        assertNull(this.provinceSettings.getBaseRate());
    }

    /**
     * Test of setBaseRate method, of class ProvinceSettings.
     */
    @Test
    public void testSetBaseRate() {
        LOG.log(Level.INFO, "Test: ProvinceSettings.setBaseRate");
        
        this.provinceSettings.setBaseRate(BigDecimal.ONE);
        
        assertEquals(BigDecimal.ONE, this.provinceSettings.getBaseRate());
    }
}