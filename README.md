# Ecommerce System Design

This document outlines the design of an ecommerce system with features for product management, cart operations, and checkout, handling product expiry, shipping, and customer balances.

## Features

* **Product Definition:**
    * Products have a name, price, and quantity.
    * Products can be categorized as perishable (with expiry dates) or non-perishable.
    * Products can be shippable (requiring weight information) or non-shippable.
* **Cart Management:**
    * Customers can add products to their cart with a specified quantity.
    * The system ensures that the added quantity does not exceed the available product quantity.
* **Checkout Process:**
    * Calculates the order subtotal.
    * Calculates shipping fees based on the weight of shippable items.
    * Calculates the total paid amount (subtotal + shipping fees).
    * Updates the customer's balance after payment.
    * Provides detailed checkout information in the console.
* **Error Handling:**
    * Handles empty cart errors.
    * Handles insufficient customer balance errors.
    * Handles out-of-stock or expired product errors.
