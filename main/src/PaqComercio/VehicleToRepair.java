package PaqComercio;

public class VehicleToRepair extends Vehicle {
    String accident;


    public VehicleToRepair(String brand, boolean repaired, int priority, String accident) {
        super(brand, repaired, priority);
        this.accident = accident;

    }

    public void setAccident(String accident) {
        this.accident = accident;
    }

    public void setRepaired(boolean repaired) {
        this.repaired = repaired;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getAccident() {
        return accident;
    }

    public boolean isRepaired() {
        return repaired;
    }

    public int getPriority() {
        return priority;
    }
}
