package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Combining;
import ch.mh.wiki.mh4u.services.CombiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CombiningController {
    private final CombiningService service;

    @Autowired
    public CombiningController(CombiningService service) {
        this.service = service;
    }

    @GetMapping("/allCombining")
    public List<Combining> getAllCombining() {
        return service.getAllCombining();
    }

    @GetMapping("/combiningMatchId/{id}")
    public Optional<List<Combining>> getAllMatchingId(@PathVariable int id) {
        return service.getAllMatchingId(id);
    }
}
