/*

 */
package Entidad;


public class Persona {
    
    //3 atributos de la clase persona
    public String nombre;
    public String apellido;
    public int edad;
    
    //Creando constructor vacio
    public Persona() {
    }

    //Creando constructor con parametros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}

    
