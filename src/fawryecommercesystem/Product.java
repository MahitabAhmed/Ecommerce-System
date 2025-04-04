package fawryecommercesystem;

public class Product {
    String Pname;
    double price;
    int quantity;

    public Product(String Pname, double price, int quantity) {
        this.Pname = Pname;
        this.price = price;
        this.quantity = quantity;
    }

    public String getPname() {
        return Pname;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getWeight() {
        return 0;
    }
    public boolean isExpired(){
        return false;
    }
    public boolean isShippable(){
        return false;
    }
    public void deductQty(int qty) {
        quantity -= qty;
        if(quantity == 0){
          throw new RuntimeException("this prodct is out of stock");
        }
    }

    
}
