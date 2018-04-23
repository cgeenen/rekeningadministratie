package dao;

import com.fontys.rekeningadministratie.domain.Invoice;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexander
 */
@Stateless
public class PaymentDAOImpl implements PaymentDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Invoice invoice) {
        this.em.persist(invoice);
    }

    @Override
    public void change(Invoice invoice) {
        this.em.merge(invoice);
    }
    
    @Override
    public Invoice getInvoice(Long invoiceNumber) {
        return this.em.find(Invoice.class, invoiceNumber);
    }

    @Override
    public List<Invoice> getInvoices() {
        return this.em.createNamedQuery("Invoice.allInvoices").getResultList();
    }

    @Override
    public List<Invoice> getInvoicesForUser(String email) {
        return this.em.createNamedQuery("User.getInvoices").setParameter(1, email).getResultList();
    }
}