/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package javaintroej14;
   import java.util.*;

public class JavaIntroExtra10 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 5+1);
        int num2 = (int) (Math.random() * 5+1);
        int res;
        boolean respuesta = false;
        
        System.out.println("Cuanto da: ");
        System.out.println(num1 + " * " + num2);
         int respuestaCorrecta = num1 * num2;
        
        do {
            System.out.println("Ingresa una respuesta");
            res = leer.nextInt();
            if (res == respuestaCorrecta) {
                respuesta = true;
                System.out.println("RESPUESTA CORRECTA!");
            }else{
                System.out.println("Respuesta incorrecta, vuelve a intentar");
            }
        } while (!respuesta);
        
    }
}
    
       
    
    

  
