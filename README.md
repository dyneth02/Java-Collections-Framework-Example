# 📚 Java Collection Framework & Generics Examples

This project was developed for the **SLIIT Object-Oriented Programming (OOP)** module to demonstrate the use of **Java Collections Framework** and **Generics**.  
It includes two mini applications: **BookApp (PriorityQueue)** and **InventoryApp (HashMap)**.

---

## 📚 Project Overview

This project showcases how to:
- Use **PriorityQueue** to manage book titles dynamically.
- Use **HashMap** to manage a product inventory with unique product codes.
- Apply **Generics** for type safety and clean object management.

---

## 🧩 Components

### **1️⃣ BookApp.java**
Implements a library management system using a **PriorityQueue**.

#### **Features**
- Accepts book titles until the user types `"done"`.
- Allows removing a specific book by title.
- Displays whether removal was successful or not.
- Counts and prints remaining books in alphabetical order.

#### **Core Concepts**
- PriorityQueue for sorted data storage.
- `Scanner` for input handling.
- Generics for type-safe collection operations.

---

### **2️⃣ InventoryApp.java**
Implements a simple inventory system using a **HashMap**.

#### **Features**
- Adds, updates, and removes products.
- Stores product details (code, name, quantity, price).
- Displays complete inventory after each operation.
- Automatically updates products if the code already exists.

#### **Core Concepts**
- HashMap for key-value storage.
- Object references as map values.
- Method-based CRUD operations.
- Iteration using enhanced for-loops.

---

### **3️⃣ Tool.java**
Helper class defining the product structure with:
- Product code (`String`)
- Product name (`String`)
- Quantity in stock (`int`)
- Price per unit (`double`)

Used as the value object in the inventory HashMap.

---

## ⚙️ How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/<your-username>/Java-Collections-Framework-Examples.git
   cd Java-Collections-Framework-Examples
