package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "monster_habitat")
public class MonsterHabitat {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "monster_id", referencedColumnName = "_id")
    private Monster monster;

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "_id")
    private Location location;

    @Column(name = "start_area")
    private int startArea;

    @Column(name = "move_area")
    private String moveArea;

    @Column(name = "rest_area")
    private int restArea;

    public MonsterHabitat(Monster monster, Location location, int startArea, String moveArea, int restArea) {
        this.monster = monster;
        this.location = location;
        this.startArea = startArea;
        this.moveArea = moveArea;
        this.restArea = restArea;
    }

    public MonsterHabitat() {
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getStartArea() {
        return startArea;
    }

    public void setStartArea(int startArea) {
        this.startArea = startArea;
    }

    public String getMoveArea() {
        return moveArea;
    }

    public void setMoveArea(String moveArea) {
        this.moveArea = moveArea;
    }

    public int getRestArea() {
        return restArea;
    }

    public void setRestArea(int restArea) {
        this.restArea = restArea;
    }
}
