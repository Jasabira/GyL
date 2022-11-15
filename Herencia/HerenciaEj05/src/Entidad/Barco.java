//Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
package Entidad;

import java.util.Scanner;

public class Barco extends Alquiler {

    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return anioFabricacion;
    }

    public void setAñoFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese matricula del barco: ");
        String m = leer.next();
        setMatricula(m);
        System.out.println("Ingrese eslora (largo total del barco): ");
        int e = leer.nextInt();
        setEslora(e);
        System.out.println("Ingrese año de fabricacion del barco");
        int a = leer.nextInt();
        setAñoFabricacion(a);
    }

    public long precioAlquiler(){
       
        long modulo = getEslora() * 10;
        
        int totalAlquiler = (int) (super.diasAlquiler() * modulo);
        return totalAlquiler;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", Fabricacion=" + anioFabricacion + '}';
    }
}
