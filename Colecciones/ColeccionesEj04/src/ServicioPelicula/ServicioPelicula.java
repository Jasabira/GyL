/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ServicioPelicula;

import Entidad.Pelicula;
import java.util.*;

public class ServicioPelicula {
    private final Scanner leer;
    private final ArrayList<Pelicula> listaPeliculas;

    public ServicioPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPeliculas = new ArrayList<>();
    }
    
    public Pelicula crearPelicula(){
        Pelicula peli = new Pelicula();
        
        System.out.println("Ingrese el titulo de la pelicula");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        peli.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula");
        peli.setDuracion(leer.nextInt());
        
        listaPeliculas.add(peli);
        return peli;
    }
    
    public void mostrarLista(){
        System.out.println("--------------LISTA DE PELICULAS--------------");
        for(Pelicula aux : listaPeliculas){
            System.out.println(aux + "\n");
        }
        System.out.println("----------------------------------------------");
    }
    
    public void peliMayorAUnaHora(){
        System.out.println("----------------------------------------------");
        System.out.println("Peliculas con duracion mayor a una hora: ");
        for(Pelicula aux : listaPeliculas){
            if (aux.getDuracion() >= 1) {
                System.out.println(aux + "\n");
            }
        }
        System.out.println("----------------------------------------------");
    }
    
    public void OrdenaHoraPorDuracionAscendente(){
        Comparator<Pelicula> comparaDuracion = (Pelicula p2, Pelicula p1) -> Integer.compare(p2.getDuracion(), p1.getDuracion());
        Collections.sort(listaPeliculas, comparaDuracion);
        System.out.println("Peliculas ordenadas por duracion ascendente");
        System.out.println(listaPeliculas);
        System.out.println("----------------------------------------------");
    }
    
    public void OrdenaHoraPorDuracionDescendente(){
        Comparator<Pelicula> comparaDuracion = (Pelicula p1, Pelicula p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion());
        Collections.sort(listaPeliculas, comparaDuracion);
        System.out.println("Peliculas ordenadas por duracion descendente");
        System.out.println(listaPeliculas);
        System.out.println("----------------------------------------------");
    }
    
    public void OrdenaTitulo(){
        Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
        Collections.sort(listaPeliculas, compararTitulo);
        System.out.println("Peliculas ordenadas por titulo alfabeticamente");
        System.out.println(listaPeliculas);
        System.out.println("----------------------------------------------");
    }
    
    public void OrdenaDirector(){
        Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
        Collections.sort(listaPeliculas, compararDirector);
        System.out.println("Peliculas ordenadas por director alfabeticamente");
        System.out.println(listaPeliculas);
        System.out.println("----------------------------------------------");
    }
}
