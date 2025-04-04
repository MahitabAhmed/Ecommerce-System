package fawryecommercesystem;

class ShippableProduct extends Product {
    private double weight;

    public ShippableProduct(double weight, String Pname, double price, int quantity) {
        super(Pname, price, quantity);
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
