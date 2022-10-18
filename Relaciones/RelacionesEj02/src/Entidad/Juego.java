/**Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.**/
package Entidad;

import java.util.*;

public class Juego {
    private HashSet<Jugador> listaJugadores;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(HashSet<Jugador> listaJugadores, RevolverDeAgua revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public HashSet<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(HashSet<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(HashSet<Jugador> listaJugadores, RevolverDeAgua r){
        setListaJugadores(listaJugadores);
        setRevolver(r);
    }
    
    public void ronda(){
        boolean si = true;
        while (si) {
            for (Jugador i : listaJugadores) {
                if (i.disparo(revolver)) {
                    si = false;
                    System.out.println(i.toString());
                    break;
                }
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", revolver=" + revolver + '}';
    }
}
