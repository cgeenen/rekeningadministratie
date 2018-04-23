package service;

import com.fontys.rekeningadministratie.domain.Invoice;
import com.fontys.rekeningadministratie.domain.Month;
import com.fontys.rekeningadministratie.domain.PaymentStatus;
import dao.PaymentDAO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alexander
 */
@Stateless
public class PaymentService {
    
    @Inject
    PaymentDAO paymentDAO;

    /**
     * Fetch a specific Invoice.
     * @param invoiceNumber The number of the Invoice.
     * @return The specific Invoice object.
     */
    public Invoice getInvoice(Long invoiceNumber) {
        return this.paymentDAO.getInvoice(invoiceNumber);
    }

    /**
     * Fetch all Invoices.
     * @return All the Invoices as a list.
     */
    public List<Invoice> getInvoices() {
        return this.paymentDAO.getInvoices();
    }
    
    /**
     * Fetch all the Invoices for a specific Month.
     * @param month The Month that the Invoices need to be about.
     * @return A list with all the found Invoices.
     */
    public List<Invoice> getInvoicesForMonth(Month month) {
        List<Invoice> allInvoices = this.paymentDAO.getInvoices();
        List<Invoice> returnInvoices = new ArrayList<>();
        
        for (Invoice i : allInvoices) {
            if (i.getMonth().equals(month)) {
                returnInvoices.add(i);
            }
        }
        
        return returnInvoices;
    }
    
    /**
     * Fetch all the Invoices for a specific Month.
     * @param status The PaymentStatus that the Invoices needs to be.
     * @return A list with all the found Invoices.
     */
    public List<Invoice> getInvoicesForStatus(PaymentStatus status) {
        List<Invoice> allInvoices = this.paymentDAO.getInvoices();
        List<Invoice> returnInvoices = new ArrayList<>();
        
        for (Invoice i : allInvoices) {
            if (i.getStatus().equals(status)) {
                returnInvoices.add(i);
            }
        }
        
        return returnInvoices;
    }
    
    /**
     * Fetch the Invoices that belong to a User.
     * @param email The email of the User.
     * @return All the Invoices belonging to the User as a list.
     */
    public List<Invoice> getInvoicesForUser(String email) {
        return this.paymentDAO.getInvoicesForUser(email);
    }
    
    /**
     * Fetch all the Invoices that belong to a User with a certain PaymentStatus.
     * @param email The email of the User.
     * @param status The PaymentStatus of the Invoices.
     * @return All the Invoices with the status belonging to the User as a list.
     */
    public List<Invoice> getInvoicesForUserWithStatus(String email, PaymentStatus status) {
        List<Invoice> allInvoices = this.paymentDAO.getInvoicesForUser(email);
        List<Invoice> returnInvoices = new ArrayList<>();
        
        for (Invoice i : allInvoices) {
            if (i.getStatus().equals(status)) {
                returnInvoices.add(i);
            }
        }
        
        return returnInvoices;
    }
    
    /**
     * Fetch all the Invoices for a specific Month that belong to a User with a certain PaymentStatus.
     * @param email The email of the User.
     * @param status The PaymentStatus of the Invoices.
     * @param month The Month that the Invoice was for.
     * @return All the Invoices with the status belonging to the User as a list.
     */
    public List<Invoice> getInvoicesForUserWithStatusForMonth(String email, PaymentStatus status, Month month) {
        List<Invoice> invoicesWithStatusForUser = this.getInvoicesForUserWithStatus(email, status);
        List<Invoice> returnInvoices = new ArrayList<>();
        
        for (Invoice i : invoicesWithStatusForUser) {
            if (i.getMonth().equals(month)) {
                returnInvoices.add(i);
            }
        }
        
        return returnInvoices;
    }
    
    /**
     * Fetch all the Invoices for a specific Month that belong to a User.
     * @param email The email of the User.
     * @param month The Month of the Invoices.
     * @return All the Invoices with the Month belonging to the User as a list.
     */
    public List<Invoice> getInvoicesForUserForMonth(String email, Month month) {
        List<Invoice> allInvoices = this.paymentDAO.getInvoicesForUser(email);
        List<Invoice> returnInvoices = new ArrayList<>();
        
        for (Invoice i : allInvoices) {
            if (i.getMonth().equals(month)) {
                returnInvoices.add(i);
            }
        }
        
        return returnInvoices;
    }
}