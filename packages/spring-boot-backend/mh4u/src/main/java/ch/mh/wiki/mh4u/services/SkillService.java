package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Skill;
import ch.mh.wiki.mh4u.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    private final SkillRepository repository;

    @Autowired
    public SkillService(SkillRepository repository) {
        this.repository = repository;
    }

    public Optional<List<Skill>> getSkillsbySkillTree(int id) {
        return repository.findBySkillTreeId(id);
    }
}
