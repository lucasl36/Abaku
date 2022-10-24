package br.com.lucasl36.abaku.models;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class Movement {

    private BigInteger id;
    private String motive;
    private double value;
    private LocalDate date;
    private Category category;
    private List<Tag> tags;
    private List<Movement> relatedMovements;
    private Funds fund;
    private Credit credit;
    private User user;
    private LocalDateTime createdOn;
        
    public Movement(){}

    public Movement(BigInteger id, String motive, double value, LocalDate date, Category category, List<Tag> tags, List<Movement> relatedMovements, Funds fund, Credit credit, User user, LocalDateTime createdOn) {
        this.id = id;
        this.motive = motive;
        this.value = value;
        this.date = date;
        this.category = category;
        this.tags = tags;
        this.relatedMovements = relatedMovements;
        this.fund = fund;
        this.credit = credit;
        this.user = user;
        this.createdOn = createdOn;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Movement> getRelatedMovements() {
        return relatedMovements;
    }

    public void setRelatedMovements(List<Movement> relatedMovements) {
        this.relatedMovements = relatedMovements;
    }

    public Funds getFund() {
        return fund;
    }

    public void setFund(Funds fund) {
        this.fund = fund;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
    
}
