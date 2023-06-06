package com.jaws.jobshark.models;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="jobs")
public class Job {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn (name="user_id", nullable = false)
//    private User user;

    @Column(name = "reed_id")
    private Long reedId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name="employer_name")
    private String employerName;

    @Column(name="location")
    private String location;

    @Column(name="expiration_date")
    private LocalDateTime expirationDate;

    @Column(name="job_description")
    private String jobDescription;

    @Column(name="min_salary")
    private Integer MinSalary;

    @Column(name="max_salary")
    private Integer maxSalary;

    @Column(name="notes")
    private String notes;

    @Column(name="reed_url")
    private String reedUrl;

    @Column(name="enternal_url")
    private String external_url;

    @Column(name="part_time")
    private Boolean partTime;

    @Column(name="full_time")
    private Boolean fullTime;

    @Column(name="contract_type")
    private String contractType;

    @Column(name="application_count")
    private Integer applicationCount;


    public Job() {
    }

    public Job( Long reedId, String jobTitle, String employerName, String location, LocalDateTime expirationDate, String jobDescription, Integer minSalary, Integer maxSalary, String notes, String reedUrl, String external_url, Boolean partTime, Boolean fullTime, String contractType, Integer applicationCount) {
//        this.user = user;
        this.reedId = reedId;
        this.jobTitle = jobTitle;
        this.employerName = employerName;
        this.location = location;
        this.expirationDate = expirationDate;
        this.jobDescription = jobDescription;
        MinSalary = minSalary;
        this.maxSalary = maxSalary;
        this.notes = notes;
        this.reedUrl = reedUrl;
        this.external_url = external_url;
        this.partTime = partTime;
        this.fullTime = fullTime;
        this.contractType = contractType;
        this.applicationCount = applicationCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public Long getReedId() {
        return reedId;
    }

    public void setReedId(Long reedId) {
        this.reedId = reedId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationData) {
        this.expirationDate = expirationData;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDebscription) {
        this.jobDescription = jobDebscription;
    }

    public Integer getMinSalary() {
        return MinSalary;
    }

    public void setMinSalary(Integer minSalary) {
        MinSalary = minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getReedUrl() {
        return reedUrl;
    }

    public void setReedUrl(String reedUrl) {
        this.reedUrl = reedUrl;
    }

    public String getExternal_url() {
        return external_url;
    }

    public void setExternal_url(String external_url) {
        this.external_url = external_url;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Integer getApplicationCount() {
        return applicationCount;
    }

    public void setApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount;
    }
}


