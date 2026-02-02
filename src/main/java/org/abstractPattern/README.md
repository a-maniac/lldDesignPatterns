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
    %% Styling
    classDef client fill:#1f2933,stroke:#38bdf8,stroke-width:2px,color:#e5e7eb
    classDef factory fill:#111827,stroke:#a78bfa,stroke-width:2px,color:#e5e7eb
    classDef product fill:#020617,stroke:#34d399,stroke-width:2px,color:#e5e7eb

    %% Nodes
    Client["Client<br/>(Application)"]
    UIFactory["Abstract Factory<br/>(UIFactory)"]

    LightFactory["Concrete Factory<br/>(LightThemeFactory)"]
    DarkFactory["Concrete Factory<br/>(DarkThemeFactory)"]

    LB["LightButton"]
    LC["LightCheckbox"]

    DB["DarkButton"]
    DC["DarkCheckbox"]

    Button["Abstract Product<br/>(Button)"]
    Checkbox["Abstract Product<br/>(Checkbox)"]

    %% Flow
    Client --> UIFactory
    UIFactory --> LightFactory
    UIFactory --> DarkFactory

    LightFactory --> LB
    LightFactory --> LC

    DarkFactory --> DB
    DarkFactory --> DC

    LB --> Button
    DB --> Button

    LC --> Checkbox
    DC --> Checkbox

    %% Classes
    class Client client
    class UIFactory,LightFactory,DarkFactory factory
    class LB,LC,DB,DC,Button,Checkbox product
flowchart LR
    %% Styling
    classDef root fill:#020617,stroke:#fbbf24,stroke-width:2px,color:#e5e7eb
    classDef folder fill:#111827,stroke:#38bdf8,stroke-width:2px,color:#e5e7eb
    classDef file fill:#1f2933,stroke:#34d399,stroke-width:1.5px,color:#e5e7eb

    %% Nodes
    Root["abstract-factory/"]

    Factory["factory/"]
    Products["products/"]
    Client["client/"]
    Readme["README.md"]

    UIF["UIFactory.java"]
    LTF["LightThemeFactory.java"]
    DTF["DarkThemeFactory.java"]

    Btn["Button.java"]
    Cb["Checkbox.java"]
    LB["LightButton.java"]
    LC["LightCheckbox.java"]
    DB["DarkButton.java"]
    DC["DarkCheckbox.java"]

    App["Application.java"]
    Main["Main.java"]

    %% Flow
    Root --> Factory
    Root --> Products
    Root --> Client
    Root --> Readme

    Factory --> UIF
    Factory --> LTF
    Factory --> DTF

    Products --> Btn
    Products --> Cb
    Products --> LB
    Products --> LC
    Products --> DB
    Products --> DC

    Client --> App
    Client --> Main

    %% Classes
    class Root root
    class Factory,Products,Client folder
    class UIF,LTF,DTF,Btn,Cb,LB,LC,DB,DC,App,Main,Readme file

