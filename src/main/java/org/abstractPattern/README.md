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

flowchart TD
    Client["Client<br/>(Application)"] --> UIFactory["Abstract Factory<br/>(UIFactory)"]

    UIFactory --> LightFactory["Concrete Factory<br/>(LightThemeFactory)"]
    UIFactory --> DarkFactory["Concrete Factory<br/>(DarkThemeFactory)"]

    LightFactory --> LB["LightButton"]
    LightFactory --> LC["LightCheckbox"]

    DarkFactory --> DB["DarkButton"]
    DarkFactory --> DC["DarkCheckbox"]

    LB --> Button["Abstract Product<br/>(Button)"]
    DB --> Button

    LC --> Checkbox["Abstract Product<br/>(Checkbox)"]
    DC --> Checkbox
flowchart LR
    Root["abstract-factory/"]

    Root --> Factory["factory/"]
    Root --> Products["products/"]
    Root --> Client["client/"]
    Root --> Readme["README.md"]

    Factory --> UIF["UIFactory.java"]
    Factory --> LTF["LightThemeFactory.java"]
    Factory --> DTF["DarkThemeFactory.java"]

    Products --> Btn["Button.java"]
    Products --> Cb["Checkbox.java"]
    Products --> LB["LightButton.java"]
    Products --> LC["LightCheckbox.java"]
    Products --> DB["DarkButton.java"]
    Products --> DC["DarkCheckbox.java"]

    Client --> App["Application.java"]
    Client --> Main["Main.java"]
