package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Armor;
import ch.mh.wiki.mh4u.repositories.ArmorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArmorService {
    private final ArmorRepository repository;

    @Autowired
    public ArmorService(ArmorRepository repository) {
        this.repository = repository;
    }

    public List<Armor> getAllArmors() {
        return repository.findAll();
    }

    public Optional<Armor> getArmorById(int id) {
        return repository.findById(id);
    }
}
