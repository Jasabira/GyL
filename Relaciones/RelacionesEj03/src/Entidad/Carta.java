
package Entidad;

public class Carta {
    private int numero;
    private String palo;
    
    public static final String[] Palos = {"Espada" , "Basto", "Oro", "Copa"};
    public static final int limiteCartaPalo = 12;


    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
}
