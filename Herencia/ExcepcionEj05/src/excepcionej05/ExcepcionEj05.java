/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package excepcionej05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionEj05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int adiv = (int) (Math.random() * 500 + 1);
        int num;
        int contador = 0;
        boolean band = false;
        
        do {
            try {
                System.out.println("Adivina el numero");
                num = leer.nextInt();
                if (num!=adiv) {
                    contador++;
                }else{
                    System.out.println("ACERTASTE! FELICIDADES! *u*");
                    band = true;
                }
                if (num < adiv) {
                    System.out.println("El numero es mas grande");
                }
                if (num > adiv) {
                    System.out.println("El numero es mas chico");
                }
            } catch (InputMismatchException e) {
                contador++;
                System.out.println(e.getMessage());
                leer.next();
            }
        } while (!band);
        
        System.out.println("Tuvo respuestas incorrectas: " + contador);
        

    }

}
