/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package javaintroej05;
import java.util.Scanner;

public class JavaIntroEj05 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = leer.nextInt();
        
        int doble = numero * 2;
        int triple = numero * 3;
        double raiz = Math.sqrt(numero);
        
        mostrar(numero, doble, triple, raiz);
        
    }
    
    public static void mostrar(int numero, int doble, int triple, double raiz){
        System.out.println("El doble de: " + numero + " es: " + doble);
        System.out.println("El triple de: " + numero + " es: " + triple);
        System.out.println("La raiz de: " + numero + " es: " + raiz);
    }
    
    
    
}
