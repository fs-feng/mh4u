package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "weapons")
public class Weapon {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "wtype")
    private String wtype;

    @Column(name = "creation_cost")
    private int creationCost;

    @Column(name = "upgrade_cost")
    private int upgradeCost;

    @Column(name = "attack")
    private int attack;

    @Column(name = "max_attack")
    private int maxAttack;

    @Column(name = "element")
    private String element;

    @Column(name = "element_attack")
    private int elementAttack;

    @Column(name = "element_2")
    private String element2;

    @Column(name = "element_2_attack")
    private int element2Attack;

    @Column(name = "awaken")
    private String awaken;

    @Column(name = "awaken_attack")
    private int awakenAttack;

    @Column(name = "defense")
    private int defense;

    @Column(name = "sharpness")
    private String sharpness;

    @Column(name = "affinity")
    private int affinity;

    @Column(name = "horn_notes")
    private String hornNotes;

    @Column(name = "shelling_type")
    private String shellingType;

    @Column(name = "phial")
    private String phial;

    @Column(name = "charges")
    private String charges;

    @Column(name = "coatings")
    private String coatings;

    @Column(name = "recoil")
    private String recoil;

    @Column(name = "reload_speed")
    private String reloadSpeed;

    @Column(name = "rapid_fire")
    private String rapidFire;

    @Column(name = "deviation")
    private String deviation;

    @Column(name = "ammo")
    private String ammo;

    @Column(name = "special_ammo")
    private String specialAmmo;

    @Column(name = "num_slots")
    private int numSlots;

    @Column(name = "tree_depth")
    private int treeDepth;

    @Column(name = "final")
    private Boolean isFinal;

    public Weapon(int parentId, String wtype, int creationCost, int upgradeCost, int attack, int maxAttack, String element, int elementAttack, String element2, int element2Attack, String awaken, int awakenAttack, int defense, String sharpness, int affinity, String hornNotes, String shellingType, String phial, String charges, String coatings, String recoil, String reloadSpeed, String rapidFire, String deviation, String ammo, String specialAmmo, int numSlots, int treeDepth, Boolean isFinal) {
        this.parentId = parentId;
        this.wtype = wtype;
        this.creationCost = creationCost;
        this.upgradeCost = upgradeCost;
        this.attack = attack;
        this.maxAttack = maxAttack;
        this.element = element;
        this.elementAttack = elementAttack;
        this.element2 = element2;
        this.element2Attack = element2Attack;
        this.awaken = awaken;
        this.awakenAttack = awakenAttack;
        this.defense = defense;
        this.sharpness = sharpness;
        this.affinity = affinity;
        this.hornNotes = hornNotes;
        this.shellingType = shellingType;
        this.phial = phial;
        this.charges = charges;
        this.coatings = coatings;
        this.recoil = recoil;
        this.reloadSpeed = reloadSpeed;
        this.rapidFire = rapidFire;
        this.deviation = deviation;
        this.ammo = ammo;
        this.specialAmmo = specialAmmo;
        this.numSlots = numSlots;
        this.treeDepth = treeDepth;
        this.isFinal = isFinal;
    }

    public Weapon() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype;
    }

    public int getCreationCost() {
        return creationCost;
    }

    public void setCreationCost(int creationCost) {
        this.creationCost = creationCost;
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public void setUpgradeCost(int upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getElementAttack() {
        return elementAttack;
    }

    public void setElementAttack(int elementAttack) {
        this.elementAttack = elementAttack;
    }

    public String getElement2() {
        return element2;
    }

    public void setElement2(String element2) {
        this.element2 = element2;
    }

    public int getElement2Attack() {
        return element2Attack;
    }

    public void setElement2Attack(int element2Attack) {
        this.element2Attack = element2Attack;
    }

    public String getAwaken() {
        return awaken;
    }

    public void setAwaken(String awaken) {
        this.awaken = awaken;
    }

    public int getAwakenAttack() {
        return awakenAttack;
    }

    public void setAwakenAttack(int awakenAttack) {
        this.awakenAttack = awakenAttack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getSharpness() {
        return sharpness;
    }

    public void setSharpness(String sharpness) {
        this.sharpness = sharpness;
    }

    public int getAffinity() {
        return affinity;
    }

    public void setAffinity(int affinity) {
        this.affinity = affinity;
    }

    public String getHornNotes() {
        return hornNotes;
    }

    public void setHornNotes(String hornNotes) {
        this.hornNotes = hornNotes;
    }

    public String getShellingType() {
        return shellingType;
    }

    public void setShellingType(String shellingType) {
        this.shellingType = shellingType;
    }

    public String getPhial() {
        return phial;
    }

    public void setPhial(String phial) {
        this.phial = phial;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getCoatings() {
        return coatings;
    }

    public void setCoatings(String coatings) {
        this.coatings = coatings;
    }

    public String getRecoil() {
        return recoil;
    }

    public void setRecoil(String recoil) {
        this.recoil = recoil;
    }

    public String getReloadSpeed() {
        return reloadSpeed;
    }

    public void setReloadSpeed(String reloadSpeed) {
        this.reloadSpeed = reloadSpeed;
    }

    public String getRapidFire() {
        return rapidFire;
    }

    public void setRapidFire(String rapidFire) {
        this.rapidFire = rapidFire;
    }

    public String getDeviation() {
        return deviation;
    }

    public void setDeviation(String deviation) {
        this.deviation = deviation;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getSpecialAmmo() {
        return specialAmmo;
    }

    public void setSpecialAmmo(String specialAmmo) {
        this.specialAmmo = specialAmmo;
    }

    public int getNumSlots() {
        return numSlots;
    }

    public void setNumSlots(int numSlots) {
        this.numSlots = numSlots;
    }

    public int getTreeDepth() {
        return treeDepth;
    }

    public void setTreeDepth(int treeDepth) {
        this.treeDepth = treeDepth;
    }

    public Boolean getFinal() {
        return isFinal;
    }

    public void setFinal(Boolean aFinal) {
        isFinal = aFinal;
    }
}