package org.example;

import java.util.List;

public class ShippingService {
    public static void shipItems(List<Shippable> items){
        System.out.println("\nShipping the following items:");
        for(Shippable item : items) {
            System.out.printf("- %s (%.2f kg)%n", item.getName(), item.getWeight());
        }
    }
}
