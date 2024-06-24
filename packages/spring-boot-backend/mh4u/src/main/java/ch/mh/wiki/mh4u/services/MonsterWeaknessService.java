package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.MonsterWeakness;
import ch.mh.wiki.mh4u.repositories.MonsterWeaknessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonsterWeaknessService {
    private final MonsterWeaknessRepository repository;

    @Autowired
    public MonsterWeaknessService(MonsterWeaknessRepository repository) {
        this.repository = repository;
    }

    public Optional<List<MonsterWeakness>> getWeaknessByMonsterId(int id) {
        return repository.findByMonsterId(id);
    }
}
