package br.com.lucasl.abaku.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas Lopes
 */
public class Tag {
    
    private BigInteger id;
    private String description;
    private User user;
    private LocalDateTime createOn;
    
    public Tag(){};

    public Tag(BigInteger id, String description, User user, LocalDateTime createOn) {
        this.id = id;
        this.description = description;
        this.user = user;
        this.createOn = createOn;
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

    public LocalDateTime getCreateOn() {
        return createOn;
    }

    public void setCreateOn(LocalDateTime createOn) {
        this.createOn = createOn;
    }
    
}
