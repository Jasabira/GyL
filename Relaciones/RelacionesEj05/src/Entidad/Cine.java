/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package Entidad;

import java.util.*;

public class Cine {
    private Pelicula peli;
    private String asientos[][];
    private int precio;

    public Cine() {
    }

    public Cine(Pelicula peli, String[][] asientos, int precio) {
        this.peli = peli;
        this.asientos = asientos;
        this.precio = precio;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setEspectadores(String[][] asientos) {
        this.asientos = asientos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void creandoSala(){
        
        String [][] asientos ={
        {"8 A", "8 B", "8 C", "8 D", "8 E", "8 F"},
        {"7 A", "7 B", "7 C", "7 D", "7 E", "7 F"},
        {"6 A", "6 B", "6 C", "6 D", "6 E", "6 F"},
        {"5 A", "5 B", "5 C", "5 D", "5 E", "5 F"},
        {"4 A", "4 B", "4 C", "4 D", "4 E", "4 F"},
        {"3 A", "3 B", "3 C", "3 D", "3 E", "3 F"},
        {"2 A", "2 B", "2 C", "2 D", "2 E", "2 F"},
        {"1 A", "1 B", "1 C", "1 D", "1 E", "1 F"}};
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", asientos=" + asientos + ", precio=" + precio + '}';
    }
}
