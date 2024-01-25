package com.mycompany.app.models;

public class Bill {

    private String productSummary;
    private double totalTaxAmount;
    private double totalPriceTTC;

    public Bill(String productSummary, double totalTaxAmount, double totalPriceTTC) {
        this.productSummary = productSummary;
        this.totalTaxAmount = totalTaxAmount;
        this.totalPriceTTC = totalPriceTTC;
    }

    public String getProductSummary() {
        return productSummary;
    }

    public void setProductSummary(String productSummary) {
        this.productSummary = productSummary;
    }

    public double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public double getTotalPriceTTC() {
        return totalPriceTTC;
    }

    public void setTotalPriceTTC(double totalPriceTTC) {
        this.totalPriceTTC = totalPriceTTC;
    }
}
