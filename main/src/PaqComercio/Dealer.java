package PaqComercio;

public class Dealer extends Business{
    VehicleForSale[] V;
    VehicleToRepair[] R;

    public Dealer(String name, String address, String ID, double[][] dailySale, int[] stock, Employee[] employees, VehicleForSale[] v, VehicleToRepair[] r) {
        super(name, address, ID, dailySale, stock, employees);
        V = v;
        R = r;
    }

    public void setV(VehicleForSale[] v) {
        V = v;
    }

    public void setR(VehicleToRepair[] r) {
        R = r;
    }

    public VehicleForSale[] getV() {
        return V;
    }

    public VehicleToRepair[] getR() {
        return R;
    }
}
