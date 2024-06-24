package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.QuestReward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestRewardRepository extends JpaRepository<QuestReward, Integer> {
    Optional<List<QuestReward>> findByRewardSlotAndQuestId(String slot, int id);
    Optional<List<QuestReward>> findByItemId(int id);
}
