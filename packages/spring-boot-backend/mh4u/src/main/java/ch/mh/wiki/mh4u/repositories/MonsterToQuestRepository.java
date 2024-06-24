package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.MonsterHabitat;
import ch.mh.wiki.mh4u.models.MonsterToQuest;
import ch.mh.wiki.mh4u.models.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MonsterToQuestRepository extends JpaRepository<MonsterToQuest, Integer> {
    Optional<List<MonsterToQuest>> findByQuestId(int id);
    Optional<List<MonsterToQuest>> findByMonsterId(int id);
}
