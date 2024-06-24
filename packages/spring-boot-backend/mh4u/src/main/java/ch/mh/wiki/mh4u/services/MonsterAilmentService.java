package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.MonsterAilment;
import ch.mh.wiki.mh4u.repositories.MonsterAilmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonsterAilmentService {
    private final MonsterAilmentRepository repository;

    @Autowired
    public MonsterAilmentService(MonsterAilmentRepository repository) {
        this.repository = repository;
    }

    public Optional<List<MonsterAilment>> getAilmentsByMonsterId(int id) {
        return repository.findByMonsterId(id);
    }
}
