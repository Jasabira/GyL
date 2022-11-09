
package Entidad;

import herenciaej04.interfaces.calculosFormas;
import java.util.Scanner;


public class Rectangulo implements calculosFormas{
    public double base;
    public double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base: ");
        double b = leer.nextDouble();
        setBase(b);
        System.out.println("Ingrese altura: ");
        double a = leer.nextDouble();
        setAltura(a);
        
        Rectangulo r = new Rectangulo(b, a);
        return r;
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

    @Override
    public double calculaArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public double calculaPerimetro() {
        double perimetro = (getBase() + getAltura()) * 2;
        return perimetro;
    }
}
