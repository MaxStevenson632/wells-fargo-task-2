package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String portfolioName;

    protected Portfolio() {}

    public Portfolio(Client client, String portfolioName) {
        this.client = client;
        this.portfolioName = portfolioName;
    }

    public long getPortfolioId() { return portfolioId; }

    public String getPortfolioName() { return portfolioName; }

    public void setPortfolioName(String portfolioName) { this.portfolioName = portfolioName; }
}
