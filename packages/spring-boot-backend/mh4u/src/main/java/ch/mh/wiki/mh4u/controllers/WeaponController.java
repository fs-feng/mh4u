package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.ItemToSkillTree;
import ch.mh.wiki.mh4u.models.Weapon;
import ch.mh.wiki.mh4u.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeaponController {
    private final WeaponService service;

    @Autowired
    public WeaponController(WeaponService service) {
        this.service = service;
    }

    @GetMapping("/weapons")
    public List<Weapon> weapons(@PathVariable String wtype) {
        return service.getWeaponsByType("Great Sword");
    }

    @GetMapping("/allWeapons")
    public List<Weapon> allWeapons() {
        return service.allWeapons();
    }
}
