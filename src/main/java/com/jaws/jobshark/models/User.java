package com.jaws.jobshark.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties({"user"})
    private List<Job> jobs;
    @Column(name="sub")
    private String sub;



    public User(String email, String display_name, String location, String industry, String sub){
        this.email = email;
        this.display_name = display_name;
        this.location = location;
        this.industry = industry;
        this.jobs = new ArrayList<>();
        this.sub = sub;
    }

    public User(){
    }

    public List<Job> getJobs() {
        return this.jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public void addJob(Job job){
        this.jobs.add(job);
    }

    public void removeJob(Job job){
        this.jobs.remove(job);
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

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
}