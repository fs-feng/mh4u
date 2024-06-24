package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Skill;
import ch.mh.wiki.mh4u.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SkillController {
    private final SkillService service;

    @Autowired
    public SkillController(SkillService service) {
        this.service = service;
    }

    @GetMapping("/skill/{id}")
    public Optional<List<Skill>> getSkills(@PathVariable int id) {
        return service.getSkillsbySkillTree(id);
    }
}
