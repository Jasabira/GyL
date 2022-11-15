/*
Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidad;

import java.util.Scanner;

public class YateLujo extends Barco {
    private int potencia;
    private int nroCamarotes;

    public YateLujo() {
    }
    
    public YateLujo(int potencia, int nroCamarotes, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
        this.nroCamarotes = nroCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }
    
    public YateLujo crearYate(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Ingrese la potencia del Yate: ");
        int p = leer.nextInt();
        setPotencia(p);
        System.out.println("Ingrese el numero de camarotes: ");
        int c = leer.nextInt();
        setNroCamarotes(c);
        
        YateLujo yl = new YateLujo(p, c, getMatricula(), getEslora(), getAñoFabricacion());
        return yl;
    }
    
    public long precioAlquiler(){
        long modulo = getEslora() * 10 + getPotencia() + getNroCamarotes();
        
        int totalAlquiler = (int) (super.diasAlquiler() * modulo);
        return totalAlquiler;
    }

    @Override
    public String toString() {
        return "YateLujo{" + "potencia=" + potencia + ", nroCamarotes=" + nroCamarotes + '}';
    }
}
