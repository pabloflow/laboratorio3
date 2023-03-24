package PaqPruebas;
import PaqComercio.*;

public class Pruebas {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("audi", true, 2);
        Vehicle v2 = new Vehicle("audi", true, 2);

        System.out.println(v1.equals(v2));
    }
}
