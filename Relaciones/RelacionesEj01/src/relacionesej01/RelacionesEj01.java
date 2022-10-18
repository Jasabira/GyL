/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesej01;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.Servicios;

public class RelacionesEj01 {

    public static void main(String[] args) {
//        Perro perro1 = new Perro();
//        perro1.setNombre("Linda");
//        perro1.setRaza("Poddle");
//        perro1.setEdad(15);
//        perro1.setTamaño("pequeño");
//        
//        Persona persona1 = new Persona();
//        persona1.setNombre("Jasbir");
//        persona1.setApellido("Singh");
//        persona1.setEdad(26);
//        persona1.setDocumento(95898897);
//        persona1.setPerro(perro1);


        Servicios serv = new Servicios();
        
        Perro pe1 = serv.crearPerro();
        Persona p1 = serv.crearPersona(pe1);
        
        System.out.println(p1.toString());
        
    }
    
}
