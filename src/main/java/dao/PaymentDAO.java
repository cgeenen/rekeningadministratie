package dao;

import com.fontys.rekeningadministratie.domain.Invoice;
import java.util.List;

/**
 *
 * @author Alexander
 */
public interface PaymentDAO {
    
    /**
     * Insert a new Invoice in the database.
     * @param invoice The Invoice that needs to be saved in the database.
     */
    public void insert(Invoice invoice);
    
    /**
     * Change an Invoice in the database.
     * @param invoice The changed Invoice that needs to be merged.
     */
    public void change(Invoice invoice);
    
    /**
     * Fetch a specific Invoice.
     * @param invoiceNumber The Invoice number.
     * @return The Invoice as an object.
     */
    public Invoice getInvoice(Long invoiceNumber);

    /**
     * Fetch all Invoices.
     * @return The list of all Invoices.
     */
    public List<Invoice> getInvoices();
    
    /**
     * Fetch all the Invoices belonging to a certain User.
     * @param email The email of the User.
     * @return The list of Invoices belonging to the User.
     */
    public List<Invoice> getInvoicesForUser(String email);
}