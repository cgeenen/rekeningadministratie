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
public class UserTest {

    private static final Logger LOG = Logger.getLogger(UserTest.class.getName());
    
    private User user;
    private static final String TEST = "TEST";
    
    @Before
    public void before() {
        this.user = new User();
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        LOG.log(Level.INFO, "Test: User.getId");
        
        assertNull(this.user.getId());
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        LOG.log(Level.INFO, "Test: User.setId");
        
        Long ID = Long.MAX_VALUE;
        this.user.setId(ID);
        
        assertEquals(ID, this.user.getId());
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        LOG.log(Level.INFO, "Test: User.getEmail");
        
        assertNull(this.user.getEmail());
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        LOG.log(Level.INFO, "Test: User.setEmail");
        
        this.user.setEmail(TEST);
        
        assertEquals(TEST, this.user.getEmail());
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        LOG.log(Level.INFO, "Test: User.getPassword");
        
        assertNull(this.user.getPassword());
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        LOG.log(Level.INFO, "Test: User.setPassword");
        
        this.user.setPassword(TEST);
        
        assertEquals(TEST, this.user.getPassword());
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        LOG.log(Level.INFO, "Test: User.getRole");
        
        assertNull(this.user.getRole());
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        LOG.log(Level.INFO, "Test: User.setRole");
        
        Role role = new Role();
        this.user.setRole(role);
        
        assertEquals(role, this.user.getRole());
    }
}