package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.ItemToSkillTree;
import ch.mh.wiki.mh4u.services.ItemToSkillTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemToSkillTreeRepository {
    private final ItemToSkillTreeService service;

    @Autowired
    public ItemToSkillTreeRepository(ItemToSkillTreeService service) {
        this.service = service;
    }

    @GetMapping("/itemToSkillTree/{itemId}")
    public ItemToSkillTree getItemToSkillTree(@PathVariable int itemId) {
        return service.getItemToSkillTree(itemId);
    }
}
