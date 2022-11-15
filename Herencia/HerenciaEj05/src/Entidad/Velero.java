/*
Número de mástiles para veleros.
 */
package Entidad;

import java.util.Scanner;

public class Velero extends Barco {
    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }
    
    public Velero crearVelero(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Ingrese el numero de mastiles del velero: ");
        int nroM = leer.nextInt();
        setNroMastiles(nroM);
        
        Velero v = new Velero(nroM, matricula, eslora, anioFabricacion);
        return v;
    }
    
    /*
    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    el número de camarotes.
    */
    public long precioAlquiler(){
        long modulo = getEslora() * 10 + getNroMastiles();
        
        int totalAlquiler = (int) (super.diasAlquiler() * modulo);
        return totalAlquiler;
    }

    @Override
    public String toString() {
        return "Velero{" + "nroMastiles=" + nroMastiles + '}';
    }
}
