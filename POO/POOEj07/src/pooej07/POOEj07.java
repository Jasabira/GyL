/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package pooej07;

import Entidad.Persona;
import Servicio.ServicioPersona;


public class POOEj07 {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        
        Persona p1 = sp.crearPersona();
        //Persona p2 = sp.crearPersona();
        //Persona p3 = sp.crearPersona();
        //Persona p4 = sp.crearPersona();
        
        
        System.out.println(sp.esMayorDeEdad(p1));
        System.out.println(sp.calcularIMC(p1));
        
        
        //sp.esMayorDeEdad(p2);
        //sp.calcularIMC(p2);
        
        //sp.esMayorDeEdad(p3);
        //sp.calcularIMC(p3);
        
        //sp.esMayorDeEdad(p4);
        //sp.calcularIMC(p4);
        
        
    }
    
}
