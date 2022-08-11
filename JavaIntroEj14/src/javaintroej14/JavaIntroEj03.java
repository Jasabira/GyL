/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaintroej03;
import java.util.Scanner;

public class JavaIntroEj03 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe una frase");
        
        String frase = leer.nextLine();
        
        mostrarMayuscula(frase);
        mostrarMinuscula(frase);
        
    }
    
    public static void mostrarMayuscula(String frase){
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
    }
    
    public static void mostrarMinuscula(String frase){
        System.out.println("La frase en minusculas es: " + frase.toLowerCase());
    }
    
}
