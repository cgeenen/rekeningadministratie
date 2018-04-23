package com.fontys.rekeningadministratie.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Dirkv
 */
@Entity
public class ProvinceSettings implements Serializable {
    
    @Id
    private ProvinceName provinceName;
    
    private BigDecimal baseRate; 
    
    /**
     * Empty constructor for JPA.
     */
    public ProvinceSettings() { }

    /**
     * Default constructor.
     * @param provinceName The name of the province.
     * @param baseRate The base rate of the province.
     */
    public ProvinceSettings(ProvinceName provinceName, BigDecimal baseRate) {
        this.provinceName = provinceName;
        this.baseRate = baseRate;
    }
    
    /**
     * Get the name of the province.
     * @return The name of the province as a ProvinceName enum.
     */
    public ProvinceName getProvinceName() {
        return provinceName;
    }

    /**
     * Set the name of the province.
     * @param provinceName The name of the province as a ProvinceName enum.
     */
    public void setProvinceName(ProvinceName provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * Get the base rate for driving in the province.
     * @return The base rate.
     */
    public BigDecimal getBaseRate() {
        return baseRate;
    }

    /**
     * Set the base rate for driving in the province.
     * @param baseRate The base rate.
     */
    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }
}