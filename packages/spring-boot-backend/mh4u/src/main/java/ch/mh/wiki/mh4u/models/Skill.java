package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "skill_tree_id")
    private SkillTree skillTree;

    @Column(name = "required_skill_tree_points")
    private int requiredSkillTreePoints;

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

    @Column(name = "description")
    private String description;

    @Column(name = "description_de")
    private String descriptionDe;

    @Column(name = "description_fr")
    private String descriptionFr;

    @Column(name = "description_es")
    private String descriptionEs;

    @Column(name = "description_it")
    private String descriptionIt;

    @Column(name = "description_jp")
    private String descriptionJp;

    public Skill(SkillTree skillTree, int requiredSkillTreePoints, String name, String nameDe, String nameFr, String nameEs, String nameIt, String nameJp, String description, String descriptionDe, String descriptionFr, String descriptionEs, String descriptionIt, String descriptionJp) {
        this.skillTree = skillTree;
        this.requiredSkillTreePoints = requiredSkillTreePoints;
        this.name = name;
        this.nameDe = nameDe;
        this.nameFr = nameFr;
        this.nameEs = nameEs;
        this.nameIt = nameIt;
        this.nameJp = nameJp;
        this.description = description;
        this.descriptionDe = descriptionDe;
        this.descriptionFr = descriptionFr;
        this.descriptionEs = descriptionEs;
        this.descriptionIt = descriptionIt;
        this.descriptionJp = descriptionJp;
    }

    public Skill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SkillTree getSkillTree() {
        return skillTree;
    }

    public void setSkillTree(SkillTree skillTree) {
        this.skillTree = skillTree;
    }

    public int getRequiredSkillTreePoints() {
        return requiredSkillTreePoints;
    }

    public void setRequiredSkillTreePoints(int requiredSkillTreePoints) {
        this.requiredSkillTreePoints = requiredSkillTreePoints;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionDe() {
        return descriptionDe;
    }

    public void setDescriptionDe(String descriptionDe) {
        this.descriptionDe = descriptionDe;
    }

    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public String getDescriptionEs() {
        return descriptionEs;
    }

    public void setDescriptionEs(String descriptionEs) {
        this.descriptionEs = descriptionEs;
    }

    public String getDescriptionIt() {
        return descriptionIt;
    }

    public void setDescriptionIt(String descriptionIt) {
        this.descriptionIt = descriptionIt;
    }

    public String getDescriptionJp() {
        return descriptionJp;
    }

    public void setDescriptionJp(String descriptionJp) {
        this.descriptionJp = descriptionJp;
    }
}