package com.fontys.rekeningadministratie.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hanh-
 */
@Entity
public class Cartracker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int mileage;

    /**
     * Empty constructor for JPA.
     */
    public Cartracker() { }

    /**
     * Default constructor.
     * @param mileage The mileage of the cartracker.
     */
    public Cartracker(int mileage) {
        this.mileage = mileage;
    }
    
    /**
     * Get the ID of the cartracker.
     * @return The ID of the cartracker.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the cartracker.
     * @param id The ID of the cartracker.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the mileage of the cartracker.
     * @return The mileage of the cartracker.
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Set the mileage of the cartracker.
     * @param mileage The mileage of the cartracker.
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}