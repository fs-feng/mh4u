package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "gathering")
public class Gathering {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "_id")
    private Location location;

    @Column(name = "area")
    private String area;

    @Column(name = "site")
    private String site;

    @Column(name = "rank")
    private String rank;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "percentage")
    private int percentage;

    public Gathering(Item item, Location location, String area, String site, String rank, int quantity, int percentage) {
        this.item = item;
        this.location = location;
        this.area = area;
        this.site = site;
        this.rank = rank;
        this.quantity = quantity;
        this.percentage = percentage;
    }

    public Gathering() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}