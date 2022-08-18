/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package javaintroej14;
import java.util.*;

public class JavaIntroExtra03 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Escribe una letra");
       String letra = leer.nextLine();
       
        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
       
    }
    
}
