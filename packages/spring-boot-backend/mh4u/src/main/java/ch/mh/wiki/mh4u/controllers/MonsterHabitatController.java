package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.MonsterHabitat;
import ch.mh.wiki.mh4u.services.MonsterHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MonsterHabitatController {
    private final MonsterHabitatService service;

    @Autowired
    public MonsterHabitatController(MonsterHabitatService service) {
        this.service = service;
    }

    @GetMapping("/habitatsLocation/{id}")
    public Optional<List<MonsterHabitat>> getHabitatsByLocationId(@PathVariable int id) {
        return service.getHabitatsByLocationId(id);
    }

    @GetMapping("/habitatsMonster/{id}")
    public Optional<List<MonsterHabitat>> getHabitatsByMonsterId(@PathVariable int id) {
        return service.getHabitatsByMonsterId(id);
    }

}
