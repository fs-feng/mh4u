package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Quest;
import ch.mh.wiki.mh4u.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class QuestController {
    private final QuestService service;

    @Autowired
    public QuestController(QuestService service) {
        this.service = service;
    }

    @GetMapping("/questsByHub/{hub}")
    public List<Quest> getQuestsByHub(@PathVariable String hub) {
        return service.getQuestsByHub(hub);
    }

    @GetMapping("/allQuests")
    public List<Quest> getAllQuests() {
        return service.getAll();
    }

    @GetMapping("/questId/{id}")
    public Optional<Quest> getQuestById(@PathVariable int id) {
        return service.getQuestById(id);
    }
}
