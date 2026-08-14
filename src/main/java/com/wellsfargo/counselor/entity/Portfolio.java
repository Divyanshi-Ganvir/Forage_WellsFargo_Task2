package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column (nullable = false)
    private String securities;

    @Column (nullable = false)
    private String type;

    protected Portfolio() {

    }

    public Portfolio(String name, String securities, String type) {
        this.name = name;
        this.securities = securities;
        this.type = type;
    }

    public long getPortfolioId() { return portfolioId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSecurities() { return securities; }

    public void setSecurities(String securities) { this.securities = securities; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
