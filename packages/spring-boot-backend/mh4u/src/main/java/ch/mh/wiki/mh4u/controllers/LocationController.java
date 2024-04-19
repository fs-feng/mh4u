package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Location;
import ch.mh.wiki.mh4u.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    private final LocationService service;

    @Autowired
    public LocationController(LocationService service) {
        this.service = service;
    }

    @GetMapping("/allLocations")
    public List<Location> getAllLocations() {
        return service.getAllLocations();
    }
}
