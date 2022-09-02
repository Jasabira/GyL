package pooej02;

import Entidad.Circunferencia;
import Servicio.Servicio;


public class POOEj02 {

   
    public static void main(String[] args) {
        
        Servicio sc = new Servicio();
        
        Circunferencia Cir = sc.crearCircunferencia();
        
        System.out.println("La circunferencia es de: ");
        System.out.println(Cir.toString());
        System.out.println("El area es de: ");
        sc.Area(Cir.getRadio());
        System.out.println("El perimetro es de: ");
        sc.Perimetro(Cir.getRadio());
    }
    
}
