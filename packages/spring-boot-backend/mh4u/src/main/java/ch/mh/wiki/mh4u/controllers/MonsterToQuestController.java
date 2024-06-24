package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.MonsterHabitat;
import ch.mh.wiki.mh4u.models.Quest;
import ch.mh.wiki.mh4u.services.MonsterToQuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MonsterToQuestController {
    private final MonsterToQuestService service;

    @Autowired
    public MonsterToQuestController(MonsterToQuestService service) {
        this.service = service;
    }

    @GetMapping("/monsterToQuest/habitat/{id}")
    public List<MonsterHabitat> monsterHabitatByQuestId(@PathVariable int id) {
        return service.monsterHabitatByQuestId(id);
    }

    @GetMapping("/monsterToQuest/monster/{id}")
    public List<Quest> monsterQuestByMonsterId(@PathVariable int id) {
        return service.monsterQuestByMonsterId(id);
    }
}
