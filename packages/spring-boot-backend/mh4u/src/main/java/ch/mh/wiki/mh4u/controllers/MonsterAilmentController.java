package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.MonsterAilment;
import ch.mh.wiki.mh4u.services.MonsterAilmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MonsterAilmentController {
    private final MonsterAilmentService service;

    @Autowired
    public MonsterAilmentController(MonsterAilmentService service) {
        this.service = service;
    }

    @GetMapping("/ailmentMonsterId/{id}")
    public Optional<List<MonsterAilment>> getAilmentsByMonsterId(@PathVariable int id) {
        return service.getAilmentsByMonsterId(id);
    }
}
