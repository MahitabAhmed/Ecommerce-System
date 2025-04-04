package fawryecommercesystem;
import java.util.*;

public class FawryEcommerceSystem {

    public static void main(String[] args) {

        Date expiryDate = new GregorianCalendar(2025, Calendar.JUNE, 1).getTime();
        Product cheese = new ShippableExpiringProduct(200.0, expiryDate, "Cheese", 5.99, 10);
        Product biscuits = new ExpiringProduct(expiryDate,"Biscuits", 2.49, 5);
        Product tv = new ShippableProduct (500.0, "TV", 399.99, 2);
        Product scratchCard = new Product("Scratch Card", 10.00, 50);

        Customer customer = new Customer("Alice", 10000.00);
        
        customer.addTocart(cheese, 2);
        customer.addTocart(tv, 1);
        customer.addTocart(scratchCard, 1);
        customer.Checkout();
    }
    
}
