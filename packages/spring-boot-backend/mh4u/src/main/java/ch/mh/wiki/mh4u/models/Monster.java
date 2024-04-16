package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "monsters")
public class Monster {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "class")
    private String monsterClass;

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

    @Column(name = "signature_move")
    private String signatureMove;

    @Column(name = "trait")
    private String trait;

    @Column(name = "icon_name")
    private String iconName;

    @Column(name = "sort_name")
    private String sortName;


    public Monster(String monsterClass, String name, String nameDe, String nameFr, String nameEs, String nameIt, String nameJp, String signatureMove, String trait, String iconName, String sortName) {
        this.monsterClass = monsterClass;
        this.name = name;
        this.nameDe = nameDe;
        this.nameFr = nameFr;
        this.nameEs = nameEs;
        this.nameIt = nameIt;
        this.nameJp = nameJp;
        this.signatureMove = signatureMove;
        this.trait = trait;
        this.iconName = iconName;
        this.sortName = sortName;
    }

    public Monster() {
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", monsterClass='" + monsterClass + '\'' +
                ", name='" + name + '\'' +
                ", nameDe='" + nameDe + '\'' +
                ", nameFr='" + nameFr + '\'' +
                ", nameEs='" + nameEs + '\'' +
                ", nameIt='" + nameIt + '\'' +
                ", nameJp='" + nameJp + '\'' +
                ", signatureMove='" + signatureMove + '\'' +
                ", trait='" + trait + '\'' +
                ", iconName='" + iconName + '\'' +
                ", sortName='" + sortName + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonsterClass() {
        return monsterClass;
    }

    public void setMonsterClass(String monsterClass) {
        this.monsterClass = monsterClass;
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

    public String getSignatureMove() {
        return signatureMove;
    }

    public void setSignatureMove(String signatureMove) {
        this.signatureMove = signatureMove;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
}
