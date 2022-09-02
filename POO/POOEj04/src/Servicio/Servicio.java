
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingresa la base");
        int base = leer.nextInt();
        System.out.println("Ingresa la altura");
        int altura = leer.nextInt();
        
        Rectangulo r1 = new Rectangulo(base, altura);
        return r1;
    }
    
    public void dibujarRectangulo(Rectangulo r){
        int base = r.getBase();
        int altura = r.getAltura();
        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 0; i < altura-2; i++) {
            System.out.print("*");
            for (int j = 0; j < altura-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
