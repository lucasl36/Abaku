package br.com.lucasl36.abaku.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas Lopes
 */
public class Credit {
    
    private BigInteger id;
    private String description;
    private double limit;
    private int closingDay;
    private int expiringDay;
    private boolean prepaid;
    private User user;
    private LocalDateTime createdOn;
    
    public Credit(){}

    public Credit(BigInteger id, String description, Double limit, int closingDay, int expiringDay, boolean prepaid, User user, LocalDateTime createdOn) {
        this.id = id;
        this.description = description;
        this.limit = limit;
        this.closingDay = closingDay;
        this.expiringDay = expiringDay;
        this.prepaid = prepaid;
        this.user = user;
        this.createdOn = createdOn;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public int getClosingDay() {
        return closingDay;
    }

    public void setClosingDay(int closingDay) {
        this.closingDay = closingDay;
    }

    public int getExpiringDay() {
        return expiringDay;
    }

    public void setExpiringDay(int expiringDay) {
        this.expiringDay = expiringDay;
    }

    public boolean isPrepaid() {
        return prepaid;
    }

    public void setPrepaid(boolean prepaid) {
        this.prepaid = prepaid;
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
