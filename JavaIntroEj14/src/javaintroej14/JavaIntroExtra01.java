/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaintroej14;
import java.util.*;

public class JavaIntroExtra01 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int tiempoMin = leer.nextInt();
        //int tiempoMin = 1600;
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        
        while(tiempoMin>=0){
            if (tiempoMin >= 1440) {
                dias = dias + 1;
                tiempoMin = tiempoMin - 1440;
            } else if(tiempoMin >= 60){
                horas = horas + 1;
                tiempoMin = tiempoMin - 60;
            }else{
                minutos = minutos + 1;
                tiempoMin = tiempoMin - 1;
            }
        }
        
        Mostrarconversion(tiempoMin, dias, horas, minutos);  

    }
    
    public static void Mostrarconversion(int tiempoMin, int dias, int horas, int minutos){
        
        System.out.println("equivale a: " + dias + " dias " + horas + " horas y " + minutos + " minutos");
    }
}
