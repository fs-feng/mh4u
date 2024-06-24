package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestRepository extends JpaRepository<Quest, Integer> {
    List<Quest> findByHub(String hub);
}
