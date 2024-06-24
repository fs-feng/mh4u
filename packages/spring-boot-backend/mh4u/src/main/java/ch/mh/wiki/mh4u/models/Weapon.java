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
    private Integer parentId;

    @Column(name = "wtype")
    private String wtype;

    @Column(name = "creation_cost")
    private Integer creationCost;

    @Column(name = "upgrade_cost")
    private Integer upgradeCost;

    @Column(name = "attack")
    private Integer attack;

    @Column(name = "max_attack")
    private Integer maxAttack;

    @Column(name = "element")
    private String element;

    @Column(name = "element_attack")
    private Integer elementAttack;

    @Column(name = "element_2")
    private String element2;

    @Column(name = "element_2_attack")
    private Integer element2Attack;

    @Column(name = "awaken")
    private String awaken;

    @Column(name = "awaken_attack")
    private Integer awakenAttack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "sharpness")
    private String sharpness;

    @Column(name = "affinity")
    private String affinity;

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
    private Integer numSlots;

    @Column(name = "tree_depth")
    private Integer treeDepth;

    @Column(name = "final")
    private Integer isFinal;

    @OneToOne
    @JoinColumn(name = "_id", referencedColumnName = "_id")
    private Item item;

    public Weapon(Integer parentId, String wtype, Integer creationCost, Integer upgradeCost, Integer attack, Integer maxAttack, String element, Integer elementAttack, String element2, Integer element2Attack, String awaken, Integer awakenAttack, Integer defense, String sharpness, String affinity, String hornNotes, String shellingType, String phial, String charges, String coatings, String recoil, String reloadSpeed, String rapidFire, String deviation, String ammo, String specialAmmo, Integer numSlots, Integer treeDepth, Integer isFinal) {
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype;
    }

    public Integer getCreationCost() {
        return creationCost;
    }

    public void setCreationCost(Integer creationCost) {
        this.creationCost = creationCost;
    }

    public Integer getUpgradeCost() {
        return upgradeCost;
    }

    public void setUpgradeCost(Integer upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(Integer maxAttack) {
        this.maxAttack = maxAttack;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Integer getElementAttack() {
        return elementAttack;
    }

    public void setElementAttack(Integer elementAttack) {
        this.elementAttack = elementAttack;
    }

    public String getElement2() {
        return element2;
    }

    public void setElement2(String element2) {
        this.element2 = element2;
    }

    public Integer getElement2Attack() {
        return element2Attack;
    }

    public void setElement2Attack(Integer element2Attack) {
        this.element2Attack = element2Attack;
    }

    public String getAwaken() {
        return awaken;
    }

    public void setAwaken(String awaken) {
        this.awaken = awaken;
    }

    public Integer getAwakenAttack() {
        return awakenAttack;
    }

    public void setAwakenAttack(Integer awakenAttack) {
        this.awakenAttack = awakenAttack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public String getSharpness() {
        return sharpness;
    }

    public void setSharpness(String sharpness) {
        this.sharpness = sharpness;
    }

    public String getAffinity() {
        return affinity;
    }

    public void setAffinity(String affinity) {
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

    public Integer getNumSlots() {
        return numSlots;
    }

    public void setNumSlots(Integer numSlots) {
        this.numSlots = numSlots;
    }

    public Integer getTreeDepth() {
        return treeDepth;
    }

    public void setTreeDepth(Integer treeDepth) {
        this.treeDepth = treeDepth;
    }

    public Integer getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Integer isFinal) {
        this.isFinal = isFinal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}