package fawryecommercesystem;
import java.util.*;

public class Customer {
    private String name;
    private double balance;
    private Cart cart = new Cart();

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void addTocart(Product p , int quntity){
        cart.addCartItem(p,quntity);
    }
    public void Checkout(){
        double shippingfees = cart.shippingfees();
        double subtotal = cart.subtotal();
        double paidamount = subtotal + shippingfees;

        if (cart.getAddeditems().isEmpty()) {
           throw new RuntimeException("Cart is empty");
       }
        if(balance < paidamount){
           throw new RuntimeException("Insufficient balance");
       }
        
     balance -= paidamount;  
   
     for (CartItem item : cart.getAddeditems()) {
            item.product.deductQty(item.quantity);
     }
     System.out.println("----------------------");
      System.out.println("Subtotal: " + subtotal);
      System.out.println("Shipping Fees: " + shippingfees);
      System.out.println("Total Paid: " + paidamount);
      System.out.println("Remaining Balance: " + balance);
      
    }
}
