package org.example;

public class Customer {
    private String name;
    private double balance;
    public Customer(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void reduceBalance(double amount) throws Exception{
        if(amount > balance){
            throw new Exception("Not enough balance");
        }
        balance -= amount;
    }
}
