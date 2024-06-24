package ch.mh.wiki.mh4u.models;

import jakarta.persistence.*;

@Entity
@Table(name = "quests")
public class Quest {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "goal")
    private String goal;

    @Column(name = "hub")
    private String hub;

    @Column(name = "type")
    private String type;

    @Column(name = "stars")
    private Integer stars;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "time_limit")
    private Integer timeLimit;

    @Column(name = "fee")
    private Integer fee;

    @Column(name = "reward")
    private Integer reward;

    @Column(name = "hrp")
    private Integer hrp;

    @Column(name = "sub_goal")
    private String subGoal;

    @Column(name = "sub_reward")
    private Integer subReward;

    @Column(name = "sub_hrp")
    private Integer subHrp;

    public Quest(String name, String goal, String hub, String type, int stars, Location location, int timeLimit, int fee, int reward, int hrp, String subGoal, int subReward, int subHrp) {
        this.name = name;
        this.goal = goal;
        this.hub = hub;
        this.type = type;
        this.stars = stars;
        this.location = location;
        this.timeLimit = timeLimit;
        this.fee = fee;
        this.reward = reward;
        this.hrp = hrp;
        this.subGoal = subGoal;
        this.subReward = subReward;
        this.subHrp = subHrp;
    }

    public Quest() {
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

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getHub() {
        return hub;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Integer getHrp() {
        return hrp;
    }

    public void setHrp(Integer hrp) {
        this.hrp = hrp;
    }

    public String getSubGoal() {
        return subGoal;
    }

    public void setSubGoal(String subGoal) {
        this.subGoal = subGoal;
    }

    public Integer getSubReward() {
        return subReward;
    }

    public void setSubReward(Integer subReward) {
        this.subReward = subReward;
    }

    public Integer getSubHrp() {
        return subHrp;
    }

    public void setSubHrp(Integer subHrp) {
        this.subHrp = subHrp;
    }
}
