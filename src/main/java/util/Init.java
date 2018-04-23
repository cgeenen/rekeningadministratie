/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.fontys.rekeningadministratie.domain.ProvinceName;
import com.fontys.rekeningadministratie.domain.ProvinceSettings;
import com.fontys.rekeningadministratie.domain.Role;
import com.fontys.rekeningadministratie.domain.User;
import dao.UserDAO;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.ProvinceDAO;

/**
 *
 * @author Remco
 */
@Startup
@Singleton
public class Init {

    private static final Logger LOG = Logger.getLogger(Init.class.getName());

    @Inject
    UserDAO userDAO;
    
    @Inject
    ProvinceDAO provinceDAO;
    
    /**
     * Initialize database with data.
     */
    @PostConstruct
    public void init() {
        LOG.log(Level.INFO, "Initializing database with some data...");

        Role role1 = new Role("admin");
        Role role2 = new Role("user");

        userDAO.registerRole(role1);
        userDAO.registerRole(role2);

        User user = new User("Cornee", hashPW("bind"), role1);
        User user2 = new User("Teun", hashPW("leaves"), role2);

        userDAO.registerUser(user);
        userDAO.registerUser(user2);
        
        for(ProvinceName province : ProvinceName.values()){
            ProvinceSettings settings = new ProvinceSettings(province, BigDecimal.ONE);
            provinceDAO.addProvinceSettings(settings);
        }
        
        //TODO persist ProvinceSettings.
    }

    /**
     * Hash password with SHA-256 algorithm.
     * @param password The password that needs to be hashed.
     * @return The hashed password.
     */
    public String hashPW(String password) {
        String basepw = "";

        try {
            final MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hasha = md.digest(password.getBytes(StandardCharsets.UTF_8));
            basepw = Base64.getEncoder().encodeToString(hasha);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return basepw;
    }
}