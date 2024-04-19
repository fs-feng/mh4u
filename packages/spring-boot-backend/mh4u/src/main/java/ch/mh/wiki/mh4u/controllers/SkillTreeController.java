package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.SkillTree;
import ch.mh.wiki.mh4u.services.SkillTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class SkillTreeController {
    private final SkillTreeService service;

    @Autowired
    public SkillTreeController(SkillTreeService service) {
        this.service = service;
    }

    @GetMapping("/allSkillTrees")
    public List<SkillTree> getAllSkillTrees() {
        return service.getAllSkillTrees();
    }
}
