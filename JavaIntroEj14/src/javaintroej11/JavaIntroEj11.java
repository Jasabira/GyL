/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú: El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package javaintroej11;

import java.util.Scanner;

public class JavaIntroEj11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int primerNumero;
        int segundoNumero;
        String res;

        while (!salir) {
            System.out.println("MENU");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Coloca numero 1 y numero 2");
                    primerNumero = leer.nextInt();
                    segundoNumero = leer.nextInt();
                    int suma = primerNumero + segundoNumero;
                    System.out.println("La suma de los dos numeros da: " + suma);
                    break;
                }
                case 2 -> {
                    System.out.println("Coloca numero 1 y numero 2");
                    primerNumero = leer.nextInt();
                    segundoNumero = leer.nextInt();
                    int resta = primerNumero - segundoNumero;
                    System.out.println("La resta de los dos numeros da: " + resta);
                    break;
                }
                case 3 -> {
                    System.out.println("Coloca numero 1 y numero 2");
                    primerNumero = leer.nextInt();
                    segundoNumero = leer.nextInt();
                    int multi = primerNumero * segundoNumero;
                    System.out.println("La multiplicacion de los dos numeros da: " + multi);
                    break;

                }
                case 4 -> {
                    System.out.println("Coloca numero 1 y numero 2");
                    primerNumero = leer.nextInt();
                    segundoNumero = leer.nextInt();
                    int div = primerNumero / segundoNumero;
                    System.out.println("La division de los dos numeros da: " + div);
                    break;
                }
                case 5 -> {
                    System.out.println("Seguro quieres salir? S/N");
                    leer.nextLine();
                    res = leer.nextLine();
                    if (res.equals("S")) {
                        salir = true;
                        break;
                    }  
                }
                default -> {
                    System.out.println("numero Invalido");
                }
            }
        }
    }
}
