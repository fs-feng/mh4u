package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.MonsterHabitat;
import ch.mh.wiki.mh4u.models.MonsterToQuest;
import ch.mh.wiki.mh4u.models.Quest;
import ch.mh.wiki.mh4u.repositories.MonsterHabitatRepository;
import ch.mh.wiki.mh4u.repositories.MonsterToQuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MonsterToQuestService {
    private final MonsterHabitatRepository monsterHabitatRepository;
    private final MonsterToQuestRepository monsterToQuestRepository;

    @Autowired
    public MonsterToQuestService(MonsterHabitatRepository monsterHabitatRepository, MonsterToQuestRepository monsterToQuestRepository) {
        this.monsterHabitatRepository = monsterHabitatRepository;
        this.monsterToQuestRepository = monsterToQuestRepository;
    }

    public List<MonsterHabitat> monsterHabitatByQuestId(int id) {
        Optional<List<MonsterToQuest>> quests = monsterToQuestRepository.findByQuestId(id);
        List<MonsterHabitat> monsters = new ArrayList<>();
        if (quests.isPresent()) {
            for (MonsterToQuest quest: quests.get()) {
                int monsterId = quest.getMonster().getId();
                int locationId = quest.getQuest().getLocation().getId();

                System.out.println("MonsterName: " + quest.getMonster().getName());
                MonsterHabitat monsterHabitat = monsterHabitatRepository.findByMonsterIdAndLocationId(monsterId, locationId);
                if (monsterHabitat != null) {
                    monsters.add(monsterHabitat);
                }
            }
        }

        return monsters;
    }

    public List<Quest> monsterQuestByMonsterId(int id) {
        Optional<List<MonsterToQuest>> monsterToQuests =  monsterToQuestRepository.findByMonsterId(id);
        List<Quest> quests = new ArrayList<Quest>();
        if (monsterToQuests.isPresent()) {
            for (MonsterToQuest monsterToQuest: monsterToQuests.get()) {
                quests.add(monsterToQuest.getQuest());
            }
        }
        return quests;
    }
}
