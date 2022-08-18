/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaintroej14;
import java.util.*;

public class JavaIntroExtra08 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        int numerosLeidos = 0;
        int numerosPares = 0;
        int numerosImpares = 0;
        boolean multiplo5 = false;
        
        do {
            num = leer.nextInt();
            numerosLeidos = numerosLeidos + 1;
            if (num%5 == 0) {
               multiplo5 = true; 
            }
            if (num%2 == 0) {
                numerosPares = numerosPares + 1;
            }else{
                numerosImpares = numerosImpares +1;
            }
        } while (!multiplo5);
        
        System.out.println("se leyeron un total de: " + numerosLeidos);
        System.out.println(numerosPares + " numeros pares");
        System.out.println(numerosImpares + " numeros Impares");
    }
    
}

