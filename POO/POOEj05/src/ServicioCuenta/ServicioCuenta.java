
package ServicioCuenta;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        int saldoActual;
        System.out.println("Ingresa el DNI");
        long DNI = leer.nextLong();
        int numeroCuenta = (int) (Math.random() * 100+1);
        System.out.println("Ingresaras dinero? s/n");
        String res = leer.next();
        if ("s".equals(res)) {
            System.out.println("Cuanto dinero ingresas?");
            saldoActual = leer.nextInt();
        }else{
            saldoActual = 0;
        }
        Cuenta c1 = new Cuenta(numeroCuenta, DNI, saldoActual);
        return c1;
    }
}
