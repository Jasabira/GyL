/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
*/
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        //pedir dato
        System.out.println("Coloca el radio");
        double radio = leer.nextDouble();
        
        
        Circunferencia c1 = new Circunferencia(radio);
        
        return c1;
    }
    
    /*public double area(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }*/
    
    public void Area(double radio){
        System.out.println(Math.PI * Math.pow(radio, 2));
    }
      
    /*public double perimetro(double radio){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }*/
    
    public void Perimetro(double radio){
        System.out.println(2 * Math.PI * radio);
    }
}
