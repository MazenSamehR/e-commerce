package org.example;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int amount) throws Exception{
        if(amount > quantity){
            throw new Exception("Not enough quantity available for " + name);
        }
        quantity -= amount;
    }

    public abstract boolean isExpired();
    public abstract boolean requiresShipping();
    public abstract double getWeight() throws Exception;

}
