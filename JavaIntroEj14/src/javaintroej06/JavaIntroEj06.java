/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package javaintroej06;
import java.util.Scanner;

public class JavaIntroEj06 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba el numero a verificar");
        int numero = leer.nextInt();
        
        System.out.println("Es par?: " + parOimpar(numero));
    }
    
    public static boolean parOimpar(int numero){
        return numero % 2 == 0;
    }
    
}
