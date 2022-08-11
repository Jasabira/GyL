/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package javaintroej00.pkg12;
import java.util.Scanner;

public class JavaIntroEj0012 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
         esMultiplo(num1, num2);
    }
        
    
    public static void esMultiplo(int num1, int num2){

        if (num1 % num2 == 0) {
            System.out.println(num1 + " Es multiplo de: " + num2);
        }else{
            System.out.println(num1 + " No es multiplo de: " + num2);
        }
    }
    
}
