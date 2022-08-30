/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
package pooej01;

import Entidad.Libro;
import java.util.*;


public class POOEj01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro primerLibro = new Libro();
        
        System.out.println("Ingresa los datos del libro");
        
        System.out.println("Numero ISBN");
        primerLibro.setISBN(leer.next());
        
        System.out.println("Titulo");
        primerLibro.setTitulo(leer.next());
        
        System.out.println("Autor");
        primerLibro.setAutor(leer.next());
        
        System.out.println("Numero de paginas");
        primerLibro.setNumeroPaginas(leer.nextInt());
        
        
        System.out.println("los datos son:");
        System.out.println(primerLibro.getISBN() + " " + primerLibro.getTitulo() + " " + primerLibro.getAutor() + " " + primerLibro.getNumeroPaginas());
        
    }
    
}
