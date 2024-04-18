package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Item;
import ch.mh.wiki.mh4u.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ItemController {
    private final ItemService service;

    @Autowired
    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping("/allItems")
    public List<Item> getAllItems() {
        return service.getAllItems();
    }
}
