package dev.thommy.controller;

import dev.thommy.entity.ArmyEntity;
import dev.thommy.service.ArmyService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class ArmyController {

    @Inject
    ArmyService armyService;

    @Path("/army")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ArmyEntity> getArmies() {
        return armyService.findAllArmies();
    }

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String returnHello() {
        return "Hello from army controller";

    }
    @Path("army/create")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String create() {
        armyService.create();
        return "created";
    }
}
