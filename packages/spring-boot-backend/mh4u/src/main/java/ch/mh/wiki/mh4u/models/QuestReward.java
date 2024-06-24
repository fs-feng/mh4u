package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "quest_rewards")
public class QuestReward {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "reward_slot")
    private String rewardSlot;

    @Column(name = "percentage")
    private Integer percentage;

    @Column(name = "stack_size")
    private Integer stackSize;

    public QuestReward() {    }

    public QuestReward(Quest quest, Item item, String rewardSlot, Integer percentage, Integer stackSize) {
        this.quest = quest;
        this.item = item;
        this.rewardSlot = rewardSlot;
        this.percentage = percentage;
        this.stackSize = stackSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getRewardSlot() {
        return rewardSlot;
    }

    public void setRewardSlot(String rewardSlot) {
        this.rewardSlot = rewardSlot;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Integer getStackSize() {
        return stackSize;
    }

    public void setStackSize(Integer stackSize) {
        this.stackSize = stackSize;
    }
}