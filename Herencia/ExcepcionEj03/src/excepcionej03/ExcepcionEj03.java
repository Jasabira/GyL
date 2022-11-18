/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package excepcionej03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionEj03 {

    public static void main(String[] args) {
        
        try{
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero 1");
        String Cuno = leer.next();
        System.out.println("Ingrese numero 2");
        String Cdos = leer.next();
        
        int Nuno = Integer.parseInt(Cuno);
        int Ndos = Integer.parseInt(Cdos);
        
        System.out.println("La division del numero uno entre el numero dos da: " + Nuno / Ndos);
        }catch(NumberFormatException | InputMismatchException | ArithmeticException e){
            System.out.println(e.getMessage());
        }       
    }
    
}
