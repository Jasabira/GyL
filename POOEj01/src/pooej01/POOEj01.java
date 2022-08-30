
package pooej01;

import Entidad.Persona;


public class POOEj01 {

    
    public static void main(String[] args) {
        //Instanciando nuevo objeto sin parametros
        Persona primeraPersona = new Persona();
        
        //Instanciando nuevo objeto con parametros
        Persona segundaPersona = new Persona("Jasbir", "Singh", 26);
        
        //Consultando con un get
        System.out.println(segundaPersona.nombre);
        
        //Cambiando parametro con set y mostrandolo con get
        segundaPersona.setNombre("Coromoto");
        System.out.println(segundaPersona.nombre);
        
        //Seteando nombre en primeraPersona y mostrandolo
        primeraPersona.setNombre("Thomas");
        primeraPersona.setApellido("Dominguez");
        primeraPersona.setEdad(24);
        
        System.out.println(primeraPersona.nombre + " " + primeraPersona.apellido + " " + primeraPersona.edad);
        
    }
    
}
