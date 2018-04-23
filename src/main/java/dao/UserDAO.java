package dao;

import com.fontys.rekeningadministratie.domain.Role;
import com.fontys.rekeningadministratie.domain.User;

/**
 *
 * @author Remco
 */
public interface UserDAO {
    
    /**
     * Register a new user in the database.
     * @param user The user that needs to be saved in the database.
     */
    public void registerUser(User user);
    
    /**
     * Register a new role in the database.
     * @param role The role that needs to be saved in the database.
     */
    public void registerRole(Role role);
}