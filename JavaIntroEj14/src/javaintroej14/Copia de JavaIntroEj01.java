/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintroej.pkg01;
import java.util.Scanner;

public class JavaIntroEj01 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe el numero 1");
        int numero1 = leer.nextInt();
        System.out.println("Escribe el numero 2");
        int numero2 = leer.nextInt();
        
        int suma;
        suma = numero1 + numero2;
        mostrarSuma(suma);
        
    }
    
    public static void mostrarSuma(int suma){
        System.out.println("El valor de la suma de ambos numeros es: " + suma);
    }
    
}
