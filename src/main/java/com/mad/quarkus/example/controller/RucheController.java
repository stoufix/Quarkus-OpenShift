package com.mad.quarkus.example.controller;

import com.mad.quarkus.example.entity.Ruche;
import com.mad.quarkus.example.service.RucheService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestScoped
@Path("/v1/ruche")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RucheController {

    private final RucheService rucheService ;

    @Inject
    public RucheController(RucheService rucheService) {
        this.rucheService = rucheService;
    }
    @GET
    @Operation(summary = "Gets all ruches", description = "Lists all available ruches")
    @APIResponses(value = @APIResponse(responseCode = "200", description = "Success",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Ruche.class))))
    public List<Ruche> getUsers() {
        return rucheService.getAllRuches();
    }
}
