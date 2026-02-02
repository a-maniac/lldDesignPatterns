# 🏭 Abstract Factory Design Pattern (Java)

## 📌 Overview

The **Abstract Factory Design Pattern** is a **creational design pattern** that provides an interface for creating **families of related or dependent objects** without specifying their concrete classes.

Instead of instantiating objects directly using `new`, the client interacts with a **factory interface**, which returns related objects from a specific "family" (or theme). This ensures **consistency, scalability, and loose coupling**.

---

## 🎯 Problem Statement

In many real-world systems, you need to create multiple objects that must work **together as a group**.

### Example Use Case:
A UI system that supports multiple themes:
- Light Theme
- Dark Theme

Each theme must provide:
- A `Button`
- A `Checkbox`

### Without Abstract Factory:
You might accidentally create:
- Light Button ❌
- Dark Checkbox ❌

This leads to **inconsistent UI behavior and broken design rules**.

---

## 🧠 Solution

Abstract Factory introduces:
- A **common factory interface** that defines methods to create each type of product
- **Concrete factory implementations** that create a specific family of products
- The **client depends only on interfaces**, not on concrete classes

This allows the system to:
- Switch entire product families at runtime
- Enforce consistency across related objects
- Follow SOLID design principles

---

## 🏗️ Design Structure

