package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_de")
    private String nameDe;

    @Column(name = "name_fr")
    private String nameFr;

    @Column(name = "name_es")
    private String nameEs;

    @Column(name = "name_it")
    private String nameIt;

    @Column(name = "name_jp")
    private String nameJp;

     @Column(name = "type")
     private String type;

     @Column(name = "sub_type")
     private String subType;

     @Column(name = "rarity")
     private Integer rarity;

     @Column(name = "carry_capacity")
     private Integer carryCapacity;

     @Column(name = "buy")
     private Integer buy;

     @Column(name = "sell")
     private Integer sell;

     @Column(name = "description")
     private String description;

     @Column(name = "icon_name")
     private String iconName;

     @Column(name = "armor_dupe_name_fix")
     private String armorDupeNameFix;

    public Item() {    }

    public Item(String name, String nameDe, String nameFr, String nameEs, String nameIt, String nameJp, String type, String subType, Integer rarity, Integer carryCapacity, Integer buy, Integer sell, String description, String iconName, String armorDupeNameFix) {
        this.name = name;
        this.nameDe = nameDe;
        this.nameFr = nameFr;
        this.nameEs = nameEs;
        this.nameIt = nameIt;
        this.nameJp = nameJp;
        this.type = type;
        this.subType = subType;
        this.rarity = rarity;
        this.carryCapacity = carryCapacity;
        this.buy = buy;
        this.sell = sell;
        this.description = description;
        this.iconName = iconName;
        this.armorDupeNameFix = armorDupeNameFix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameEs() {
        return nameEs;
    }

    public void setNameEs(String nameEs) {
        this.nameEs = nameEs;
    }

    public String getNameIt() {
        return nameIt;
    }

    public void setNameIt(String nameIt) {
        this.nameIt = nameIt;
    }

    public String getNameJp() {
        return nameJp;
    }

    public void setNameJp(String nameJp) {
        this.nameJp = nameJp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Integer getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(Integer carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public Integer getBuy() {
        return buy;
    }

    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    public Integer getSell() {
        return sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getArmorDupeNameFix() {
        return armorDupeNameFix;
    }

    public void setArmorDupeNameFix(String armorDupeNameFix) {
        this.armorDupeNameFix = armorDupeNameFix;
    }
}
