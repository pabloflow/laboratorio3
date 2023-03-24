package PaqComercio;

import java.util.Objects;

public class Employee implements Cloneable {
    String name;
    String address;
    int phoneNumber;
    String email;
    String startDate;
    double salary;
    String position;

    public Employee(String name, String address, int phoneNumber, String email, String startDate, double salary, String position) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.startDate = startDate;
        this.salary = salary;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStartDate() {
        return startDate;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
    protected Object clone() throws CloneNotSupportedException{
        Employee emp = (Employee) super.clone();
        emp.name = this.name;
        emp.address = this.address;
        emp.email = this.email;
        emp.salary = this.salary;
        emp.phoneNumber = this.phoneNumber;
        emp.position = this.position;
        emp.startDate = this.startDate;

        return emp;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return phoneNumber == employee.phoneNumber && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(address, employee.address) && Objects.equals(email, employee.email) && Objects.equals(startDate, employee.startDate) && Objects.equals(position, employee.position);
    }


}
