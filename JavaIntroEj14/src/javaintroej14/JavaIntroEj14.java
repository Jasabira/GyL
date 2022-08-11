/* VECTORES Y MATRICES
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaintroej14;
import java.util.Scanner;

public class JavaIntroEj14 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de € a convertir");
        double euros = leer.nextDouble();
        System.out.println("A cual moneda quieres convertir?");
        System.out.println("1: Dolares");
        System.out.println("2: Yenes");
        System.out.println("3: Libras");
        int moneda = leer.nextInt();
        
        realizaCambio(euros, moneda);
        mostrarCambio(euros, moneda);
    }
    
    public static double realizaCambio(double euros, int moneda){
        switch (moneda) {
            case 1 -> {
                double dolares;
                dolares = (euros * 1.28611);
                return dolares;
            }
            case 2 -> {
                double yanes;
                yanes = (euros * 129.852);
                return yanes;
            }
            case 3 -> {
                double libras;
                libras = (euros * 0.86);
                return libras;
            }
        }
        return realizaCambio(euros, moneda);
    }
  
    public static void mostrarCambio(double euros, int moneda){
        System.out.println("El cambio solicitado da: " + realizaCambio(euros, moneda));
    }    
    
}
