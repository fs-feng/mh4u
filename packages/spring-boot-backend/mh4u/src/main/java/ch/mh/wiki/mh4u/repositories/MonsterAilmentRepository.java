package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.MonsterAilment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MonsterAilmentRepository extends JpaRepository<MonsterAilment, Integer> {
    Optional<List<MonsterAilment>> findByMonsterId(int id);
}
