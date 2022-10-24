package br.com.lucasl36.abaku.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas Lopes
 */
public class Category {

    private BigInteger id;
    private String description;
    private User user;
    private LocalDateTime createdOn;
    
    public Category(){}

    public Category(BigInteger id, String description, User user, LocalDateTime createdOn) {
        this.id = id;
        this.description = description;
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
