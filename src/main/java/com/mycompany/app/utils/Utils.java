package com.mycompany.app.utils;

import java.text.DecimalFormat;

public class Utils {
    public static double roundTo5Cents(double amount) {
        return Math.ceil(amount / 0.05) * 0.05;
    }
    private static final DecimalFormat defector = new DecimalFormat("0.00");

    public static Double formatTwoDigitsAfterComma(Double d){
        return Double.parseDouble(defector.format(d));
    }
}
