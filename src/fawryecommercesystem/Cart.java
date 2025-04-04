package fawryecommercesystem;
import java.util.*;

public class Cart {
   private ArrayList<CartItem> addeditems = new ArrayList<>();

    public ArrayList<CartItem> getAddeditems() {
        return addeditems;
    }
    
    public void addCartItem(Product product, int quantity){
        if(quantity > product.quantity){
            throw new RuntimeException("there is not enough in stock");
        }
        CartItem item = new CartItem(product, quantity);
        addeditems.add(item);
    }
    public double subtotal(){
        double subprice = 0.0;
        System.out.println("\n**Checkout receipt**");
        for(int i= 0; i < addeditems.size(); i++){
          CartItem item = addeditems.get(i);
          subprice += item.getPrice();
          System.out.println(item.quantity + "x " + item.product.getPname() + "    " + item.getPrice());              

         }
        return subprice;
        
    }
    public double shippingfees(){
       double shippingfees = 0.0;
       double totalWeight = 0.0;
        System.out.println("**Shipment notice**");
       for(int i= 0; i < addeditems.size(); i++){
           if(addeditems.get(i).isShippable()){
               CartItem item = addeditems.get(i);
               Product shippableItem = item.product;
               shippingfees += shippableItem.getWeight()* item.quantity *1.5;
               totalWeight += shippableItem.getWeight()* item.quantity;
               
                System.out.println(item.quantity + "x " + shippableItem.getPname() + "    " + shippableItem.getWeight() + "g" );              
            }
         }
        System.out.println("Total package weight " + totalWeight/1000 + "kg" );

        return shippingfees;
    }

}
