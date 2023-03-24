package PaqComercio;

public class Restaurant extends Business{
    String[] dailyMenu;
    int numberTables;
    int capacity;

    public Restaurant(String name, String address, String ID, double[][] dailySale, int[] stock, Employee[] employees, String[] dailyMenu, int numberTables, int capacity) {
        super(name, address, ID, dailySale, stock, employees);
        this.dailyMenu = dailyMenu;
        this.numberTables = numberTables;
        this.capacity = capacity;
    }

    public Restaurant(String name, String address, String ID, double[][] dailySale, int[] stock, Employee[] employees) {
        super(name, address, ID, dailySale, stock, employees);
    }

    public String[] getDailyMenu() {
        return dailyMenu;
    }

    public void setDailyMenu(String[] dailyMenu) {
        this.dailyMenu = dailyMenu;
    }

    public int getNumberTables() {
        return numberTables;
    }

    public void setNumberTables(int numberTables) {
        this.numberTables = numberTables;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
