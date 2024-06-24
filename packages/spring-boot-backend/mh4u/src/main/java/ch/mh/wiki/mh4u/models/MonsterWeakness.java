package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "monster_weakness")
public class MonsterWeakness {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "monster_id", referencedColumnName = "_id")
    private Monster monster;

    @Column(name = "state")
    private String state;

    @Column(name = "fire")
    private int fire;

    @Column(name = "water")
    private int water;

    @Column(name = "thunder")
    private int thunder;

    @Column(name = "ice")
    private int ice;

    @Column(name = "dragon")
    private int dragon;

    @Column(name = "poison")
    private int poison;

    @Column(name = "paralysis")
    private int paralysis;

    @Column(name = "sleep")
    private int sleep;

    @Column(name = "pitfall_trap")
    private int pitfallTrap;

    @Column(name = "shock_trap")
    private int shockTrap;

    @Column(name = "flash_bomb")
    private int flashBomb;

    @Column(name = "sonic_bomb")
    private int sonicBomb;

    @Column(name = "dung_bomb")
    private int dungBomb;

    @Column(name = "meat")
    private int meat;

    public MonsterWeakness(Monster monster, String state, int fire, int water, int thunder, int ice, int dragon, int poison, int paralysis, int sleep, int pitfallTrap, int shockTrap, int flashBomb, int sonicBomb, int dungBomb, int meat) {
        this.monster = monster;
        this.state = state;
        this.fire = fire;
        this.water = water;
        this.thunder = thunder;
        this.ice = ice;
        this.dragon = dragon;
        this.poison = poison;
        this.paralysis = paralysis;
        this.sleep = sleep;
        this.pitfallTrap = pitfallTrap;
        this.shockTrap = shockTrap;
        this.flashBomb = flashBomb;
        this.sonicBomb = sonicBomb;
        this.dungBomb = dungBomb;
        this.meat = meat;
    }

    public MonsterWeakness() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getThunder() {
        return thunder;
    }

    public void setThunder(int thunder) {
        this.thunder = thunder;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    public int getDragon() {
        return dragon;
    }

    public void setDragon(int dragon) {
        this.dragon = dragon;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    public int getParalysis() {
        return paralysis;
    }

    public void setParalysis(int paralysis) {
        this.paralysis = paralysis;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getPitfallTrap() {
        return pitfallTrap;
    }

    public void setPitfallTrap(int pitfallTrap) {
        this.pitfallTrap = pitfallTrap;
    }

    public int getShockTrap() {
        return shockTrap;
    }

    public void setShockTrap(int shockTrap) {
        this.shockTrap = shockTrap;
    }

    public int getFlashBomb() {
        return flashBomb;
    }

    public void setFlashBomb(int flashBomb) {
        this.flashBomb = flashBomb;
    }

    public int getSonicBomb() {
        return sonicBomb;
    }

    public void setSonicBomb(int sonicBomb) {
        this.sonicBomb = sonicBomb;
    }

    public int getDungBomb() {
        return dungBomb;
    }

    public void setDungBomb(int dungBomb) {
        this.dungBomb = dungBomb;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }
}