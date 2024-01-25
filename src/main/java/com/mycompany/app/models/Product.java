package com.mycompany.app.models;

public class Product {

    private  Integer number;
    private String label;
    private Double priceHT;
    private Double priceTTC;
    private Double taxAmount;
    private boolean isFoodOrMedicinesOrBook;
    private boolean isImported;


    public Product(Integer number, String label, Double priceHT, Double priceTTC, Double taxAmount,boolean isFoodOrMedicinesOrBook, boolean isImported) {
        this.number = number;
        this.label = label;
        this.priceHT = priceHT;
        this.priceTTC = priceTTC;
        this.taxAmount = taxAmount;
        this.isFoodOrMedicinesOrBook = isFoodOrMedicinesOrBook;
        this.isImported = isImported;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPriceHT() {
        return priceHT;
    }

    public void setPriceHT(Double priceHT) {
        this.priceHT = priceHT;
    }

    public Double getPriceTTC() {
        return priceTTC;
    }

    public void setPriceTTC(Double priceTTC) {
        this.priceTTC = priceTTC;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public boolean isFoodOrMedicinesOrBook() {
        return isFoodOrMedicinesOrBook;
    }

    public void setFoodOrMedicinesOrBook(boolean foodOrMedicinesOrBook) {
        isFoodOrMedicinesOrBook = foodOrMedicinesOrBook;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }
}
