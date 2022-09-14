
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class Servicio {
    public Puntos crearPunto(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Coloque x: ");
        int x = leer.nextInt();
        System.out.println("Coloque y: ");
        int y = leer.nextInt();
        
        return new Puntos(x , y);
        
    }
    
    public int calcularDistancia(Puntos punto1, Puntos punto2){
        int distancia = (int) Math.sqrt(Math.pow((punto2.getX() - punto1.getX()),2) + Math.pow((punto2.getY() - punto1.getY()), 2));
        return distancia;
    }
     
    //d=√((x2-x1)²+(y2-y1)²)
}
