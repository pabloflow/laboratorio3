package PaqComercio;

import java.util.Objects;

public class Vehicle {
    String brand;
    boolean repaired;
    int priority;

    public Vehicle(String brand, boolean repaired, int priority) {
        this.brand = brand;
        this.repaired = repaired;
        this.priority = priority;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRepaired(boolean repaired) {
        this.repaired = repaired;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isRepaired() {
        return repaired;
    }

    public int getPriority() {
        return priority;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            return this.brand.equals(v.brand) && this.repaired == v.repaired && this.priority == v.priority;
        } else return false;
    }

    public String toString() {
        return ("Brand: " + this.brand + " repaired: " + this.repaired + " priority: " + this.priority);

    }
}


