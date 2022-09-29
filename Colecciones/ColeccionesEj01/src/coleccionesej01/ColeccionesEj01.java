/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package coleccionesej01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColeccionesEj01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        List<String> razas = new ArrayList();
        
        boolean band = false;
        String res;
        
        while (!band) {
            System.out.println("Escriba la raza");
            String razaNombre = leer.next();
            razas.add(razaNombre);
            System.out.println("Quiere salir? S/N");
            res = leer.next();
            band = "S".equals(res) || "s".equals(res);
        }
        
        System.out.println(razas.size());
        System.out.println(razas);
        
        System.out.println("Ingrese la raza a eliminar");
        String razaElim = leer.next();
        razas.remove(razaElim);
        System.out.println(razas);
        
    }
    
}
