package dao;

import com.fontys.rekeningadministratie.domain.Role;
import com.fontys.rekeningadministratie.domain.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Remco
 */
@Stateless
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void registerUser(User user) {
        this.em.persist(user);
    }

    @Override
    public void registerRole(Role role) {
        this.em.persist(role);
    }
}