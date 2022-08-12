/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaintroej14;
import java.util.Scanner;

public class JavaIntroEj16 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloca el tamaño del vector");
        int tamano = leer.nextInt();
        int nBuscar;
        int cont = 0;
        int posicion = 0;
        
        //Creo el vector
        int[] vector = new int[tamano];
        
        //Lleno el vector con numeros aleatorios
        for (int i = 0; i < tamano; i++) {
            vector[i] = (int) (Math.random() * tamano);
            System.out.println(vector[i]);
        }
        
        System.out.println("Cual es el numero que quiere buscar?");
        nBuscar = leer.nextInt();
        
        //Busco el numero
        for (int i = 0; i < tamano; i++) {
            if (nBuscar == vector[i]) {
                cont++;
                posicion = i;
            }
            
        }
        cont = cont -1;
        
        //Informacion
        System.out.println("El numero: " + nBuscar + " se encontró en la posicion: " + posicion + " y se encontró: " + cont + " mas");
    }
    
}
