# ☕ Day 2 – Object Oriented Programming (OOP) in Java

This document covers **OOP from basics to interview depth**, including concepts, edge cases, and commonly asked questions.

---

# 📌 What is OOP?

Object-Oriented Programming is a paradigm where:

> Data and behavior are bundled together into objects.

Instead of writing functions separately, we model real-world entities using **classes and objects**.

---

# 🧱 Core Concepts of OOP

1. Encapsulation  
2. Inheritance  
3. Polymorphism  
4. Abstraction  

---

# 1️⃣ Class & Object

## Class

A class is a **blueprint**.

```java
class Car {
    String brand;
    int price;
}
```

---

## Object

An object is an **instance of a class**.

```java
Car c = new Car();
c.brand = "BMW";
```

---

## Key Points

- Class → logical structure  
- Object → physical instance  
- Memory is allocated when object is created  

---

# 2️⃣ Encapsulation

## Definition (Interview-ready)

> Encapsulation is the process of restricting direct access to data and allowing controlled access through methods.

---

## Example

```java
class Car {
    private int price;

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }
}
```

---

## Why Encapsulation?

- Prevent invalid state  
- Add validation  
- Improve maintainability  
- Hide internal implementation  

---

## Interview Tip

❌ Weak answer: “Data hiding”  
✅ Strong answer:

> “Encapsulation ensures controlled access and maintains data integrity by enforcing validation rules.”

---

# 3️⃣ Inheritance

## Definition

> Mechanism where one class acquires properties and behavior of another class.

---

## Example

```java
class Car {
    void start() {
        System.out.println("Car starts");
    }
}

class ElectricCar extends Car {
}
```

---

## Types of Inheritance

- Single  
- Multilevel  
- Hierarchical  

(Java does NOT support multiple inheritance with classes)

---

## IS-A Relationship

```
ElectricCar IS-A Car
```

---

# 4️⃣ Polymorphism

## Definition

> Ability of an object to take multiple forms.

---

## Types

### Compile-time (Method Overloading)

```java
int add(int a, int b) {}
int add(int a, int b, int c) {}
```

---

### Runtime (Method Overriding)

```java
class Car {
    void start() {
        System.out.println("Car starts");
    }
}

class ElectricCar extends Car {
    void start() {
        System.out.println("Electric start");
    }
}
```

---

## Runtime Polymorphism (Important)

```java
Car c = new ElectricCar();
c.start();
```

Output:

```
Electric start
```

---

## Key Rule

> Method call depends on **object type**, not reference type.

---

# 5️⃣ Abstraction

## Definition

> Hiding implementation details and showing only essential features.

---

## Using Abstract Class

```java
abstract class Car {
    abstract void start();
}
```

---

## Using Interface

```java
interface Vehicle {
    void start();
}
```

---

## Difference (Important)

| Feature | Abstract Class | Interface |
|--------|--------|--------|
| Methods | Can have both | Only abstract (mostly) |
| Variables | Allowed | Public static final |
| Inheritance | Single | Multiple |

---

# 🔁 Method Overloading vs Overriding

| Feature | Overloading | Overriding |
|--------|--------|--------|
| Same method name | Yes | Yes |
| Parameters | Different | Same |
| Runtime/Compile | Compile-time | Runtime |

---

# ⚠️ Important Confusions

## 1. Method vs Variable Binding

```java
class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}
```

```java
A obj = new B();
System.out.println(obj.x); // 10
```

👉 Variables → reference type  
👉 Methods → object type  

---

## 2. Can we override static methods?

❌ No (they are hidden, not overridden)

---

## 3. Can constructors be overridden?

❌ No (constructors are not inherited)

---

## 4. Why `super()` is used?

To call parent constructor.

---

# 🔥 Interview-Level Questions

### Q1: Why Java does not support multiple inheritance?

> To avoid ambiguity (Diamond Problem)

---

### Q2: What is runtime polymorphism?

> Method call resolved at runtime based on actual object.

---

### Q3: Difference between interface and abstract class?

(Explain with use cases, not just table)

---

### Q4: What is method overriding?

> Redefining parent method in child class with same signature.

---

### Q5: Why use encapsulation?

> To maintain valid state and control access.

---

# 🧠 Tricky Questions

### 1.

```java
Car c = new ElectricCar();
```

Can we access child-specific methods?

❌ No (reference type restricts access)

---

### 2.

```java
ElectricCar e = (ElectricCar) new Car();
```

❌ Runtime error (ClassCastException)

---

### 3.

Can we have multiple interfaces?

✅ Yes

---

### 4.

Can interface have methods with body?

✅ Yes (default & static methods)

---

# 🧩 Best Practices

- Keep variables `private`
- Expose behavior, not data
- Prefer composition over inheritance (advanced concept)
- Use meaningful method names

---

# 🚫 Common Mistakes

- Public variables everywhere  
- No validation in setters  
- Misusing inheritance  
- Confusing overloading vs overriding  

---

# 🎯 Final Takeaways

- OOP is about **design, not syntax**
- Encapsulation = control  
- Inheritance = reuse  
- Polymorphism = flexibility  
- Abstraction = simplicity  

---

# 🚀 What Matters for Interviews

Focus on:

- Explaining concepts clearly  
- Writing clean class design  
- Understanding runtime behavior  
- Avoiding textbook definitions  

---

# 📌 Summary in One Line

> OOP helps build scalable and maintainable systems by combining data and behavior into structured objects.
