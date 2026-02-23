package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column
    private String name;

    @Column
    private String Category;

    @Column
    private double price;

    @Column
    private int quantity;

    @Column
    private String purchaseDate;

    protected Security() {}

    public Security(Portfolio portfolio, String name, String category, double price, int quantity, String purchaseDate) {
        this.portfolio = portfolio;
        this.name = name;
        this.Category = category;
        this.price = price;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    public long getSecurityId() { return securityId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return Category; }

    public void setCategory(String category) { this.Category = category; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate (String purchaseDate) { this.purchaseDate = purchaseDate; }

}
