# Strategy Design Pattern - Java Implementation

## 📌 Overview
The Strategy Design Pattern is a **behavioral design pattern** that allows you to define a family of algorithms, encapsulate each one into a separate class, and make them interchangeable at runtime.

This pattern lets the algorithm vary independently from the clients that use it.

---

## 🎯 Problem Statement
In traditional programming, we often use multiple `if-else` or `switch` statements to choose between different behaviors.

Example:
```java
if(paymentType.equals("CREDIT")) {
    payWithCreditCard();
} else if(paymentType.equals("UPI")) {
    payWithUPI();
}
```
This approach:

1. Is hard to maintain 
2. Violates Open/Closed Principle 
3. Becomes messy as new behaviors are added
---
✅ Solution

The Strategy Pattern solves this by:

- Defining a common interface 
- Creating separate classes for each behavior 
- Letting the client choose the behavior at runtime
---

## 🏗️ Design Structure
```dtd

Client
|
Context (PaymentContext)
|
Strategy Interface (PaymentStrategy)
|
-------------------------
|         |           |
UPI   CreditCard   Other Strategies

```
