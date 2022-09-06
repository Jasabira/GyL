/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidad;

import java.util.Scanner;


public class Cuenta {
    Scanner leer = new Scanner(System.in);
    
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    //METODO
    
    public int ingresar(double ingreso){
        double dinero = ingreso;
        return saldoActual += dinero;
    }
    
    public int retirar(double retiro){
        double dinero = retiro;
        if (dinero > saldoActual) {
            System.out.println("Saldo insuficiente");
        }else{
            saldoActual -= dinero;
        }
        return saldoActual;
    }
    
    public int extraccionRapida(){
        double dinero = (saldoActual * 20) / 100;
        System.out.println("Solo puede sacar el 20% de su saldo actual, acepta? s/n");
        String res = leer.next();
        if ("s".equals(res)) {
            saldoActual -= dinero;
        }
        return saldoActual;
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de : ");
        System.out.println(saldoActual + "$");
    }
    
    public void consultarDatos(){
        System.out.println("Sus datos son: ");
        System.out.println("Cuenta Nº: " +  numeroCuenta + " DNI: " + DNI);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }

    
}
