/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaintroej02;
import java.util.Scanner;

public class JavaIntroEj02 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        
        String variable = leer.nextLine();
        mostrarNombre(variable);
        
    }
    
    public static void mostrarNombre(String variable){
        System.out.println("Tu nombre es: " + variable);
    }
}
