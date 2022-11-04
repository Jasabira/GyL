
package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public Lavadora crearLavadora(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        setCarga(leer.nextInt());
        
        Lavadora l = new Lavadora(carga, precio, color, consumoEnergetico, peso);
        return l;
    }
    
    /** * Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad.Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
     * @return **/
    @Override
    public double precioFinal(){
        
        if (getCarga() > 30) {
            this.precio = super.precioFinal() + 500;
        }else{
            this.precio = super.precioFinal();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga= " + carga + " precio= " + precio + " color= " + color + " consumo= " + consumoEnergetico + " peso= " + peso +'}';
    }
}
