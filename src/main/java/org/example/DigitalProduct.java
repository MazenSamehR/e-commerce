package org.example;

public class DigitalProduct extends Product{
    public DigitalProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    @Override
    public boolean isExpired() {
        return false;
    }
    @Override
    public boolean requiresShipping() {
        return false;
    }
    @Override
    public double getWeight() throws Exception {
        throw new Exception("Digital products don't have weight");
    }
}
