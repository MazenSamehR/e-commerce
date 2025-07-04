package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private Customer customer;
    private Map<Product,Integer> items = new HashMap<>();
    private List<Shippable> shippableItems = new ArrayList<>();

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addToCart(Product product, int quantity) throws Exception{
        if(product == null){
            throw new Exception("Product cannot be null");
        }
        if(quantity <= 0){
            throw new Exception("Quantity must be greater than zero");
        }
        if(product.isExpired()){
            throw new Exception(product.getName() + " is expired");
        }
        if(quantity > product.getQuantity()){
            throw new Exception("Not enough quantity for " + product.getName());
        }
        items.merge(product, quantity, Integer::sum);
        if(product.requiresShipping()){
            shippableItems.add((Shippable) product);
        }
    }

    public void checkout() throws Exception{
        if(items.isEmpty()){
            throw new Exception("Cart is empty");
        }
        for(Map.Entry<Product, Integer> entry : items.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if(product.isExpired()){
                throw new Exception(product.getName() + " is expired");
            }
            if(quantity > product.getQuantity()){
                throw new Exception("Not enough quantity for " + product.getName());
            }
        }

        double subtotal = 0.0;
        for(Map.Entry<Product,Integer>entry : items.entrySet()){
            subtotal += entry.getKey().getPrice() * entry.getValue();
        }
        double shippingFee = shippableItems.isEmpty() ? 0 : 30.0; // Assume Shipping fee is always 30
        double total = subtotal + shippingFee;
        /*
          Assume this won't fail and this is a transaction that won't get
          interrupted, so we don't need to handle transaction failure
         */
        customer.reduceBalance(total);
        for(Map.Entry<Product,Integer> entry : items.entrySet()){
            entry.getKey().reduceQuantity(entry.getValue());
        }

        System.out.println("** Checkout receipt **");
        for(Map.Entry<Product,Integer> entry : items.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%dx %s %.0f%n", quantity, product.getName(),product.getPrice() * quantity);
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal %.0f%n", subtotal);
        System.out.printf("Shipping %.0f%n", shippingFee);
        System.out.printf("Total %.0f%n", total);
        System.out.printf("Customer's new balance: %.0f%n", customer.getBalance());

        if(!shippableItems.isEmpty()) {
            ShippingService.shipItems(shippableItems);
        }

        items.clear();
        shippableItems.clear();
    }

    public int getItemCount() {
        return items.size();
    }
}
