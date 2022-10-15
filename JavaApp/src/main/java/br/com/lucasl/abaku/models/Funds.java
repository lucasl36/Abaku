package br.com.lucasl.abaku.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas Lopes
 */
public class Funds {
    
    private BigInteger id;
    private String description;
    private double value;
    private boolean negativeValue;
    private User user;
    private LocalDateTime createdOn;
    
    public Funds() {}

    public Funds(BigInteger id, String description, double value, boolean negativeValue, User user, LocalDateTime createdOn) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.negativeValue = negativeValue;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isNegativeValue() {
        return negativeValue;
    }

    public void setNegativeValue(boolean negativeValue) {
        this.negativeValue = negativeValue;
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
