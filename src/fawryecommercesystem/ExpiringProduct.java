package fawryecommercesystem;
import java.util.Date;

public class ExpiringProduct extends Product {
    private Date expiryDate;

    public ExpiringProduct(Date expiryDate, String Pname, double price, int quantity) {
        super(Pname, price, quantity);
        this.expiryDate = expiryDate;
    }
    @Override
    public boolean isExpired() {
        Date today = new Date();
        
        if(today.after(expiryDate)){
          throw new RuntimeException("Product " + Pname + " is expired.");

        }else if (today.before(expiryDate)){
            return false;
        }
            return false;
    }    
}
