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
public class InvoiceTest {

    private static final Logger LOG = Logger.getLogger(InvoiceTest.class.getName());
    
    private Invoice invoice;
    
    @Before
    public void before() {
        this.invoice = new Invoice();
    }

    /**
     * Test of getInvoiceNumber method, of class Invoice.
     */
    @Test
    public void testGetInvoiceNumber() {
        LOG.log(Level.INFO, "Test: Invoice.getInvoiceNumber");
        
        assertNull(this.invoice.getInvoiceNumber());
    }

    /**
     * Test of setInvoiceNumber method, of class Invoice.
     */
    @Test
    public void testSetInvoiceNumber() {
        LOG.log(Level.INFO, "Test: Invoice.setInvoiceNumber");
        
        Long number = Long.MAX_VALUE;
        this.invoice.setInvoiceNumber(number);
        
        assertEquals(number, this.invoice.getInvoiceNumber());
    }

    /**
     * Test of getStatus method, of class Invoice.
     */
    @Test
    public void testGetStatus() {
        LOG.log(Level.INFO, "Test: Invoice.getStatus");
        
        assertNull(this.invoice.getStatus());
    }

    /**
     * Test of setStatus method, of class Invoice.
     */
    @Test
    public void testSetStatus() {
        LOG.log(Level.INFO, "Test: Invoice.setStatus");
        
        PaymentStatus status = PaymentStatus.OPEN;
        this.invoice.setStatus(status);
        
        assertEquals(status, this.invoice.getStatus());
    }

    /**
     * Test of getMonth method, of class Invoice.
     */
    @Test
    public void testGetMonth() {
        LOG.log(Level.INFO, "Test: Invoice.getMonth");
        
        assertNull(this.invoice.getMonth());
    }

    /**
     * Test of setMonth method, of class Invoice.
     */
    @Test
    public void testSetMonth() {
        LOG.log(Level.INFO, "Test: Invoice.setMonth");
        
        Month month = Month.JANUARY;
        this.invoice.setMonth(month);
        
        assertEquals(month, this.invoice.getMonth());
    }

    /**
     * Test of getTotal method, of class Invoice.
     */
    @Test
    public void testGetTotal() {
        LOG.log(Level.INFO, "Test: Invoice.getTotal");
        
        assertNull(this.invoice.getPrice());
    }

    /**
     * Test of setTotal method, of class Invoice.
     */
    @Test
    public void testSetTotal() {
        LOG.log(Level.INFO, "Test: Invoice.setTotal");
        
        BigDecimal total = BigDecimal.ONE;
        this.invoice.setPrice(total);
        
        assertEquals(total, this.invoice.getPrice());
    }

    /**
     * Test of getRecipient method, of class Invoice.
     */
    @Test
    public void testGetRecipient() {
        LOG.log(Level.INFO, "Test: Invoice.getRecipient");
        
        assertNull(this.invoice.getRecipient());
    }

    /**
     * Test of setRecipient method, of class Invoice.
     */
    @Test
    public void testSetRecipient() {
        LOG.log(Level.INFO, "Test: Invoice.setRecipient");
        
        User user = new User();
        this.invoice.setRecipient(user);
        
        assertEquals(user, this.invoice.getRecipient());
    }
}