package com.mycompany.app;

import com.mycompany.app.models.Bill;
import com.mycompany.app.models.Product;
import com.mycompany.app.utils.Utils;

import java.util.List;


public class App 
{

    static List<List<Product>> listOfProducts = List.of(ProductList.firstProductsList,ProductList.secondProductsList,ProductList.thirdProductsList);


    public static void main( String[] args )
    {
        printBill();
    }


    public static void printBill(){
        listOfProducts.forEach(products -> {

        Bill bill = new Bill("",0.00,0.00);
        products.forEach(product -> {
            int taxPercent = 0;
            if(!product.isFoodOrMedicinesOrBook()){
                taxPercent += 10;
            }
            if(product.isImported()){
                taxPercent += 5;
            }
            product.setTaxAmount(Utils.roundTo5Cents(Utils.formatTwoDigitsAfterComma(product.getPriceHT() * taxPercent / 100)));
            product.setPriceTTC(Utils.formatTwoDigitsAfterComma(Double.sum(product.getPriceHT(),product.getTaxAmount())*product.getNumber()));

            bill.setProductSummary(bill.getProductSummary() + " " + product.getNumber() + " " + product.getLabel() + " :" + product.getPriceTTC() );
            bill.setTotalTaxAmount(Double.sum(bill.getTotalTaxAmount(),product.getTaxAmount()));
            bill.setTotalPriceTTC(Double.sum(bill.getTotalPriceTTC(), product.getPriceTTC()));

        });

        System.out.print(bill.getProductSummary() + ",Montant des taxes "+ Utils.formatTwoDigitsAfterComma(bill.getTotalTaxAmount())+ " , Total: "+ Utils.formatTwoDigitsAfterComma(bill.getTotalPriceTTC()) + "\n");
        });
    }




}

