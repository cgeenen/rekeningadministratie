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
public class RoleTest {

    private static final Logger LOG = Logger.getLogger(RoleTest.class.getName());
    
    private Role role;

    /**
     * Method that runs before every test method.
     */
    @Before
    public void before() {
        this.role = new Role();
    }
    
    /**
     * Test of getName method, of class Role.
     */
    @Test
    public void testGetName() {
        LOG.log(Level.INFO, "Test: Role.getName");
        
        assertNull(this.role.getName());
    }

    /**
     * Test of setName method, of class Role.
     */
    @Test
    public void testSetName() {
        LOG.log(Level.INFO, "Test: Role.setName");
        
        String name = "TESTNAME";
        this.role.setName(name);
        assertEquals(this.role.getName(), name);
    }

    /**
     * Test of getUsers method, of class Role.
     */
    @Test
    public void testGetUsers() {
        LOG.log(Level.INFO, "Test: Role.getUsers");
        
        assertNull(this.role.getUsers());
    }

    /**
     * Test of setUsers method, of class Role.
     */
    @Test
    public void testSetUsers() {
        LOG.log(Level.INFO, "Test: Role.setUsers");
        
        List<User> users = new ArrayList<>();
        this.role.setUsers(users);
        
        assertEquals(this.role.getUsers(), users);
    }
}