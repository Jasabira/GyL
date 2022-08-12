/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaintroej14;
import java.util.*;

public class JavaIntroEj17 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Coloque el tamaño del vector");
        int n = leer.nextInt();
        
        //Creando vector
        int[] vector = new int[n];
        
        //Llenando el vector
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 1000+1);
            System.out.print("{" + vector[i] + "} ");
        }
        System.out.println("");
       
        
        //Verificando vector
         System.out.println("La cantidad de digitos en cada posicion es: ");
        for (int i = 0; i < n; i++) {
            int digitos = vector[i];
            String numCadena = String.valueOf(digitos);
            System.out.print("[" + numCadena.length() + "] ");
        }
        System.out.println();
        
        
    }
    
}
