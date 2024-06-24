package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "monster_ailment")
public class MonsterAilment {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "monster_id", referencedColumnName = "_id")
    private Monster monster;

    @Column(name = "ailment")
    private String ailment;

    public MonsterAilment(Monster monster, String ailment) {
        this.monster = monster;
        this.ailment = ailment;
    }

    public MonsterAilment() {
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

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }
}