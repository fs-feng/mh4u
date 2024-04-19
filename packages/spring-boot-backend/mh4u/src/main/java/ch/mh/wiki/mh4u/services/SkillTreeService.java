package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.SkillTree;
import ch.mh.wiki.mh4u.repositories.SkillTreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillTreeService {
    private final SkillTreeRepository repository;

    @Autowired
    public SkillTreeService(SkillTreeRepository repository) {
        this.repository = repository;
    }

    public List<SkillTree> getAllSkillTrees() {
        return repository.findAll();
    }
}
