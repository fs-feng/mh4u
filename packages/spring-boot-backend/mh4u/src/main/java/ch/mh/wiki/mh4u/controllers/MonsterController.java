package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Monster;
import ch.mh.wiki.mh4u.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class MonsterController {
    private final MonsterService service;

    @Autowired
    public MonsterController(MonsterService service) {
        this.service = service;
    }

    @GetMapping("/allMonsters")
    public List<Monster> getAllMonsters() {
        return service.getAllMonsters();
    }

    @GetMapping("/monsterId/{id}")
    public Optional<Monster> getMonsterById(@PathVariable int id) {
        return service.getMonsterById(id);
    }
}
