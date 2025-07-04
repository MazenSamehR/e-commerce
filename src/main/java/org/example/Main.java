package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Mazen", 1000.0);
        Product cheese = new ExpirableProduct("cheese", 5.99, 10, LocalDate.now().plusDays(10), 0.5);
        Product milk = new ExpirableProduct("milk", 2.99, 5, LocalDate.now().plusDays(5), 1.0);
        Product TV = new NonExpirableProduct("TV", 500.0, 2, 10.0);
        Product scratchCards = new DigitalProduct("Mobile Scratch Cards", 10.0, 100);
        ShoppingCart cart = new ShoppingCart(customer);
        try{
            cart.addToCart(cheese, 10);
            cart.addToCart(milk, 1);
            cart.addToCart(TV, 1);
            cart.addToCart(scratchCards, 5);
            cart.checkout();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}