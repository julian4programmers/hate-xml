package com.hatexml.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/myservice")
@Produces("text")
public class MyService {

    @GET
    @Path("/get")
    public String getSth() {
        System.out.println("MyService gets something");
        return "something -------------------";
    }
}
