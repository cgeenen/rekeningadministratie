package com.fontys.rekeningadministratie.boundary.rest;

import com.fontys.rekeningadministratie.domain.Invoice;
import com.fontys.rekeningadministratie.domain.Month;
import com.fontys.rekeningadministratie.domain.PaymentStatus;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import service.PaymentService;

/**
 *
 * @author Alexander
 */
@Path("/payment")
@Stateless
public class PaymentResource {
    
    @Inject
    private PaymentService paymentService;
    
    /**
     * Fetch all the Invoices.
     * @return A list with all the Invoice objects.
     */
    @GET
    @Path("/invoices")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllInvoices() {
        return this.paymentService.getInvoices();
    }
    
    /**
     * Fetch all the Invoices that are during a specific Month.
     * @param month The Month the Invoices need to be about.
     * @return A List with all the found Invoices.
     */
    @GET
    @Path("/invoices/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllInvoicesForMonth(@PathParam("month") String month) {
        Month foundMonth = this.findMonthFromString(month);
        
        List<Invoice> foundInvoices = new ArrayList<>();
        
        if (foundMonth != null) {
            foundInvoices = this.paymentService.getInvoicesForMonth(foundMonth);
        }
        
        return foundInvoices;
    }
    
    /**
     * Fetch all the OPEN Invoices.
     * @return A List with all the found Invoices.
     */
    @GET
    @Path("/invoices/open")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllOpenInvoices() {
        return this.paymentService.getInvoicesForStatus(PaymentStatus.OPEN);
    }
    
    /**
     * Fetch all the PAID Invoices.
     * @return A List with all the found Invoices.
     */
    @GET
    @Path("/invoices/paid")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllPaidInvoices() {
        return this.paymentService.getInvoicesForStatus(PaymentStatus.PAID);
    }
    
    /**
     * Fetch all the CANCELLED Invoices.
     * @return A List with all the found Invoices.
     */
    @GET
    @Path("/invoices/cancelled")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllCancelledInvoices() {
        return this.paymentService.getInvoicesForStatus(PaymentStatus.CANCELLED);
    }
    
    /**
     * Fetch all the OPEN Invoices for a specific Month.
     * @param month The Month that the Invoices need to be about.
     * @return A List with all the found Invoices, all OPEN invoices if no month was found.
     */
    @GET
    @Path("/invoices/open/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllOpenInvoicesForMonth(@PathParam("month") String month) {
        List<Invoice> foundInvoices = this.paymentService.getInvoicesForStatus(PaymentStatus.OPEN);
               
        return this.filterInvoicesOnMonth(foundInvoices, month);
    }
    
    /**
     * Fetch all the PAID Invoices for a specific Month.
     * @param month The Month that the Invoices need to be about.
     * @return A List with all the found Invoices, all PAID invoices if no month was found.
     */
    @GET
    @Path("/invoices/paid/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllPaidInvoicesForMonth(@PathParam("month") String month) {
        List<Invoice> foundInvoices = this.paymentService.getInvoicesForStatus(PaymentStatus.PAID);
               
        return this.filterInvoicesOnMonth(foundInvoices, month);
    }
    
    /**
     * Fetch all the CANCELLED Invoices for a specific Month.
     * @param month The Month that the Invoices need to be about.
     * @return A List with all the found Invoices, all CANCELLED invoices if no month was found.
     */
    @GET
    @Path("/invoices/cancelled/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getAllCancelledInvoicesForMonth(@PathParam("month") String month) {
        List<Invoice> foundInvoices = this.paymentService.getInvoicesForStatus(PaymentStatus.CANCELLED);
               
        return this.filterInvoicesOnMonth(foundInvoices, month);
    }
    
    /**
     * Fetch an Invoice belonging to a User.
     * @param email The email of the User the Invoice belongs to.
     * @param id The number of the Invoice.
     * @return The requested Invoice object, null if not found.
     */
    @GET
    @Path("/{email}/invoices/{invoiceNr}")
    @Produces({"application/xml", "application/json"})
    public Invoice getInvoiceForUser(@PathParam("email") String email, @PathParam("invoiceNr") Long id) {
        return this.paymentService.getInvoice(id);
    }
    
    /**
     * Fetch all the Invoices belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getInvoicesForUser(@PathParam("email") String email) {
        return this.paymentService.getInvoicesForUser(email);
    }
    
    /**
     * Fetch all the OPEN Invoices belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/open")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getOpenInvoicesForUser(@PathParam("email") String email) {
        return this.paymentService.getInvoicesForUserWithStatus(email, PaymentStatus.OPEN);
    }
    
    /**
     * Fetch all the PAID Invoices belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/paid")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getPaidInvoicesForUser(@PathParam("email") String email) {
        return this.paymentService.getInvoicesForUserWithStatus(email, PaymentStatus.PAID);
    }
    
    /**
     * Fetch all the CANCELLED Invoices belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/cancelled")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getCancelledInvoicesForUser(@PathParam("email") String email) {
        return this.paymentService.getInvoicesForUserWithStatus(email, PaymentStatus.CANCELLED);
    }
    
    /**
     * Fetch all the Invoices for a specific Month belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @param month The Month that the Invoices need to be about.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getInvoicesForUserForMonth(@PathParam("email") String email, @PathParam("month") String month) {
        Month foundMonth = this.findMonthFromString(month);
        
        List<Invoice> foundInvoices = new ArrayList<>();
        
        if (foundMonth != null) {
            foundInvoices = this.paymentService.getInvoicesForUserForMonth(email, foundMonth);
        }
        
        return foundInvoices;
    }
    
    /**
     * Fetch all the OPEN Invoices for a specific Month belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @param month The Month that the Invoices need to be about.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/open/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getOpenInvoicesForUserForMonth(@PathParam("email") String email, @PathParam("month") String month) {
        Month foundMonth = this.findMonthFromString(month);
        
        List<Invoice> foundInvoices = new ArrayList<>();
        
        if (foundMonth != null) {
            foundInvoices = this.paymentService.getInvoicesForUserWithStatusForMonth(email, PaymentStatus.OPEN, foundMonth);
        }
        
        return foundInvoices;
    }
    
    /**
     * Fetch all the PAID Invoices for a specific Month belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @param month The Month that the Invoices need to be about.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/paid/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getPaidInvoicesForUserForMonth(@PathParam("email") String email, @PathParam("month") String month) {
        Month foundMonth = this.findMonthFromString(month);
        
        List<Invoice> foundInvoices = new ArrayList<>();
        
        if (foundMonth != null) {
            foundInvoices = this.paymentService.getInvoicesForUserWithStatusForMonth(email, PaymentStatus.PAID, foundMonth);
        }
        
        return foundInvoices;
    }
    
    /**
     * Fetch all the CANCELLED Invoices for a specific Month belonging to a User.
     * @param email The email of the User the Invoices belong to.
     * @param month The Month that the Invoices need to be about.
     * @return A list with all the Invoice objects.
     */
    @POST
    @Path("/{email}/invoices/cancelled/{month}")
    @Produces({"application/xml", "application/json"})
    public List<Invoice> getCancelledInvoicesForUserForMonth(@PathParam("email") String email, @PathParam("month") String month) {
        Month foundMonth = this.findMonthFromString(month);
        
        List<Invoice> foundInvoices = new ArrayList<>();
        
        if (foundMonth != null) {
            foundInvoices = this.paymentService.getInvoicesForUserWithStatusForMonth(email, PaymentStatus.CANCELLED, foundMonth);
        }
        
        return foundInvoices;
    }
    
    /**
     * Filters Invoices on a specific Month.
     * @param invoices The list of Invoices that needs to be filtered.
     * @param month The Month that the Invoices need to be about.
     * @return A filtered list, or the original list if no Month was found.
     */
    private List<Invoice> filterInvoicesOnMonth(List<Invoice> invoices, String month) {
        Month foundMonth = this.findMonthFromString(month);
        
        if (foundMonth == null) {
            return invoices;
        }
        
        List<Invoice> returnInvoices = new ArrayList<>();
        
        for (Invoice i : invoices) {
            if (i.getMonth().equals(foundMonth)) {
                returnInvoices.add(i);
            }
        }
        
        return returnInvoices;
    }
    
    /**
     * Find the Month object that corresponds to a string.
     * @param month The string with the Month.
     * @return The found Month objects, null if it hasn't been found.
     */
    private Month findMonthFromString(String month) {
        Month foundMonth = null;
        
        for (Month m : Month.values()) {
            if (month.equalsIgnoreCase(m.toString())) {
                foundMonth = m;
            }
        }
        
        return foundMonth;
    }
}