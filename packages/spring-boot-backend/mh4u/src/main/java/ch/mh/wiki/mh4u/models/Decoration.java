package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "decorations")
public class Decoration {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "num_slots")
    private int numSlots;

    @OneToOne
    @JoinColumn(name = "_id", referencedColumnName = "_id")
    private Item item;

    public Decoration(int numSlots, Item item) {
        this.numSlots = numSlots;
        this.item = item;
    }

    public Decoration() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumSlots() {
        return numSlots;
    }

    public void setNumSlots(int numSlots) {
        this.numSlots = numSlots;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
