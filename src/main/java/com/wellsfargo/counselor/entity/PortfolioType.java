package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class PortfolioType {

    @Id
    @GeneratedValue()
    private long portfolioTypeId;

    @Column (nullable = false)
    private String type;

    @Column (nullable = false)
    private String description;

    protected PortfolioType() {

    }

    public PortfolioType(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public Long getPortfolioTypeId() { return portfolioTypeId; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
