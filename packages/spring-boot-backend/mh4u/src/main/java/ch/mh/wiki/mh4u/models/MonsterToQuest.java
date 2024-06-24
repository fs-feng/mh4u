package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "monster_to_quest")
public class MonsterToQuest {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "monster_id")
    private Monster monster;

    @ManyToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;

    @Column(name = "unstable")
    private String unstable;

    public MonsterToQuest(Monster monster, Quest quest, String unstable) {
        this.monster = monster;
        this.quest = quest;
        this.unstable = unstable;
    }

    public MonsterToQuest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String getUnstable() {
        return unstable;
    }

    public void setUnstable(String unstable) {
        this.unstable = unstable;
    }
}