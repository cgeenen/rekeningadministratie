package com.fontys.rekeningadministratie.boundary.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Remco
 */
@ApplicationPath("/path")
public class ProtectedJAXRSConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> clazzes = new HashSet();
        //clazzes.add(AuthFilter.class);
        clazzes.add(AuthResource.class);
        //clazzes.add(ReponseFilter.class);

        return clazzes;
        //return super.getClasses(); //To change body of generated methods, choose Tools | Templates.
    }
}
