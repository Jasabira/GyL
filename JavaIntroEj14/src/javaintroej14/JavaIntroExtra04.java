/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package javaintroej14;

import java.util.*;


public class JavaIntroExtra04 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 10");
        String numero = leer.nextLine();
        switch(numero){
            case "1" -> { System.out.println("1 en numeros romanos es: I");}
            case "2" -> { System.out.println("2 en numeros romanos es: II");}  
            case "3" -> { System.out.println("3 en numeros romanos es: III");}
            case "4" -> { System.out.println("4 en numeros romanos es: IV");}
            case "5" -> { System.out.println("5 en numeros romanos es: V");}
            case "6" -> { System.out.println("6 en numeros romanos es: VI");}
            case "7" -> { System.out.println("7 en numeros romanos es: VII");}
            case "8" -> { System.out.println("8 en numeros romanos es: VIII");}
            case "9" -> { System.out.println("9 en numeros romanos es: IX");}
            case "10" -> { System.out.println("10 en numeros romanos es: X");}
            default ->{ System.out.println("Escribe un numero del 1 al 10 sorete");}
        }
    }
    
    
    
}
