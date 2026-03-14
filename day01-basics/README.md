# Java Basics – Day 1

## 1. Java Program Structure

Important rules for a basic Java program:

- Java code must be written **inside a class**
- The **filename must match the public class name**

Example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

File name must be:

```
Main.java
```

---

# 2. Entry Point of a Java Program

```java
public static void main(String[] args)
```

This is the **entry point** of every Java program.  
The **JVM (Java Virtual Machine)** starts execution from the `main()` method.

Breakdown:

| Keyword         | Meaning                            |
| --------------- | ---------------------------------- |
| `public`        | Accessible from anywhere           |
| `static`        | Can run without creating an object |
| `void`          | Does not return any value          |
| `main`          | Method name recognized by JVM      |
| `String[] args` | Command line arguments             |

---

# 3. How Java Code Runs

Java execution happens in **two steps**.

### Step 1 — Compile

```bash
javac Main.java
```

This generates:

```
Main.class
```

### Step 2 — Run

```bash
java Main
```

Execution flow:

```
Java Code (.java)
       ↓
Bytecode (.class)
       ↓
JVM executes the program
```

This design makes Java **platform independent**.

---

# 4. JRE vs JDK

## JRE (Java Runtime Environment)

JRE contains:

- JVM (Java Virtual Machine)
- Core libraries

Purpose:

```
Run compiled Java programs
```

Example:

```bash
java Main
```

If you already have a `.class` file, **JRE can run it**.

---

## JDK (Java Development Kit)

JDK contains:

- JRE
- `javac` compiler
- Development tools

Purpose:

```
Write + Compile + Run Java programs
```

Relationship:

```
JDK = JRE + Development Tools
```

---

# 5. Java Naming Conventions

Java follows standard naming rules.

| Type      | Convention | Example            |
| --------- | ---------- | ------------------ |
| Class     | PascalCase | `StudentDetails`   |
| Method    | camelCase  | `calculateMarks()` |
| Variables | camelCase  | `totalMarks`       |

Example:

```java
class StudentDetails {

    void calculateMarks() {

    }

}
```

That is why the entry method is:

```java
main()
```

and not `Main()` or `MAIN()`.

The JVM expects the exact signature:

```java
public static void main(String[] args)
```

---

# 6. print vs println

Java provides two common output methods.

## print()

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```
HelloWorld
```

---

## println()

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```
Hello
World
```

Explanation:

```
println → print + new line
```

`ln` stands for **line**.

---

# 7. Understanding System.out.println()

```java
System.out.println("Hello");
```

Breakdown:

| Part      | Meaning                 |
| --------- | ----------------------- |
| `System`  | Built-in Java class     |
| `out`     | Static output object    |
| `println` | Method that prints text |

So Java is effectively doing:

```
Call the println() method on the out object
```

This reflects Java’s **object-oriented design**, where behavior is accessed through objects.

# Extras: 
- Go to System class
- Use its static PrintStream object out
- Call println() method on it

```
One thing most beginners don't realize: 
- out is still an object.
- You just didn't create it. The System class already created it for you.

Internallay Something Like: 
class System {
    public static PrintStream out = new PrintStream();
}
```

---

# Key Takeaways

- Java programs must be written inside **classes**
- The **main() method** is the program entry point
- Java runs through **compilation → bytecode → JVM execution**
- **JDK is required for development**
- `println()` prints output with a **new line**
- Java follows strict **naming conventions**

---

# Next Topics

- Classes and Objects
- Constructors
- `this` keyword
- OOP principles
