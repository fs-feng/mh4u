package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Decoration;
import ch.mh.wiki.mh4u.services.DecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DecorationController {
    private final DecorationService service;

    @Autowired
    public DecorationController(DecorationService service) {
        this.service = service;
    }

    @GetMapping("/allDecorations")
    public List<Decoration> getAllDecorations() {
        return service.getAllDecorations();
    }

    @GetMapping("/decorationById/{id}")
    public Optional<Decoration> getDecorationById(@PathVariable int id) {
        return service.getDecorationById(id);
    }

}
