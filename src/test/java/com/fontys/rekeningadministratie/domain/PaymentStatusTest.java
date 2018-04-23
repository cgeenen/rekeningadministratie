package com.fontys.rekeningadministratie.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander
 */
public class PaymentStatusTest {

    private static final Logger LOG = Logger.getLogger(PaymentStatusTest.class.getName());

    /**
     * Test of values method, of class PaymentStatus.
     */
    @Test
    public void testValues() {
        LOG.log(Level.INFO, "Test: PaymentStatus.values");
        
        assertEquals(3, PaymentStatus.values().length);
        assertEquals(PaymentStatus.OPEN, PaymentStatus.values()[0]);
        assertEquals(PaymentStatus.PAID, PaymentStatus.values()[1]);
        assertEquals(PaymentStatus.CANCELLED, PaymentStatus.values()[2]);
    }

    /**
     * Test of valueOf method, of class PaymentStatus.
     */
    @Test
    public void testValueOf() {
        LOG.log(Level.INFO, "Test: PaymentStatus.valueOf");
        
        String open = "OPEN";
        assertEquals(PaymentStatus.OPEN, PaymentStatus.valueOf(open));
        
        String paid = "PAID";
        assertEquals(PaymentStatus.PAID, PaymentStatus.valueOf(paid));
        
        String cancelled = "CANCELLED";
        assertEquals(PaymentStatus.CANCELLED, PaymentStatus.valueOf(cancelled));
    }
}