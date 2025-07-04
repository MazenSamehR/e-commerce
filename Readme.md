# E-Commerce System

A Java console e-commerce system with product management, shopping cart, and checkout functionality.

## Features

- Product management (expirable/non-expirable/digital)
- Shopping cart with quantity validation
- Checkout process with receipt generation
- Shipping service integration
- Test suite

## Prerequisites

- JDK 17
- Maven 4.0.0
- IDE (IntelliJ recommended)


## Running the Application

1. **clone the repository and navigate to the project directory**
```bash
git clone https://github.com/MazenSamehR/e-commerce.git
```
```bash
cd e-commerce 
```

2. **Compile and run**:
```bash
mvn clean package
```
```bash
java -cp target\classes org.example.Main
```

3. **Run tests with Maven**:
```bash
mvn test
```
4. **Run with IDE**:
   - Right-click on src/test/java folder
   - Select `Run 'Tests in java'`
   - Or right-click individual test classes

## Dependencies
- JUnit 5.8.1 for testing

## Example
    cart.addToCart(cheese, 10);
    cart.addToCart(milk, 1);
    cart.addToCart(TV, 1);
    cart.addToCart(scratchCards, 5);
    cart.checkout();
    
    ----Consloe Output----
    ** Checkout receipt **
    10x cheese 60
    1x TV 500
    1x milk 3
    5x Mobile Scratch Cards 50
    ----------------------
    Subtotal 613
    Shipping 30
    Total 643
    Customer's new balance: 357
   
    Shipping the following items:
    - cheese (0.50 kg)
    - milk (1.00 kg)
    - TV (10.00 kg)
   
    Customer balance after payment: $120.00
