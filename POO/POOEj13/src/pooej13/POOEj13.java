/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package pooej13;

import Entidad.Cancion;

public class POOEj13 {

    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        
        cancion1.setAutor("La cucaracha");
        cancion1.setTitulo("Ya no puede caminar");
        
        Cancion cancion2 = new Cancion("roberta", "lampara");
        
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
        
        
    }
    
}
