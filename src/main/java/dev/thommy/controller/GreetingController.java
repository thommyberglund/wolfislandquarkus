package dev.thommy.controller;

import dev.thommy.entity.GreetingEntity;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wolfisland")
public class GreetingController {

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {


        GreetingEntity greetingEntity = new GreetingEntity();
        greetingEntity.setMessage("hello");
        greetingEntity.persistAndFlush(); // #2
        return greetingEntity.getMessage();
    }
}