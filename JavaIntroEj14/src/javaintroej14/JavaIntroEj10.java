/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package javaintroej10;
import java.util.Scanner;

public class JavaIntroEj10 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloca un numero limite positivo");
        int limite = leer.nextInt();
        
        int suma = 0;
        
        for (int i = 0; i < limite-1; i++) {
            if (suma < limite) {
                System.out.println("Escribe un numero");
                i = leer.nextInt();
                suma = suma + i;
            }else{
                break;
            }
        }
        System.out.println("La suma de los numeros alcanzo el limite: " + suma);
    }
}
