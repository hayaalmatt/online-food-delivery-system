# Online Food Delivery System

## Overview

The Online Food Delivery System is a console-based Java application developed as a team project for SE 120 – Object-Oriented Programming I at Alfaisal University.

The application simulates an online food ordering process, allowing users to register or log in, browse restaurants and menus, add or remove items from their cart, calculate order totals, and complete a simulated checkout. It also includes credit card payment simulation, delivery time estimates, order status updates, and customer reviews.

The main objective was to apply object-oriented programming principles to a practical application while learning how to design, implement, and test a system consisting of multiple interacting classes.

## Features

- **User Authentication:** Simulated user registration and login.
- **Restaurant Browsing:** View available restaurants, addresses, and menu items.
- **Cart Management:** Add or remove items before checkout.
- **Order Processing:** Generate order IDs, manage order items, track order status, and calculate totals.
- **Checkout and Payments:** Simulate credit card payments and generate order receipts.
- **Delivery Information:** Select a delivery region and view estimated delivery times.
- **Customer Reviews:** Allow users to rate their ordering experience.

## Technologies and Concepts

- **Language:** Java
- **Interface:** Console-based
- **Object-Oriented Programming:** Classes, objects, interfaces, inheritance, encapsulation, abstraction, and method overriding
- **Data Structures:** ArrayLists
- **Java Libraries:** Scanner, Random, Date, and ArrayList

## My Contributions

My primary contributions to the team project included:

- Developed the console-based user interface and interactive ordering workflow.
- Collaborated on the `User` class, including user data management and login validation.
- Collaborated with teammates on the test program to exercise the system's classes and demonstrate its functionality.
- Worked with the team to integrate and test the application's components.

## Project Structure

The application consists of classes representing different parts of the food delivery process:

| Class | Responsibility |
|---|---|
| `Test` | Runs the application and demonstrates the ordering workflow |
| `IUser` | Defines the user authentication interface |
| `User` | Manages user information and login validation |
| `Restaurant` | Stores restaurant details and manages menus |
| `MenuItem` | Represents individual menu items and their prices |
| `Order` | Manages order items, status, and total calculation |
| `Payment` | Defines the abstract payment structure |
| `CreditCardPayment` | Simulates credit card payment processing |
| `DeliveryPerson` | Represents delivery personnel and supports order status updates |
| `Location` | Handles delivery region selection and estimated delivery times |
| `Review` | Handles customer ratings |

## Limitations

This project is an educational simulation. It does not connect to a real payment gateway, use live delivery tracking, or calculate delivery times using real-time location data.

## Learning Outcomes

Through this project, I gained practical experience in object-oriented software design, implementing classes and interfaces, managing relationships between objects, using Java collections, and integrating multiple components into a working console application.

---

**Course:** SE 120 – Object-Oriented Programming I  
**Institution:** Alfaisal University  
**Project Type:** Collaborative academic project
