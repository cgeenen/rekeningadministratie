package com.fontys.rekeningadministratie.domain;

import com.rekeningrijden.europe.dtos.SubInvoiceDto;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author hanh-
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Invoice.allInvoices", query = "SELECT i FROM Invoice i")
})
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    private Long invoiceNumber;
    
    private PaymentStatus status;
    
    private BigDecimal price;
    
    private String country;
    
    private Month invoiceDate;
    
    @ManyToOne
    private User recipient;

    /**
     * Empty constructor for JPA.
     */
    public Invoice() { }

    /**
     * Default constructor.
     * @param month The month that this invoice is about.
     * @param price The amount that has to be paid.
     */
    public Invoice(Month month, BigDecimal price) {
        this.invoiceDate = month;
        this.price = price;
    }
    
    public SubInvoiceDto toSubInvoiceDto(){
        if(invoiceNumber != null && 
                country != null && 
                status != null && 
                invoiceDate != null && 
                price != null){
        return new SubInvoiceDto(this.invoiceNumber.toString(), 
                this.country, 
                this.status.toString(), 
                this.invoiceDate.toString(), 
                String.valueOf(this.price));
        }
        return new SubInvoiceDto("","","","","");
    }
    
    /**
     * Get the number of the invoice.
     * @return The number of the invoice.
     */
    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Set the number of the invoice.
     * @param invoiceNumber The number of the invoice.
     */
    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * Get the status of the invoice.
     * @return The status of the invoice.
     */
    public PaymentStatus getStatus() {
        return status;
    }

    /**
     * Set the status of the invoice.
     * @param status The status of the invoice.
     */
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Month getMonth() {
        return invoiceDate;
    }

    public void setMonth(Month month) {
        this.invoiceDate = month;
    }

    /**
     * Get the total amount that has to be paid.
     * @return The amount that has to be paid.
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Set the total amount that has to be paid.
     * @param price The amount that has to be paid.
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Get the recipient of the invoice.
     * @return The user that has to pay the invoice.
     */
    public User getRecipient() {
        return recipient;
    }

    /**
     * Set the recipient of the invoice.
     * @param recipient The user that has to pay the invoice.
     */
    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}