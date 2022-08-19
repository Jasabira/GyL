/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package javaintroej14;
import java.util.*;

public class JavaIntroExtra07 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloque el valor de n");
        int n = leer.nextInt();
        
        int nMayor = 0;
        int nMenor = 99999999;
        int num;
        int total = 0;
        int nuevo;
        
        nuevo = n;
        System.out.println("Escribe los numeros");
        
        //metodo con for
        /*for (int i = 0; i < n; i++) {
            num = leer.nextInt();
            if (num>nMayor) {
                nMayor = num;
            }
            if (num<nMenor) {
                nMenor = num;
            }
            total = total + num;
        }*/
        
        
        //Metodo con while
        /*while (n>=0) {
            num = leer.nextInt();
            if (num>nMayor) {
                nMayor = num;
                n--;
            }
            if (num<nMenor) {
                nMenor = num;
                n--;
            }
            total = total + num;
        }*/
        
        //Metodo con do while
        /*do {
            num = leer.nextInt();
            if (num>nMayor) {
                nMayor = num;
                n--;
            }
            if (num<nMenor) {
                nMenor = num;
                n--;
            }
            total = total + num;
        } while (n>=0);*/
        
        int promedio = total / nuevo;
        
        System.out.println("El numero mayor es: " + nMayor + " El numero menor es: " + nMenor);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
    
}
