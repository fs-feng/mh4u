package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Monster;
import ch.mh.wiki.mh4u.models.MonsterHabitat;
import ch.mh.wiki.mh4u.repositories.MonsterHabitatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonsterHabitatService {
    private final MonsterHabitatRepository repository;

    @Autowired
    public MonsterHabitatService(MonsterHabitatRepository repository) {
        this.repository = repository;
    }

    public Optional<List<MonsterHabitat>> getHabitatsByMonsterId(int id) {
        return repository.findByMonsterId(id);
    }

    public Optional<List<MonsterHabitat>> getHabitatsByLocationId(int id) {
        return repository.findByLocationId(id);
    }
}
