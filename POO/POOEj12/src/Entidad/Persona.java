/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Entidad;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    private Date fechaDeNacimiento;
    private String nombre;

    public Persona() {
        
    }

    public Persona(Date fechaDeNacimiento, String nombre) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Date date = new Date();
        Persona p1 = new Persona();
        
        System.out.println("Coloque el nombre");
        p1.setNombre(leer.next());
        System.out.println("Coloque fecha de nacimiento dd/mm/aa");
        date.setDate(leer.nextInt());
        date.setMonth(leer.nextInt()-1);
        date.setYear(leer.nextInt()-1900);
        p1.setFechaDeNacimiento(date);
        
        return p1;
    }

    @Override
    public String toString() {
        return "Persona{" + "fechaDeNacimiento=" + fechaDeNacimiento + ", nombre=" + nombre + '}';
    }
    
    
    
}
