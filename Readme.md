# E-Commerce System (JDK 17)

A Java e-commerce system with product management, shopping cart, and checkout functionality.

## Features

- Product management (expirable/non-expirable/digital)
- Shopping cart with quantity validation
- Checkout process with receipt generation
- Shipping service integration
- test suite

## Prerequisites

- JDK 17
- Maven 4.0.0
- IDE (IntelliJ recommended)


## Running the Application

1. **Compile and run**:
```bash
mvn clean package
java -cp target\classes org.example.Main
```

2. **Run tests with Maven**:
```bash
mvn test
```
3. **Run with IDE**:
   - Right-click on src/test/java folder
   - Select `Run 'Tests in java'`
   - Or right-click individual test classes

## Dependencies
- JUnit 5.8.1 for testing