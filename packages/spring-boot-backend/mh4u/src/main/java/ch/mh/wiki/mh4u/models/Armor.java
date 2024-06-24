package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "armor")
public class Armor {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "slot")
    private String slot;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "max_defense")
    private Integer maxDefense;

    @Column(name = "fire_res")
    private Integer fireRes;

    @Column(name = "thunder_res")
    private Integer thunderRes;

    @Column(name = "dragon_res")
    private Integer dragonRes;

    @Column(name = "water_res")
    private Integer waterRes;

    @Column(name = "ice_res")
    private Integer iceRes;

    @Column(name = "gender")
    private String gender;

    @Column(name = "hunter_type")
    private String hunterType;

    @Column(name = "num_slots")
    private Integer numSlots;

    @OneToOne
    @JoinColumn(name = "_id", referencedColumnName = "_id")
    private Item item;

    public Armor(String slot, Integer defense, Integer maxDefense, Integer fireRes, Integer thunderRes, Integer dragonRes, Integer waterRes, Integer iceRes, String gender, String hunterType, Integer numSlots, Item item) {
        this.slot = slot;
        this.defense = defense;
        this.maxDefense = maxDefense;
        this.fireRes = fireRes;
        this.thunderRes = thunderRes;
        this.dragonRes = dragonRes;
        this.waterRes = waterRes;
        this.iceRes = iceRes;
        this.gender = gender;
        this.hunterType = hunterType;
        this.numSlots = numSlots;
        this.item = item;
    }

    public Armor() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getMaxDefense() {
        return maxDefense;
    }

    public void setMaxDefense(Integer maxDefense) {
        this.maxDefense = maxDefense;
    }

    public Integer getFireRes() {
        return fireRes;
    }

    public void setFireRes(Integer fireRes) {
        this.fireRes = fireRes;
    }

    public Integer getThunderRes() {
        return thunderRes;
    }

    public void setThunderRes(Integer thunderRes) {
        this.thunderRes = thunderRes;
    }

    public Integer getDragonRes() {
        return dragonRes;
    }

    public void setDragonRes(Integer dragonRes) {
        this.dragonRes = dragonRes;
    }

    public Integer getWaterRes() {
        return waterRes;
    }

    public void setWaterRes(Integer waterRes) {
        this.waterRes = waterRes;
    }

    public Integer getIceRes() {
        return iceRes;
    }

    public void setIceRes(Integer iceRes) {
        this.iceRes = iceRes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHunterType() {
        return hunterType;
    }

    public void setHunterType(String hunterType) {
        this.hunterType = hunterType;
    }

    public Integer getNumSlots() {
        return numSlots;
    }

    public void setNumSlots(Integer numSlots) {
        this.numSlots = numSlots;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}