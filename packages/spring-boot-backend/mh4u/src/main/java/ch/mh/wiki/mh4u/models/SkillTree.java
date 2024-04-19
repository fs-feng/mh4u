package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "skill_trees")
public class SkillTree {
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

    public SkillTree(String name, String nameDe, String nameFr, String nameEs, String nameIt, String nameJp) {
        this.name = name;
        this.nameDe = nameDe;
        this.nameFr = nameFr;
        this.nameEs = nameEs;
        this.nameIt = nameIt;
        this.nameJp = nameJp;
    }

    public SkillTree() {
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
}
