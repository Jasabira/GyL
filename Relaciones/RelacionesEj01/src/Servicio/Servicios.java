
package Servicio;

import Entidad.Persona;
import java.util.Scanner;
import Entidad.Perro;

public class Servicios {
    
    private final Scanner leer;

    public Servicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Perro crearPerro(){
        Perro pe1 = new Perro();
        
        System.out.println("Ingresa el nombre");
        pe1.setNombre(leer.next());
        System.out.println("Ingresa la raza");
        pe1.setRaza(leer.next());
        System.out.println("Ingresa la edad");
        pe1.setEdad(leer.nextInt());
        System.out.println("ingresa el tamaño pequeño/mediano/grande");
        pe1.setTamaño(leer.next());
        
        return pe1;
    }
    
    public Persona crearPersona(Perro pe1){
        Persona p1 = new Persona();
        
        System.out.println("Ingresa tu nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingresa tu apellido");
        p1.setApellido(leer.next());
        System.out.println("Ingresa tu edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingresa tu numero de documento sin puntos ni espacio");
        p1.setDocumento(leer.nextInt());
        p1.setPerro(pe1);
        
        return p1;
    }
}
