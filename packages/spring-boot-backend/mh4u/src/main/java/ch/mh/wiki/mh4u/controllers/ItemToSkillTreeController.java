package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.ItemToSkillTree;
import ch.mh.wiki.mh4u.services.ItemToSkillTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemToSkillTreeController {
    private final ItemToSkillTreeService service;

    @Autowired
    public ItemToSkillTreeController(ItemToSkillTreeService service) {
        this.service = service;
    }

    @GetMapping("/itemToSkillTree/{itemId}")
    public List<ItemToSkillTree> getItemToSkillTree(@PathVariable int itemId) {
        return service.getItemToSkillTree(itemId);
    }
}
