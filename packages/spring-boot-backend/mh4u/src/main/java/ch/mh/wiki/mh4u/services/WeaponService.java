package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Weapon;
import ch.mh.wiki.mh4u.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeaponService {
    private final WeaponRepository repository;

    @Autowired
    public WeaponService(WeaponRepository repository) {
        this.repository = repository;
    }

    public List<Weapon> getWeaponsByType(String wtype) {
        return  repository.findByWtype(wtype);
    }

    public List<Weapon> allWeapons() {
        return repository.findAll();
    }

    public Optional<Weapon> getWeaponById(int id) {
        return repository.findById(id);
    }
}
