/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.*/

package javaintroej00.pkg11;
import java.util.Scanner;

public class JavaIntroEj0011 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        
        String retorno;
        retorno = Trans(frase);
        System.out.println(retorno);
    }
    
    public static String Trans(String frase) {
       String x = "";
       String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            x = frase.substring(i, i+1);
            
            switch (x) {
                case "a" -> x = "@";
                case "e" -> x = "#";
                case "i" -> x = "$";
                case "o" -> x = "%";
                case "u" -> x = "*";
            }
            nueva = nueva.concat(x);
        }
        return nueva;
    }
}