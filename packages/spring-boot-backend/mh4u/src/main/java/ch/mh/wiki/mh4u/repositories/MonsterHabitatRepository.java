package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.MonsterHabitat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MonsterHabitatRepository extends JpaRepository<MonsterHabitat, Integer> {
    Optional<List<MonsterHabitat>> findByMonsterId(int id);
    Optional<List<MonsterHabitat>> findByLocationId(int id);
    MonsterHabitat findByMonsterIdAndLocationId(int monsterId, int locationId);
}
