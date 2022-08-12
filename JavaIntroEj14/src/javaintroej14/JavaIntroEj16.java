/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaintroej14;
import java.util.*;

public class JavaIntroEj16 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        LinkedList<Integer> li = new LinkedList<>(); //coloca un array y se pushea
        
        System.out.println("Coloca el tamaño del vector");
        int tamano = leer.nextInt();
        int nBuscar;
        
        //Creo el vector
        int[] vector = new int[tamano];
        
        //Lleno el vector con numeros aleatorios
        for (int i = 0; i < tamano; i++) {
            vector[i] = (int) (Math.random() * tamano);
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
        System.out.println("Cual es el numero que quiere buscar?");
        nBuscar = leer.nextInt();
        System.out.println("---------------------------------");
        
        //Busco el numero
        for (int i = 0; i < tamano; i++) {
            if (nBuscar == vector[i]) {
                li.push(i);
            }
            
        }
        
        //Informacion
        System.out.println("El numero: " + nBuscar + " se encontró en la posicion: " + li);
    }
    
}
