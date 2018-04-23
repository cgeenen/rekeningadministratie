package service;

import com.fontys.rekeningadministratie.domain.User;
import dao.UserDAO;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Remco
 */
@Stateless
public class AdministratieService {

    @Inject
    UserDAO userDAO;
    
    /**
     * Register a user.
     * @param user The user that needs to be registered.
     */
    public void registerUser(User user) {
        userDAO.registerUser(user);
    }
}