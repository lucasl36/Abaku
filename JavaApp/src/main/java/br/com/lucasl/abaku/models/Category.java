package br.com.lucasl.abaku.models;

import java.math.BigInteger;

/**
 *
 * @author Lucas Lopes
 */
public class Category {

    private BigInteger id;
    private String description;
    private User user;

    public Category(){}
    
    public Category(BigInteger id, String description, User user) {
        this.id = id;
        this.description = description;
        this.user = user;
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
    
}
