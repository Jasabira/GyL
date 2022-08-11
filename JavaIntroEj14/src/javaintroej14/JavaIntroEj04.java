/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaintroej04;
import java.util.Scanner;

public class JavaIntroEj04 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloca una cantidad de grados Centigrados");
        int gradosC = leer.nextInt();
        
        int gradosF = 32 + (9 * gradosC / 15);
        
        mostrarGradosF(gradosC, gradosF);
    }
    
    public static void mostrarGradosF(int gradosC, int gradosF){
        System.out.println("La equivalencia de: " + gradosC + " grados centigrados a Fahrengeit es: " + gradosF);
    }
}
