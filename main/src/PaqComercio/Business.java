package PaqComercio;

import java.util.Calendar;

public class Business implements Cloneable {
    String name;
    String address;
    String ID;
    double[][] dailySale = new double[12][31];
    int[] stock ;
    Employee[] employees;


    public Business(String name, String address, String ID, int[] stock, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.ID = ID;
        this.stock = stock;
        this.employees = employees;
    }

    int calculateTotalVentas(){

        int total = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<31; j++){
                total += dailySale[i][j];
            }
        }
        return total;
    }

    int calculateSalesMonth(int month){
        int total = 0;
        for(int i = 0; i<31; i++){
            total += dailySale[month][i];
        }
        return total;
    }

    int monthMayorSales(){
        int maxMonth = 0;
        int max = 0;
        for(int i = 0; i<12; i++){
            int total = 0;
            for(int j = 0; j<31; j++){
                total += dailySale[i][j];
            }
            if(total > max){
                max = total;
                maxMonth = i;
            }
        }
        return maxMonth;

    }
    public void updateSales(int amount){
        Calendar cal = Calendar.getInstance();
        int dayMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        dailySale[month][dayMonth - 1] = amount;
    }



    protected Object clone() throws CloneNotSupportedException {
        Business obj = (Business) super.clone();
        obj.name = this.name;
        obj.address = this.address;
        obj.ID = this.ID;
        for (int i = 0; i<12; i++ ){
            for(int j = 0; j<31;j++){
                obj.dailySale[i][j] = this.dailySale[i][j];
            }
        }
        for(int i = 0; i < obj.stock.length ; i++){
            obj.stock[i] = this.stock[i];
        }
        for (int i = 0; i < obj.employees.length; i++){

        }



        return obj;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDailySale(double[][] dailySale) {
        this.dailySale = dailySale;
    }

    public void setStock(int[] stock) {
        this.stock = stock;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {
        return ID;
    }

    public double[][] getDailySale() {
        return dailySale;
    }

    public int[] getStock() {
        return stock;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
