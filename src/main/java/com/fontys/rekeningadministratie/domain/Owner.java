package com.fontys.rekeningadministratie.domain;

import java.io.Serializable;
import java.util.ArrayList;
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
public class Owner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private ProvinceName province;
    
    private String city;
    
    private String street;
    
    private String houseNumber;
    
    private String zipcode;       
    
    @OneToMany(mappedBy="owner")
    private List<Vehicle> ownedVehicles;
    
    /**
     * Empty constructor for JPA.
     */
    public Owner() { }

    /**
     * Default constructor.
     * @param name The name of the owner.
     * @param province The province where the owner lives.
     * @param city The city where the owner lives.
     * @param street The street where the owner lives. 
     * @param houseNumber The house number where the owner lives.
     * @param zipcode The zipcode where the owner lives.
     */
    public Owner(String name, ProvinceName province, String city, String street, String houseNumber, String zipcode) {
        this.name = name;
        this.province = province;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipcode = zipcode;
        this.ownedVehicles = new ArrayList();
    }
    
    /**
     * Get the ID of the owner.
     * @return The ID of the owner.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the owner.
     * @param id The ID of the owner.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the name of the owner.
     * @return The name of the owner.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the owner.
     * @param name The name of the owner.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the province where the owner lives.
     * @return The province where the owner lives.
     */
    public ProvinceName getProvince() {
        return province;
    }

    /**
     * Set the province where the owner lives.
     * @param province The province where the owner lives.
     */
    public void setProvince(ProvinceName province) {
        this.province = province;
    }

    /**
     * Get the city where the owner lives.
     * @return The city where the owner lives.
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the city where the owner lives.
     * @param city The city where the owner lives.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the street where the owner lives.
     * @return The street where the owner lives.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set the street where the owner lives.
     * @param street The street where the owner lives.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Get the house number where the owner lives.
     * @return The house number where the owner lives.
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Set the house number where the owner lives.
     * @param houseNumber The house number where the owner lives.
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Get the zipcode where the owner lives.
     * @return The zipcode where the owner lives.
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Set the zipcode where the owner lives.
     * @param zipcode The zipcode where the owner lives.
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * Get the vehicles that the owner owns.
     * @return A list of vehicles that the owner owns.
     */
    public List<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }
    
    /**
     * Set the vehicles that the owner owns.
     * @param vehicle A list of vehicles that the owner owns.
     */
    public void addOwnedVehicle(Vehicle vehicle) {
        if (this.ownedVehicles == null) {
            this.ownedVehicles = new ArrayList<>();
        }
        
        this.ownedVehicles.add(vehicle);
    }
    
    /**
     * Remove a vehicle from the list of owned vehicle.
     * @param vehicle The vehicle that needs to be removed.
     */
    public void removeOwnedVehicle(Vehicle vehicle) {
        if (this.ownedVehicles != null) {
            this.ownedVehicles.remove(vehicle);
        }
    }
}