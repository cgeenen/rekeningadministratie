package com.fontys.rekeningadministratie.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author hanh-
 */
@Entity
public class Vehicle implements Serializable {

    @ManyToOne
    private Owner owner;
    
    @Id
    private String licensePlate;
    
    private VehicleType vehicleType;
    
    @OneToOne
    private Cartracker cartracker;
    
    @OneToMany(mappedBy = "invoiceNumber")
    List<Invoice> subinvoices;

    /**
     * Empty constructor for JPA.
     */
    public Vehicle() {
    }
    
    /**
     * Default constructor.
     * @param licensePlate The license plate of the vehicle.
     * @param vehicleType The type of vehicle.
     */
    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    /**
     * Get the license plate of the vehicle.
     * @return The license plate of the vehicle.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Set the license plate of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Get the type of vehicle.
     * @return The type of vehicle.
     */
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    /**
     * Set the type of vehicle.
     * @param vehicleType The type of vehicle.
     */
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Get the cartracker of the vehicle.
     * @return The cartracker of the vehicle.
     */
    public Cartracker getCartracker() {
        return cartracker;
    }

    /**
     * Set the cartracker of the vehicle.
     * @param cartracker The cartracker of the vehicle.
     */
    public void setCartracker(Cartracker cartracker) {
        this.cartracker = cartracker;
    }

    /**
     * Get the owner of the vehicle.
     * @return An Owner object.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Set the owner of the vehicle.
     * @param owner An Owner object.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}