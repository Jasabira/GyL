/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.util.Calendar; 
import java.util.Date;
import java.util.Scanner;

public class POOEJ11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Date fecha = new Date();
        Date fechaActual = new Date();
        //Calendar calendar = Calendar.getInstance();
        
        System.out.println("Ingresa el dia");
        fecha.setDate(leer.nextInt());
        System.out.println("Ingresa el mes");
        fecha.setMonth(leer.nextInt()-1);
        System.out.println("Ingresa el año");
        fecha.setYear(leer.nextInt()-1900);
        
        System.out.println(fecha);
        System.out.println(fechaActual);
        
        int anos = fecha.getYear() - fechaActual.getYear();
        
        System.out.println("hay: " + anos );
        //System.out.println(calendar.getTime());
    }
    
}
