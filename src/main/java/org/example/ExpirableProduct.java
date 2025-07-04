package org.example;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Shippable{
    private LocalDate expirationDate;
    private double weight;
    public ExpirableProduct(String name, double price, int quantity, LocalDate expirationDate, double weight) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    @Override
    public boolean isExpired(){
        return LocalDate.now().isAfter(expirationDate);
    }
    @Override
    public boolean requiresShipping() {
        return true; // Assuming all expirable products require shipping
    }
    @Override
    public double getWeight(){
        return weight;
    }
}
