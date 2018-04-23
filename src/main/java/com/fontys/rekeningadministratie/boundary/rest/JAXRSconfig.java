package com.fontys.rekeningadministratie.boundary.rest;

import com.fontys.rekeningadministratie.boundary.rest.filter.AuthFilter;
import com.fontys.rekeningadministratie.boundary.rest.filter.ResponseFilter;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author hanh-
 */
@ApplicationPath("/api")
public class JAXRSconfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> clazzes = new HashSet();
        clazzes.add(AuthFilter.class);
        clazzes.add(AdministratieResource.class);
        clazzes.add(PaymentResource.class);
        clazzes.add(ResponseFilter.class);

        return clazzes;
    }
}
