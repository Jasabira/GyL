package Servicio;

import Entidad.Persona;
import java.util.Scanner;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Servicios {

    private final Scanner leer;
    private final ArrayList<Perro> listaPerros;
    private final ArrayList<Persona> listaPersonas;

    public Servicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPerros = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }

    public void crearPerro() {
        String res;
        while (true) {
            Perro pe1 = new Perro();

            System.out.println("Ingresa el nombre");
            pe1.setNombre(leer.next());
            System.out.println("Ingresa la raza");
            pe1.setRaza(leer.next());
            System.out.println("Ingresa la edad");
            pe1.setEdad(leer.nextInt());
            System.out.println("ingresa el tamaño pequeño/mediano/grande");
            pe1.setTamaño(leer.next());
            listaPerros.add(pe1);

            System.out.println("Quiere crear otro perro?");
            res = leer.next();
            if (res.equals("no")) {
                break;
            }
        }
    }

    public Persona crearPersona() {

        Persona p1 = new Persona();

        System.out.println("Ingresa tu nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingresa tu apellido");
        p1.setApellido(leer.next());
        System.out.println("Ingresa tu edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingresa tu numero de documento sin puntos ni espacio");
        p1.setDocumento(leer.nextInt());
        agregarPerro(p1);
        listaPersonas.add(p1);

        System.out.println(p1.toString());

        return p1;
    }

    public void mostrarPerros() {
        System.out.println("\nLOS PERROS SON:");
        for (Perro aux : listaPerros) {
            System.out.println(aux);
        }
        System.out.println("\n");
    }
    
    public void mostrarPersona(){
        System.out.println("\nLOS PERSONAS SON:");
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
        System.out.println("\n");
    }

    public void agregarPerro(Persona p1) {
        ListIterator<Perro> it = listaPerros.listIterator();
        System.out.println("Que perro quiere adoptar?, ingrese el nombre:");
        mostrarPerros();

        String adop = leer.next();

        boolean band = true;
        while (it.hasNext()) {
            if (it.next().getNombre().contains(adop)) {
                p1.setPerro(it.previous());
                it.remove();
                break;
            } else {
                band = false;
            }
        }

        if (!band) {
            System.out.println("NO SE ENCONTRO");
        }
    }

    public void menu() {
        System.out.println("MENU");
        System.out.println("1) Ingresar Perro");
        System.out.println("2) Ingresar Persona");
        System.out.println("3) Mostrar Perros");
        System.out.println("4) Mostrar Personas");
        System.out.println("5) Salir");
        int var = leer.nextInt();
        switch (var) {
            case 1 -> {
                crearPerro();
                menu();
            }
            case 2 -> {
                crearPersona();
                menu();
            }
            case 3 -> {
                mostrarPerros();
                menu();
            }
            case 4 ->{
                mostrarPersona();
                menu();
            }
            case 5 -> {
                break;
            }
            default -> System.out.println("Opcion invalida");
        }
    }
}
