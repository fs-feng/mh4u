package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Component;
import ch.mh.wiki.mh4u.services.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ComponentController {
    private final ComponentService service;

    @Autowired
    public ComponentController(ComponentService service) {
        this.service = service;
    }

    @GetMapping("/allComponents")
    public List<List<Component>> getAllComponents() {
        return service.getAllComponents();
    }

    @GetMapping("/componentItemId/{id}")
    public Optional<List<Component>> getComponentByItemId(@PathVariable int id) {
        return service.getComponentsByItemId(id);
    }
}
