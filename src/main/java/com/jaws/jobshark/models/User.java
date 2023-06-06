package com.jaws.jobshark.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="email")
    private String email;
    @Column(name="display_name")
    private String display_name;
    @Column(name="location")
    private String location;
    @Column(name="industry")
    private String industry;


    public User(String email, String display_name, String location, String industry){
        this.email = email;
        this.display_name = display_name;
        this.location = location;
        this.industry = industry;
    }

    public User(){
    }

    public User(String jeremy) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}