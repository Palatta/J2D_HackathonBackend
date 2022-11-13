package com.Jump2Digital.HackathonBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static java.lang.Integer.valueOf;

@Entity
@Table(name="companies")
public class Companies {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="website")
    private String website;

    @Column(name="name")
    private String name;

    @Column(name="founded")
    private Integer founded;

    @Column(name="size")
    private String size;

    @Column(name="locality")
    private String locality;

    @Column(name="region")
    private String region;

    @Column(name="country")
    private String country;

    @Column(name ="industry")
    private String industry;

    @Column(name="linkedin_url")
    private String linkedin_url;

    public Companies(){}
    public Companies(String id, String website, String name, Integer founded, String size, String locality, String region, String country, String industry, String linkedin_url) {
        setId(id);
        setWebsite(website);
        setName(name);
        setFounded(founded);
        setSize(size);
        setLocality(locality);
        setRegion(region);
        setCountry(country);
        setIndustry(industry);
        setLinkedin_url(linkedin_url);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFounded() {
        if (founded == 0) {
            founded = null;
        }
        return founded;
    }

    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }
}
