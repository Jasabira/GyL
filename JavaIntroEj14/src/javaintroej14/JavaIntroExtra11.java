/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.*/
package javaintroej14;

import java.util.Scanner;


public class JavaIntroExtra11 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        int digitos = 0;
        
        while (numero != 0) {
            numero = numero / 10;
            digitos++;
        }
        System.out.println(digitos);
        
    }
    
}
