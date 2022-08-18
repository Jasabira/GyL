/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaintroej14;
import java.util.*;

public class JavaIntroExtra06 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cual es el total de las personas?");
        int totalPersonas = leer.nextInt();
        double estaturaDebajo = 0;
        int contDebajo = 0;
        double estaturaGeneral = 0;
        
        System.out.println("Coloca la altura de la persona:");
        
        for (int i = 0; i < totalPersonas; i++) {
            double altura = leer.nextDouble();
            estaturaGeneral = estaturaGeneral + altura;
            if (altura < 1.60) {
                estaturaDebajo = estaturaDebajo + altura;
                contDebajo++;
            }
        }
        
        double promedioDebajo = estaturaDebajo / contDebajo;
        double promedioGeneral = estaturaGeneral / totalPersonas;
        
        System.out.println("el promedio de estatura por debajo de 1.60 es de: " + promedioDebajo);
        System.out.println("El promedio de estatura de las personas en general es de: " + promedioGeneral);
        
    }
    
}
