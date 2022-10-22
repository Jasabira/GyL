package Entidad;

import java.util.*;

public class Baraja {

    private Carta cartas[];
    private int nextCarta;

    public static final int NUM = 40;

    public Baraja() {
        this.cartas = new Carta[NUM];
        this.nextCarta = 0;
        crearBaraja();
    }

    public Baraja(Carta[] cartas, int nextCarta) {
        this.cartas = cartas;
        this.nextCarta = nextCarta;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getNextCarta() {
        return nextCarta;
    }

    public void setNextCarta(int nextCarta) {
        this.nextCarta = nextCarta;
    }

    private void crearBaraja() {
        String[] palos = Carta.Palos;
        //Recorre PALOS
        for (int i = 0; i < palos.length; i++) {
            //REcorre Numeros
            for (int j = 0; j < Carta.limiteCartaPalo; j++) {
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        cartas[((i * (Carta.limiteCartaPalo - 2)) + (j - 2))] = new Carta(j + 1, palos[i]);
                    } else {
                        cartas[((i * (Carta.limiteCartaPalo - 2)) + j)] = new Carta(j + 1, palos[i]);
                    }

                }
            }
        }
    }

    public void barajar() {
        int posicionAlea = 0;
        Carta c;

        for (int i = 0; i < cartas.length; i++) {
            posicionAlea = (int) Math.floor(Math.random() * (39 - 0 + 1) + 0);
            c = cartas[i];
            cartas[i] = cartas[posicionAlea];
            cartas[posicionAlea] = c;
        }
        this.nextCarta = 0;
    }

    public Carta siguienteCarta() {
        Carta c = null;
        if (nextCarta == NUM) {
            System.out.println("Ya no hay mas cartas");
        } else {
            c = cartas[nextCarta++];
            System.out.println(c);
        }
        return c;
    }

    public int cartasDisponibles() {
        System.out.println("Hay: " + (NUM - nextCarta));
        return NUM - nextCarta;
    }

    public Carta[] darCartas(int cantidad) {
        if (cantidad > NUM) {
            System.out.println("Sobrepasas la cantidad de cartas que hay");
        } else {
            if (cartasDisponibles() < cantidad) {
                System.out.println("El mazo no tiene suficientes cartas");
            } else {
                Carta[] dandoCartas = new Carta[cantidad];
                for (int i = 0; i < dandoCartas.length; i++) {
                    dandoCartas[i] = siguienteCarta();
                }
                System.out.println(Arrays.toString(dandoCartas));
                return dandoCartas;
            }
        }
        return null;
    }

    public void cartasMonton() {
        if (cartasDisponibles() == NUM) {
            System.out.println("no se ha sacado ninguna carta");
        }else{
            for (int i = 0; i < nextCarta; i++) {
                System.out.println(cartas[i]);
            }
        }
    }

    public void mostrarBaraja() {
        if (cartasDisponibles() == 0) {
            System.out.println("No hay cartas");
        }else{
            for (int i = nextCarta; i < cartas.length; i++) {
                System.out.println(cartas[i]);
            }
        }
    }

    public void menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que quieres hacer con la baraja?");
        System.out.println("1) Barajar");
        System.out.println("2) Siguiente carta");
        System.out.println("3) Cartas disponibles");
        System.out.println("4) Dar cartas");
        System.out.println("5) Cartas monton");
        System.out.println("6) Mostrar baraja");
        
        int var = leer.nextInt();
        switch (var) {
            case 1:
                barajar();
                menu();
                break;
            case 2:
                siguienteCarta();
                menu();
                break;
            case 3:
                cartasDisponibles();
                menu();
                break;
            case 4:
                System.out.println("Coloca la cantidad de cartas a dar");
                int cantidad = leer.nextInt();
                darCartas(cantidad);
                menu();
                break;
            case 5:
                cartasMonton();
                menu();
            case 6:
                mostrarBaraja();
                menu();
            default:
                System.out.println("Opcion incorrecta");
                menu();
        }
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", nextCarta=" + nextCarta + '}';
    }
}
