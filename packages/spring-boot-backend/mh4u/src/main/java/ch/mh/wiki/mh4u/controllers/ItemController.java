package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Item;
import ch.mh.wiki.mh4u.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/itemId/{id}")
    public Optional<Item> getItemById(@PathVariable int id) {
        return service.getItemById(id);
    }
}
