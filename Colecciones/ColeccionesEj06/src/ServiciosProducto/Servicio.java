/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ServiciosProducto;

import Entidad.Producto;
import java.util.*;

public class Servicio {

    private final Scanner leer;
    private final HashMap<String, Integer> listaProductos;

    public Servicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaProductos = new HashMap<>();
    }

    public void crearProducto() {
        String res;
        while (true) {
            Producto nuevoProducto = new Producto();

            System.out.println("Ingrese el nombre del producto");
            String clave = leer.next();
            System.out.println("Ingrese el precio del producto");
            int valor = leer.nextInt();

            nuevoProducto.setNombre(clave);
            nuevoProducto.setPrecio(valor);
            listaProductos.put(clave, valor);
            System.out.println("Quiere crear otro producto?");
            res = leer.next();
            if (res.equals("no")) {
                menu();
                break;
            }
        }
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto a modificar");
        String producto = leer.next();
        int nuevoValor;

        if (listaProductos.containsKey(producto)) {
            System.out.println("Ingrese el nuevo valor");
            nuevoValor = leer.nextInt();
            listaProductos.replace(producto, nuevoValor);
        }
        mostrarProductos();
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar");
        String producto = leer.next();

        if (listaProductos.containsKey(producto)) {
            listaProductos.remove(producto);
        }
        mostrarProductos();
    }

    public void mostrarProductos() {
        System.out.println("Los productos son: ");

        for (Map.Entry<String, Integer> aux : listaProductos.entrySet()) {
            System.out.println(aux);
        }
        menu();
    }

    public void menu() {
        System.out.println("MENU");
        System.out.println("1) introducir producto");
        System.out.println("2) modificar precio");
        System.out.println("3) eliminar un producto");
        System.out.println("4) mostrar productos");
        int var = leer.nextInt();

        switch (var) {
            case 1 -> crearProducto();
            case 2 -> modificarPrecio();
            case 3 -> eliminarProducto();
            case 4 -> mostrarProductos();
            default -> {
                System.out.println("Opcion invalida");
                menu();
            }
        }
    }

}
