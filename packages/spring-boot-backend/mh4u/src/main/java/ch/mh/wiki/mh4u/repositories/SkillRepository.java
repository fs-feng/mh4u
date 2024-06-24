package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
    Optional<List<Skill>> findBySkillTreeId(int id);
}
