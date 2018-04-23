package com.fontys.rekeningadministratie.boundary.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Priorities;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 *
 * @author Remco
 */
@Path("token")
public class AuthResource {

    @Context
    private SecurityContext sctx;

    @Context
    private HttpServletRequest httpRequest;
    
    @GET
    @Produces("text/plain")
    public Response auth(@QueryParam("username") String username, @QueryParam("password") String password) {
        try {
            httpRequest.login(username, password);
            System.out.println("Authenticated user: " + sctx.getUserPrincipal().getName());
            
            //this.sctx = sctx;
            String authenticatedUser = sctx.getUserPrincipal().getName();
            Response resp = Response.ok(authenticatedUser + " authenticated")
                    .header("jwt", JWTokenUtility.buildJWT(authenticatedUser))
                    .build();
            
            return resp;
        } catch (ServletException ex) {
            Logger.getLogger(AuthResource.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return Response.serverError().header("LoginError", "Failed to login, credentials incorrect").build();
        }
        // Return 404 failed, not loggedin
        
    }

}
