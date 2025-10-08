# Java Learning Projects 🚀

Welcome to my Java learning journey! This repository contains hands-on code snippets, mini-projects, and experiments I've built while mastering Java fundamentals.

## 📚 Topics Covered
- ✅ Object-Oriented Programming (OOP)
- ✅ Constructors and Instance Variables
- ✅ Method Overriding (`toString`)
- ✅ Multithreading and Synchronization
- ✅ File Structure and Compilation
- 

## 🧠 Why This Repo?
I believe in learning by doing. Each file here reflects a concept I explored, debugged, and understood deeply. It's not just code—it's growth.

# Java Multithreading Example: `Mult2.java`

This project showcases a basic implementation of **multithreading in Java** using the `Thread` class. It demonstrates how two threads can execute concurrently, each performing a different task based on its assigned name.

## 🚀 What It Does

- Creates two threads from the same class `A`.
- Assigns each thread a unique name:
  - `"printNu"` prints numbers from 1 to 20.
  - `"printCh"` prints uppercase letters from A to Z.
- Starts both threads simultaneously to illustrate concurrent execution.

## 🧠 Key Concepts Demonstrated

- Thread creation using `extends Thread`
- Overriding the `run()` method
- Using `Thread.currentThread().getName()` to control thread behavior
- Basic loop-based output for characters and numbers
- Concurrent execution and interleaving of outputs
- 
# Java Multithreading Examples
## 1️⃣ Multi-threading with Runnable (`Multi_thread.java`)
### 🔍 Overview
This program demonstrates how to create and run multiple threads using the `Runnable` interface.
### 🧠 Key Concepts
- Implementing `Runnable` instead of extending `Thread`
- Creating threads with `new Thread(Runnable)`
- Concurrent execution of two tasks:
  - Class `A` is intended to print characters A–Z (though currently missing `System.out.println(b);`)
  - Class `B` prints numbers 1–20
## 2️⃣ Producer-Consumer Model (Producer_Consumer.java)
🔍 Overview
This program simulates a basic Producer-Consumer scenario using shared data between two threads.
🧠 Key Concepts
- Thread communication via shared object (Product)
- Producer thread generates data and stores it
- Consumer thread retrieves and prints the data
- No synchronization used — good for understanding race conditions and the need for thread-safe operations


