package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Monster;
import ch.mh.wiki.mh4u.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonsterService {
    private final MonsterRepository repository;

    @Autowired
    public MonsterService(MonsterRepository repository) {
        this.repository = repository;
    }

    public List<Monster> getAllMonsters() {
        return repository.findAll();
    }

    public Optional<Monster> getMonsterById(int id) {
        return repository.findById(id);
    }
}
