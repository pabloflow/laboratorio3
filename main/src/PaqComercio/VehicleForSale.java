package PaqComercio;

public class VehicleForSale extends Vehicle{
    double price;
    int discount;

    public VehicleForSale(String brand, boolean repaired, int priority, double price, int discount) {
        super(brand, repaired, priority);
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}