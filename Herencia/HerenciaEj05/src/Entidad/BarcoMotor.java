/*
Potencia en CV para barcos a motor.
 */
package Entidad;

import java.util.Scanner;

public class BarcoMotor extends Barco {
    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public BarcoMotor crearBM(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Ingrese la potencia del barco a motor: ");
        int p = leer.nextInt();
        setPotencia(p);
        
        BarcoMotor bm = new BarcoMotor(p, matricula, eslora, anioFabricacion);
        return bm;
    }
    
    public long precioAlquiler(){
        long modulo = getEslora() * 10 + getPotencia();
        
        int totalAlquiler = (int) (super.diasAlquiler() * modulo);
        return totalAlquiler;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia + '}';
    }
    
}
