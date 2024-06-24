package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Weapon;
import ch.mh.wiki.mh4u.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class WeaponController {
    private final WeaponService service;

    @Autowired
    public WeaponController(WeaponService service) {
        this.service = service;
    }

    @GetMapping("/weapons/{wtype}")
    public List<Weapon> getWeaponByType(@PathVariable String wtype ) {
        return service.getWeaponsByType(wtype);
    }

    @GetMapping("/allWeapons")
    public List<Weapon> allWeapons() {
        return service.allWeapons();
    }

    @GetMapping("/weaponId/{id}")
    public Optional<Weapon> weaponById(@PathVariable int id) {
        return service.getWeaponById(id);
    }
}
