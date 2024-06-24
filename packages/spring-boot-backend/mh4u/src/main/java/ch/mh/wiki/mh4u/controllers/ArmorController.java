package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Armor;
import ch.mh.wiki.mh4u.services.ArmorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ArmorController {
    private final ArmorService service;

    @Autowired
    public ArmorController(ArmorService service) {
        this.service = service;
    }

    @GetMapping("/allArmors")
    public List<Armor> getAllArmors() {
        return service.getAllArmors();
    }

    @GetMapping("/armorId/{id}")
    public Optional<Armor> getArmorById(@PathVariable int id) {
        return service.getArmorById(id);
    }
}
