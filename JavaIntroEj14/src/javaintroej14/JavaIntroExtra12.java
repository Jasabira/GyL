/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
0-1-4
0-1-5
0-1-6
0-1-7


Nota: investigar función equals() y como convertir números a String.
 */
package javaintroej14;

public class JavaIntroExtra12 {

    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    System.out.print(i != 3 ? i : "E");
                    System.out.print(j != 3 ? j : "E");
                    System.out.println(k != 3 ? k : "E");                                      
                }
            }
        }
    }
    
}
