package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "combining")
public class Combining {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "created_item_id")
    private Item createdItem;

    @ManyToOne
    @JoinColumn(name = "item_1_id")
    private Item item1;

    @ManyToOne
    @JoinColumn(name = "item_2_id")
    private Item item2;

    @Column(name = "amount_made_min")
    private int amountMadeMin;

    @Column(name = "amount_made_max")
    private int amountMadeMax;

    @Column(name = "percentage")
    private int percentage;

    public Combining() {    }

    public Combining(Item createdItem, Item item1, Item item2, int amountMadeMin, int amountMadeMax, int percentage) {
        this.createdItem = createdItem;
        this.item1 = item1;
        this.item2 = item2;
        this.amountMadeMin = amountMadeMin;
        this.amountMadeMax = amountMadeMax;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getCreatedItem() {
        return createdItem;
    }

    public void setCreatedItem(Item createdItem) {
        this.createdItem = createdItem;
    }

    public Item getItem1() {
        return item1;
    }

    public void setItem1(Item item1) {
        this.item1 = item1;
    }

    public Item getItem2() {
        return item2;
    }

    public void setItem2(Item item2) {
        this.item2 = item2;
    }

    public int getAmountMadeMin() {
        return amountMadeMin;
    }

    public void setAmountMadeMin(int amountMadeMin) {
        this.amountMadeMin = amountMadeMin;
    }

    public int getAmountMadeMax() {
        return amountMadeMax;
    }

    public void setAmountMadeMax(int amountMadeMax) {
        this.amountMadeMax = amountMadeMax;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
