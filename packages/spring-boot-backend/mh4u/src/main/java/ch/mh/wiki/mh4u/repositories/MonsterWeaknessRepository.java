package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.MonsterWeakness;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MonsterWeaknessRepository extends JpaRepository<MonsterWeakness, Integer> {
    Optional<List<MonsterWeakness>> findByMonsterId(int id);
}
