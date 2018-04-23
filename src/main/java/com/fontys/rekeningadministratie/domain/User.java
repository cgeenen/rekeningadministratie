package com.fontys.rekeningadministratie.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author hanh-
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "User.getInvoices", query = "SELECT u.invoices FROM User u WHERE u.email = :email")
})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    
    private String email;
    
    private String password;

    @ManyToOne
    @JoinTable(name = "user_role")
    private Role role;
    
    @OneToOne(mappedBy="id")
    private Owner owner;

    /**
     * Empty constructor for JPA.
     */
    public User() { }

    /**
     * Default constructor.
     * @param email The email of the user.
     * @param password The password of the user.
     * @param role The role of the user.
     */
    public User(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    /**
     * Get the ID of the user.
     * @return The ID of the user.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the user.
     * @param id The ID of the user.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the email of the user.
     * @return The email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email of the user.
     * @param email The email of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the password of the user.
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of the user.
     * @param password The password of the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the role of the user.
     * @return The role of the user.
     */
    public Role getRole() {
        return role;
    }

    /**
     * Set the role of the user.
     * @param role The role of the user.
     */
    public void setRole(Role role) {
        this.role = role;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}