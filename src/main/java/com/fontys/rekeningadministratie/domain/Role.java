package com.fontys.rekeningadministratie.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author hanh-
 */
@Entity
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    /**
     * Empty constructor for JPA.
     */
    public Role() {
    }

    /**
     * Default constructor.
     * @param name Name of the role.
     */
    public Role(String name) {
        this.name = name;
    }

    /**
     * Get the name of the role.
     * @return The name of the role.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the role.
     * @param name The name of the role.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the users that belong to this role.
     * @return The list of users.
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Set the users that belong to this role.
     * @param users The list of users.
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }
}