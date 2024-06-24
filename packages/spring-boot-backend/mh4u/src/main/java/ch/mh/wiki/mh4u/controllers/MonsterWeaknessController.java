package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.MonsterWeakness;
import ch.mh.wiki.mh4u.services.MonsterWeaknessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MonsterWeaknessController {
    private final MonsterWeaknessService service;

    @Autowired
    public MonsterWeaknessController(MonsterWeaknessService service) {
        this.service = service;
    }

    @GetMapping("/weaknessMonsterId/{id}")
    public Optional<List<MonsterWeakness>> getWeaknessByMonsterId(@PathVariable int id) {
        return service.getWeaknessByMonsterId(id);
    }
}
