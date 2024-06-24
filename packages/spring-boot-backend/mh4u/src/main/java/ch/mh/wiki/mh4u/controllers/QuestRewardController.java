package ch.mh.wiki.mh4u.controllers;

import ch.mh.wiki.mh4u.models.Item;
import ch.mh.wiki.mh4u.models.QuestReward;
import ch.mh.wiki.mh4u.services.QuestRewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestRewardController {
    private final QuestRewardService service;

    @Autowired
    public QuestRewardController(QuestRewardService service) {
        this.service = service;
    }

    @GetMapping("/rewardsByQuest/{slot}/{id}")
    public Optional<List<QuestReward>> rewardsBySlotAndQuestId(@PathVariable String slot, @PathVariable int id) {
        return service.rewardsBySlotAndQuestId(slot, id);
    }

    @GetMapping("/rewardsByItem/{id}")
    public Optional<List<QuestReward>> rewardsBySlotAndQuestId(@PathVariable int id) {
        return service.rewardsByItemId(id);
    }
}
