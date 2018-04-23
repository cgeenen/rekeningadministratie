package com.fontys.rekeningadministratie.boundary.rest;

import com.fontys.rekeningadministratie.domain.Invoice;
import com.fontys.rekeningadministratie.domain.Month;
import com.fontys.rekeningadministratie.domain.PaymentStatus;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import service.AdministratieService;
import service.PaymentService;


/**
 *
 * @author Remco
 */
@Path("/main")
@Stateless
public class AdministratieResource {

    @Inject
    private AdministratieService administratieService;

    /**
     * Register a user.
     * @return True if the registration was succesful, otherwise false.
     */
    @GET
    @Path("/register")
    @Produces({"application/xml", "application/json"})
    public boolean registerUser() {
        //this.administratieService.registerUser(user)
        return true;
    }
}