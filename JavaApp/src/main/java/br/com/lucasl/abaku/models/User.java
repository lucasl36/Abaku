package br.com.lucasl.abaku.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas Lopes
 */
public class User {
    
    private BigInteger id;
    private String name;
    private String email;
    private String login;
    private String password;
    private LocalDateTime createdOn;
    
    public User() {}

    public User(BigInteger id, String name, String email, String login, String password, LocalDateTime createdOn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
        this.createdOn = createdOn;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
    
}
