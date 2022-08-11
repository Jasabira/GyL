
package javaintroej00.pkg8;
import java.util.Scanner;
/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.*/

public class JavaIntroEj008 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una nota");
        int nota = leer.nextInt();
        while (nota <= 0 || nota >= 10) {
            System.out.println("la nota tiene que estar entre 0 y 10");
            nota = leer.nextInt();
        }
    }
    
}
