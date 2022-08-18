/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 */
package javaintroej14;
import java.util.*;

public class JavaIntroExtra05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese que tipo de socio es: A, B o C");
        String socio = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        int precioTto = leer.nextInt();
      
        switch(socio){
            case "A" -> {
               int totalA = precioTto/2;
                System.out.println("El precio final es: " + totalA);
               break;
            }
            case "B" -> {
                int totalB = (precioTto * 35) / 100;
                System.out.println("El precio final es: " + totalB);
                break;
            }
            case "C" -> {
                int totalC = precioTto;
                System.out.println("El precio final es: " + totalC);
                break;
            }
            default -> {System.out.println("Solo hay A, B y C");}
            
        }
    }
    
}
