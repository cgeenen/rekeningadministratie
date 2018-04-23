package com.fontys.rekeningadministratie.domain;

/**
 *
 * @author hanh-
 */
public enum PaymentStatus {

    /**
     * Has yet to be paid.
     */
    OPEN,

    /**
     * Has been paid.
     */
    PAID,

    /**
     * No longer needs to be paid.
     */
    CANCELLED
}