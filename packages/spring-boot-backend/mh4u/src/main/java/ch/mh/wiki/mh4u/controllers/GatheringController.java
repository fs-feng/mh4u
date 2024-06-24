package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Gathering;
import ch.mh.wiki.mh4u.services.GatheringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GatheringController {

    private final GatheringService service;

    @Autowired
    public GatheringController(GatheringService service) {
        this.service = service;
    }

    @GetMapping("/gatheringLocation/{id}/{rank}")
    public Optional<List<Gathering>> getGatheringsByLocationId(@PathVariable int id, @PathVariable String rank){
        return this.service.getGatheringsByLocationId(id, rank);
    }

    @GetMapping("/gatheringItem/{id}")
    public Optional<List<Gathering>> getGatheringsByItemId(@PathVariable int id){
        return this.service.getGatheringsByItemId(id);
    }
}
