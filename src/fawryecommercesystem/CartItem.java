package fawryecommercesystem;

public class CartItem {
     Product product;
     int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public double getPrice(){
      double  totalPrice = quantity * product.price;
      return totalPrice;
    }
    
    public boolean isShippable(){
        return product.isShippable();
    }
}
