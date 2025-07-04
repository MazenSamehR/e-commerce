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

2**Compile and run**:
```bash
mvn clean package
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