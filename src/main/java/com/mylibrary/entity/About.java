package com.mylibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // Languages, Education, Projects
    private String description;

    private String icon1;
    private String icon2;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getIcon1() { return icon1; }
    public void setIcon1(String icon1) { this.icon1 = icon1; }

    public String getIcon2() { return icon2; }
    public void setIcon2(String icon2) { this.icon2 = icon2; }
}
