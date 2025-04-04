package fawryecommercesystem;
import java.util.Date;

class ShippableExpiringProduct extends ExpiringProduct{
    private double weight;

    public ShippableExpiringProduct(double weight, Date expiryDate, String Pname, double price, int quantity) {
        super(expiryDate, Pname, price, quantity);
        this.weight = weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }
    
    @Override
    public boolean isShippable(){
        return true;
    }
    
}
