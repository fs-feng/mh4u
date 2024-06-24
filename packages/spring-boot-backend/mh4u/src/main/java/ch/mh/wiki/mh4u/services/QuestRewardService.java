package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Item;
import ch.mh.wiki.mh4u.models.QuestReward;
import ch.mh.wiki.mh4u.repositories.QuestRewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestRewardService {
    private final QuestRewardRepository repository;

    @Autowired
    public QuestRewardService(QuestRewardRepository repository) {
        this.repository = repository;
    }

    public Optional<List<QuestReward>> rewardsBySlotAndQuestId(String slot, int id) {
        return repository.findByRewardSlotAndQuestId(slot, id);
    }

    public Optional<List<QuestReward>> rewardsByItemId(int id) {
        return repository.findByItemId(id);
    }
}
