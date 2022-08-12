/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaintroej14;

public class JavaIntroEj15 {

    
    public static void main(String[] args) {
        
        //Creo el vector y lo inicializo
        
        int[] numeros = new int[100];
        
        //Lleno el vector
        
        for (int i = 0; i < 100; i++) {
            numeros[i] = i+1;
        }
        
        //Muestro el vector
        
        for (int i = numeros.length-1 ; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
    
}
