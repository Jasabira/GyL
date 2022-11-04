
package Entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public Televisor crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion de la tv");
        setResolucion(leer.nextInt());
        System.out.println("La tv tiene TDT? (true/false)");
        setTDT(leer.nextBoolean());
        
        
        Televisor t = new Televisor(resolucion, TDT, precio, color, consumoEnergetico, peso);
        return t;
    }
    
    @Override
    public double precioFinal(){
        
        if (getResolucion() > 40 && TDT) {
            this.precio = super.precioFinal() * 1.30 + 500;
        }else if(TDT){
            this.precio = super.precioFinal() + 500;
        }else{
            this.precio = super.precioFinal();
        }
        
        return 0;
    }
    
    @Override
    public String toString() {
        return "Televisor{" + "resolucion= " + resolucion + " TDT= "+ TDT + " precio= " + precio + " color= " + color + " consumo= " + consumoEnergetico + " peso= " + peso +'}';
    }
}
