
package Entidad;

import herenciaej04.interfaces.calculosFormas;
import static java.lang.Math.PI;
import java.util.Scanner;

public class Circulo implements calculosFormas {
    public double radio;
    public double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getDiametro(){
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public Circulo crearCirculo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese radio: ");
        double r = leer.nextDouble();
        setRadio(r);
        System.out.println("Ingrese diametro: ");
        double d = leer.nextDouble();
        setDiametro(d);
        
        Circulo c = new Circulo(r, d);
        return c;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    
    @Override
    public double calculaArea() {
        double area = PI * Math.pow(getRadio(), 2);
        return area;
    }

    @Override
    public double calculaPerimetro() {
        double perimetro = (PI * getDiametro());
        return perimetro;
    }
}
