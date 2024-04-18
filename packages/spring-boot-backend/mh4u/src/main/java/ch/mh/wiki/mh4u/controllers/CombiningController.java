package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Combining;
import ch.mh.wiki.mh4u.services.CombiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
