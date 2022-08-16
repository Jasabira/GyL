
package javaintroej00.pkg9;
import java.util.Scanner;

public class JavaIntroEj009 {
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num;
        int suma = 0;
        int cont = 0;
        
        do {
            num = leer.nextInt();
            if (num >= 0) {
                suma = suma + num;
                cont++;
            } else{
                break;
            }
            
            if (cont > 19) {
                break;
            }
        } while (num >= 1);
        
        System.out.println("El total de la suma es: " + suma);
    }
    
}
