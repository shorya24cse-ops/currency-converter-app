package com.example.currencyconverter;

public class CurrencyConverter {

    // Convert any currency to INR first
    private static double toINR(String from, double amount) {
        switch (from) {
            case "INR": return amount;
            case "USD": return amount * 83;
            case "EUR": return amount * 90;
            case "JPY": return amount * 0.55;
        }
        return 0;
    }

    // Convert INR to target currency
    private static double fromINR(String to, double amount) {
        switch (to) {
            case "INR": return amount;
            case "USD": return amount / 83;
            case "EUR": return amount / 90;
            case "JPY": return amount / 0.55;
        }
        return 0;
    }

    // Main conversion method
    public static double convert(String from, String to, double amount) {
        double inr = toINR(from, amount);
        return fromINR(to, inr);
    }
}