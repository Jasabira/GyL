/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import Entidad.Pais;
import java.util.*;

public class ServicioPais {
    private final Scanner leer;
    private final HashSet<Pais> listaPaises;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPaises = new HashSet<>();
    }
    
    public Pais crearPais(){
        Pais nuevoPais = new Pais();
        
        System.out.println("Ingrese el nombre del pais");
        String paisito = leer.next();
        nuevoPais.setNombrePais(paisito);
        listaPaises.add(nuevoPais);
            
        return nuevoPais;
    }
    
    public void mostrarLista(){
        System.out.println("\nLISTA DE LOS PAISES");
        for(Pais aux : listaPaises){
            System.out.println(aux);
        }
        System.out.println("\n");
    } 
    
    public void buscarPais(){
        Iterator<Pais> it = listaPaises.iterator();
        System.out.println("Ingresa el pais a buscar y borrar");
        String nombrePaisABorrar = leer.next();
        boolean band = true;
        while (it.hasNext()) {
            if (it.next().getNombrePais().contains(nombrePaisABorrar)) {
                it.remove();
                break;
            }else{
                band = false;
            }
        }
        
        if (!band) {
            System.out.println("NO SE ENCONTRO");
        }
        mostrarLista();
    }
}
