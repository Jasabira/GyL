
package javaintroej01;
import java.util.Scanner;

// Esta es la clase
public class JavaIntroEj01 {

   //Este es el metodo main
    public static void main(String[] args) {
        // Asi se hace el comentario en JAVA
        
       /* Asi
             se coloca un
                          comentario extenso
        */
       
       System.out.println("Hola Mundo Hermoso!");
       
        //Ejercicio morado 01, 02, 03, 04
        
        Scanner leer = new Scanner(System.in);
       
        String nombre = "Jasbir";
        String apellido = "Singh";
        String completo = nombre + apellido;
        int edad = leer.nextInt();
        
        boolean booleano = true;
        char character = 123;
        
        int numero = 26;
        int numero2 = 43;
        int resta = numero - numero2;
        
        double decimaless = 0.56;
        long numeroGrande = 1234566789;
        
        System.out.println(resta);
        System.out.println(nombre + " " + apellido);
        
        //Ejercicio morado 05
        System.out.println("Escribe true or false");
        boolean bandera = leer.nextBoolean();
        System.out.println("Escribe un numero decimal");
        double decimales = leer.nextDouble();
        
        //Ejercicio morado 06
        System.out.println("Escribe numero 1");
        int numeroUno = leer.nextInt();
        System.out.println("Escribe numero 2");
        int numeroDos = leer.nextInt();
        
        if (numeroUno>=25 || numeroDos>=25) {
            System.out.println("Algun numero o los son son mayores a 25");
        } else{
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
}


