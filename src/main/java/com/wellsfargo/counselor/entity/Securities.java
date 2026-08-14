package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Securities {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String category;

    @Column (nullable = false)
    private Date purchaseDate;

    @Column (nullable = false)
    private Float purchasePrice;

    @Column (nullable = false)
    private long quantity;

    protected Securities() {

    }

    public Securities(String name, String category, Date purchaseDate, Float purchasePrice, long quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public Date getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public Float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(Float purchasePrice) { this.purchasePrice = purchasePrice; }

    public long getQuantity() { return quantity; }

    public void setQuantity(long quantity) { this.quantity = quantity; }
}
