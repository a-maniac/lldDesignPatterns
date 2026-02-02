# 🍔 Builder Design Pattern — BurgerMeal (Java)

---

## 📌 Overview

This project demonstrates the **Builder Design Pattern** using a `BurgerMeal` example.  
The Builder Pattern is a **creational design pattern** that separates the **construction of a complex object** from its **final representation**.

Instead of creating an object using a large constructor with many parameters, the builder allows the object to be constructed **step-by-step** using a fluent and readable API, while ensuring the final object remains **immutable and consistent**.

---

## 🧠 Why This Pattern Exists

In real-world systems, domain objects often have:
- Mandatory fields (must be provided)
- Optional fields (can vary per use case)

Using traditional constructors leads to:
- Long parameter lists
- Poor readability
- Higher chance of passing values in the wrong order
- Invalid or partially constructed objects

### Example Without Builder
```java
BurgerMeal meal = new BurgerMeal("Sesame Bun", "Chicken Patty", true, "Fries");
```
---

This code does not clearly express:

What true means

Which value represents which field

Which fields are optional

---

### 🎯 Goals of This Implementation

This implementation aims to:

- Enforce required fields
- Allow optional fields to be configured flexibly
- Keep the final object immutable
- Improve code readability
- Make the system easy to extend

---

### Design Structure
Client
   |
   v
BurgerBuilder (Mutable, Step-by-step Construction)
   |
   v
BurgerMeal (Immutable, Final Product)
